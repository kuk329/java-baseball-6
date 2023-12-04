package baseball.game.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final String INPUT_MESSAGE = "숫자를 입력해주세요 :";

    public void inputNumbers() {
        System.out.println(INPUT_MESSAGE);
        String numbers = Console.readLine();
        validateInputNull(numbers);

    }

    private void validateInputNull(String input) { // 빈값 체크
        if (input.isEmpty()) {
            throw new IllegalArgumentException("값을 입력해 주세요.");
        }

    }

}
