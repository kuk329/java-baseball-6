package baseball.sample.domain;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JudgmentTest {


    @DisplayName("컴퓨터 숫자 3개와 사용자 숫자 3개가 일치하는 갯수를 출력한다.")
    @Test
    void correctCount() {
        // given
        List<Integer> computer = Arrays.asList(1, 2, 3);
        List<Integer> player = Arrays.asList(2, 3, 4);
        Judgment judgment = new Judgment();

        // when
        int result = judgment.correctCount(computer, player);

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @DisplayName("컴퓨터 숫자 배열에 같은 위치에 같은 값이 존재하는지를 확인한다.")
    @Test
    void hasPlace() {
        List<Integer> computer = Arrays.asList(1, 2, 3);
        Judgment judgment = new Judgment();

        boolean result1 = judgment.hasPlace(computer, 0, 1);
        boolean result2 = judgment.hasPlace(computer, 0, 2);

        Assertions.assertThat(result1).isEqualTo(true);
        Assertions.assertThat(result2).isEqualTo(false);
    }


}