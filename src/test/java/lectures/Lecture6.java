package lectures;


import org.junit.Test;

import java.util.Arrays;
import java.util.function.Predicate;

public class Lecture6 {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer anyNum = Arrays.stream(numbers).filter(numbersLessThan10).findAny().get();
    System.out.println(anyNum);

  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer firstNum = Arrays.stream(numbers).filter(numbersLessThan10).findFirst().get();
    System.out.println(firstNum);
  }
}

