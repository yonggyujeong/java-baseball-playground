package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void STRIKE_RESULT() {
        Ball com = new Ball(1, 2);
        PlayResult result = com.compare(new Ball(1, 2));
        Assertions.assertThat(result).isEqualTo(PlayResult.STRIKE);
    }

    @Test
    void BALL_RESULT() {
        Ball com = new Ball(1, 2);
        PlayResult result = com.compare(new Ball(2, 2));
        Assertions.assertThat(result).isEqualTo(PlayResult.BALL);
    }

    @Test
    void NOTHING_RESULT() {
        Ball com = new Ball(1, 2);
        PlayResult result = com.compare(new Ball(2, 4));
        Assertions.assertThat(result).isEqualTo(PlayResult.NOTHING);
    }

}
