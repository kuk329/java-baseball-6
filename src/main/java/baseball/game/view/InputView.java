package baseball.game.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private final String RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public String inputNumbers() {
        System.out.print(INPUT_MESSAGE);
        String input = Console.readLine();
        validateInputNull(input);
        return input;
    }

    public String restartMessage() {
        System.out.println(RESTART_MESSAGE);
        String input = Console.readLine();
        validateInputNull(input);
        return input;
    }

    private void validateInputNull(String input) { // 빈값 체크
        if (input.isEmpty()) {
            throw new IllegalArgumentException("값을 입력해 주세요.");
        }

    }

}
