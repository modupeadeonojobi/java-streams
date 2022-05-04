package lectures;


import beans.Car;
import mockdata.MockData;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;

public class Lecture7 {

  private final Predicate<Car> getYellowCars =  car -> car.getColor().equalsIgnoreCase("yellow");


  @Test
  public void count() throws Exception {
    long totalFemale = MockData.getPeople().stream().filter(person -> person.getGender().equalsIgnoreCase("female")).count();
    System.out.println(totalFemale);

  }

  @Test
  public void min() throws Exception {
    double minPriceOfYellowCars = MockData.getCars().stream()
            .filter(getYellowCars)
            .mapToDouble(Car::getPrice).min().getAsDouble();
    System.out.println(minPriceOfYellowCars);
  }


  @Test
  public void max() throws Exception {
    double maxPriceOfYellowCars = MockData.getCars().stream()
            .filter(getYellowCars)
            .mapToDouble(Car::getPrice).max().orElse(0);
    System.out.println(maxPriceOfYellowCars);
  }


  @Test
  public void average() throws Exception {
    double averagePriceOfYellowCars = MockData.getCars()
            .stream()
            .filter(getYellowCars)
            .mapToDouble(Car::getPrice).average().orElse(0);
    System.out.println(averagePriceOfYellowCars);

  }

  @Test
  public void sum() throws Exception {
    List<Car> cars = MockData.getCars();
    double sum = cars.stream()
        .mapToDouble(Car::getPrice)
        .sum();
    BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
    System.out.println(bigDecimalSum);
    System.out.println(sum);

  }

  @Test
  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
    DoubleSummaryStatistics doubleSummaryStatistics = cars.stream()
            .mapToDouble(Car::getPrice)
            .summaryStatistics();
    System.out.println(doubleSummaryStatistics.getCount());
    System.out.println(doubleSummaryStatistics.getMin());
    System.out.println(doubleSummaryStatistics.getMax());
    System.out.println(doubleSummaryStatistics.getAverage());
    System.out.println(BigDecimal.valueOf(doubleSummaryStatistics.getSum()));
  }

}