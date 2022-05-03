package lectures;

import beans.Person;
import java.util.List;
import java.util.stream.IntStream;
import mockdata.MockData;
import org.junit.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {
    IntStream.range(0, 10).forEach(System.out::println);

  }

  @Test
  public void rangeIteratingLists() throws Exception {
    // IntStream is used when you need the index
    List<Person> people = MockData.getPeople();
    IntStream.range(0, people.size()).forEach(i -> System.out.println(people.get(i)) );

  }

  @Test
  public void intStreamIterate() throws Exception {
  }
}
