package lectures;

import beans.Person;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class Lecture1 {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people

        int counter = 0;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getAge() <= 18 && counter != 10) {
                counter++;
                System.out.println(people.get(i));
            }
        }
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        ImmutableList<Person> people = MockData.getPeople();
        people.stream().filter(person -> person.getAge() <= 18).limit(10).collect(Collectors.toList()).forEach(System.out::println);
    }

}
