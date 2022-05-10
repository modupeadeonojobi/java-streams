package lectures;

import beans.Person;
import mockdata.MockData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture12 {

 /* If you want to have control and don't want to use Collector.toList,
  you can use .collect(ArrayList::new, ArrayList::add, ArrayList::addAll)*/

  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(Collectors.toList());

    emails.forEach(System.out::println);
  }
}
