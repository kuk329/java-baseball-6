package baseball.sample;

import baseball.sample.domain.Judgment;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        NumberGenerator generator = new NumberGenerator();
//        List<Integer> numbers = generator.createRandomNumbers();
//        System.out.println(numbers);

        Judgment judgment = new Judgment();
//        int count = judgment.correctCount(
//                Arrays.asList(1, 2, 3), Arrays.asList(2, 8, 9)
//        );
//        System.out.println(count);
        boolean b = judgment.hasPlace(Arrays.asList(7, 8, 9), 1, 8);
        System.out.println(b);
    }
}
