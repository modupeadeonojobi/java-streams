package lectures;


import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();
    List<Car> carFiltered = cars.stream().filter(car -> car.getPrice() < 20000).limit(20).collect(Collectors.toList());
    carFiltered.forEach(System.out::println);

  }
//  PersonDTO::map is called method reference.
//  A static method called map() was created for this purpose.

  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();
    List<PersonDTO> personDTOS = people.stream().map(PersonDTO::map).collect(Collectors.toList());
    personDTOS.forEach(System.out::println);

  }

  //  Car::getPrice is called method reference.
  //  A method called getPrice() was created.

  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices
    ImmutableList<Car> cars = MockData.getCars();
    double carAveragePrice = cars.stream().mapToDouble(Car::getPrice).average().orElse(0);
    System.out.println(carAveragePrice);
  }

  @Test
  public void test() throws Exception {
    MockData.getCars().forEach(System.out::println);

  }
}



