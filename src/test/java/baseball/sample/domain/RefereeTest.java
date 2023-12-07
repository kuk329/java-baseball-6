package baseball.sample.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RefereeTest {
    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);

    private Referee referee;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @Test
    void 스트라이크3() {
        String compare = referee.compare(ANSWER, Arrays.asList(1, 2, 3));

        assertThat(compare).isEqualTo("0 볼 3 스트라이크");
    }

    @Test
    void 낫싱() {
        String result = referee.compare(ANSWER, Arrays.asList(7, 8, 9));

        assertThat(result).isEqualTo("낫싱");
    }

    @Test
    void 볼3() {
        String compare = referee.compare(ANSWER, Arrays.asList(2, 3, 1));

        assertThat(compare).isEqualTo("3 볼 0 스트라이크");
    }

    @Test
    void 볼2스트라이크1() {
        String compare = referee.compare(ANSWER, Arrays.asList(1, 3, 2));

        assertThat(compare).isEqualTo("2 볼 1 스트라이크");
    }
}