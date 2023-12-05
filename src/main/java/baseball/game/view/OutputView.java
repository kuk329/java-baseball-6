package baseball.game.view;

public class OutputView {

    private final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";


    public void startMessage() {
        System.out.println(START_MESSAGE);
    }


    public void printNothing() {
        System.out.println("낫싱");
    }

    public void printBall(int ball) {
        System.out.printf("%d볼\n", ball);
    }

    public void printStrike(int strike) {
        System.out.printf("%d스트라이크\n", strike);
    }

    public void printBallAndStrike(int ball, int strike) {
        System.out.printf("%d볼 %d스트라이크\n", ball, strike);
    }

    public void printAllStrike() {
        System.out.println("3스트라이크");
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }


}
