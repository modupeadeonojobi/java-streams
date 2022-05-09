package lectures;


import org.junit.Test;

import java.util.Arrays;

public class Lecture9 {

  @Test
  public void reduce() throws Exception {
    Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};

    // Integer::sum is same as .reduce(0, (a,b) -> a+b)
    Integer sum = Arrays.stream(integers).reduce(0, Integer::sum);
    System.out.println(sum);

  }

  @Test
  public void stringReduce() throws Exception {
    String[] string = {"a", "b", "c", "d", "e", "f", "g"};

    String stringReduce = Arrays.stream(string).reduce("", String::concat);
    System.out.println(stringReduce);

  }


}

