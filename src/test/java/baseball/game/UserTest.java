package baseball.game;


import baseball.game.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    public void 입력받은_숫자가_3개보다_많을때() {
        String input = "1234";
        User user = new User();

        Assertions.assertThatThrownBy(() ->
                        user.setUserNumbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("세자리 숫자만 입력할 수 있습니다.");

    }

    @Test
    public void 입력받은_숫자가_3개보다_적을때() {
        String input = "45";
        User user = new User();

        Assertions.assertThatThrownBy(() ->
                        user.setUserNumbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("세자리 숫자만 입력할 수 있습니다.");

    }

    @Test
    public void inputOutOfRangeInBetweenOneAndNine() {
        String input = "023";
        User user = new User();

        Assertions.assertThatThrownBy(() ->
                        user.setUserNumbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("1~9 이외의 숫자는 입력할 수 없습니다.");

    }


    @Test
    public void 입력받은_숫자가_중복일때() {
        String input = "232";
        User user = new User();

        Assertions.assertThatThrownBy(() ->
                        user.setUserNumbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("중복된 숫자는 입력할 수 없습니다.");

    }

}