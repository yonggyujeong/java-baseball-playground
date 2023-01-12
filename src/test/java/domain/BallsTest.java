package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {

    @Test
    void STRIKE_TEST() {
        String[] inputStrs = {"1", "2", "3"};
        Ball userBall = new Ball(1, 1);

        Balls balls = new Balls(inputStrs);
        PlayResult result = balls.compareWithBall(userBall);
        assertThat(result).isEqualTo(PlayResult.STRIKE);

    }

    @Test
    void BALL_TEST() {
        String[] inputStrs = {"1", "2", "3"};
        Ball userBall = new Ball(1, 2);

        Balls balls = new Balls(inputStrs);
        PlayResult result = balls.compareWithBall(userBall);
        assertThat(result).isEqualTo(PlayResult.BALL);
    }

    @Test
    void NOTHING_TEST() {
        String[] inputStrs = {"1", "2", "3"};
        Ball userBall = new Ball(1, 5);

        Balls balls = new Balls(inputStrs);
        PlayResult result = balls.compareWithBall(userBall);
        assertThat(result).isEqualTo(PlayResult.NOTHING);
    }
}
