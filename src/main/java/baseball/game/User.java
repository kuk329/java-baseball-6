package baseball.game;

import java.util.ArrayList;
import java.util.List;

public class User {
    // 사용자 한테 값을 입력받음.
    private List<Integer> numbers = new ArrayList<>();


    public void setUserNumbers(String input) {

        validateNumber(input);

        for (int i = 0; i < input.length(); i++) {
            int number = Integer.parseInt(input.substring(i, i + 1));
            validateDuplicateNumber(number);
            numbers.add(number);
        }

        validateListLength();

    }

    public List<Integer> getNumbers() {
        return numbers;

    }

    /**
     * 예외 처리
     */

    private void validateNumber(String numbers) {
        final String REGEX = "[1-9]+";
        if (!numbers.matches(REGEX)) {
            throw new IllegalArgumentException("1~9 이외의 숫자는 입력할 수 없습니다.");
        }
    }

    private void validateListLength() {
        if (numbers.size() != 3) {
            throw new IllegalArgumentException("세자리 숫자만 입력할 수 있습니다.");
        }

    }

    private void validateDuplicateNumber(int number) {
        if (numbers.contains(number)) {
            throw new IllegalArgumentException("중복된 숫자는 입력할 수 없습니다.");
        }

    }


}
