package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    // 1. Find people aged less or equal 18
    // 2. Then change implementation to find first 10 people

    int counter = 0;
    for (int i = 0; i < 50; i++) {
      if (people.get(i).getAge() <= 18 && counter != 10) {
        counter++;
        System.out.println(people.get(i));
      }
    }
  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();

  }
}
