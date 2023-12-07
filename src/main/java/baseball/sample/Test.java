package baseball.sample;

import baseball.sample.domain.NumberGenerator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers);

    }
}
