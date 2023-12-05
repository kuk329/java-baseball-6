package baseball.game;

import baseball.game.view.OutputView;
import java.util.List;
import java.util.Objects;

public class GameService {

    private final OutputView outputView = new OutputView();

    public boolean compareNumberBetweenUserAndComputer(List<Integer> userNum, List<Integer> computerNum) {

        int ball = calculateBallCount(userNum, computerNum);
        int strike = calculateStrikeCount(userNum, computerNum);

        if (ball == 0 && strike == 0) { // 낫띵
            outputView.printNothing();
            return false;
        }

        ball = ball - strike;

        if (strike == 3) { // 스트라이크
            outputView.printAllStrike();
            return true;
        }

        if (ball != 0 && strike != 0) { // ball 과 strike 둘다 존재
            outputView.printBallAndStrike(ball, strike);
            return false;
        }

        if (ball != 0) {
            outputView.printBall(ball);
            return false;
        }

        outputView.printStrike(strike); // strike 만 존재
        return false;
    }

    private int calculateBallCount(List<Integer> userNum, List<Integer> computerNum) { // 몇개의 숫자가 일치하는지
        int ball = 0;
        for (Integer num : userNum) {
            if (computerNum.contains(num)) {
                ball += 1;
            }
        }
        return ball;
    }

    private int calculateStrikeCount(List<Integer> userNum, List<Integer> computerNum) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(userNum.get(i), computerNum.get(i))) {
                strike++;
            }
        }
        return strike;
    }
}
