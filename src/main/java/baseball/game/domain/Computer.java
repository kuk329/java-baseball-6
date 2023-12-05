package baseball.game.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    // 컴퓨터에서 랜덤 숫자를 뽑음.
    private List<Integer> numbers = new ArrayList<>();

    public Computer() {
        while (numbers.size() < 3) { // 컴퓨터가 지정한 숫자 3개
            int randomNumber = Randoms.pickNumberInRange(1, 9);

            if (!numbers.contains(randomNumber)) { // 중복되는 수를 없애기 위해서
                numbers.add(randomNumber);
            }
        }
//        System.out.println("컴퓨터가 고른 숫자");
//        System.out.println(numbers);

    }

    public List<Integer> getComputerNum() {
        return numbers;
    }
}

