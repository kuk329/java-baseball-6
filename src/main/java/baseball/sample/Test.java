package baseball.sample;

import baseball.sample.domain.Referee;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(3, 1, 2), Arrays.asList(5, 8, 9));
        System.out.println(result); // 3스트라이크
    }
}
