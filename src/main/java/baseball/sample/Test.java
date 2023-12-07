package baseball.sample;

import baseball.sample.domain.NumberGenerator;
import baseball.sample.domain.Referee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computer = generator.createRandomNumbers();
        Referee referee = new Referee();

        String result = "";
        while (!result.equals("0 볼 3 스트라이크")) {
            result = referee.compare(computer, askNumbers());
            System.out.println(result); // 3스트라이크
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료1");

    }

    public static List<Integer> askNumbers() {
        System.out.print("숫자를 입력해 주세요 : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}
