package domain;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Balls {
    private Ball[] balls = new Ball[3];

    public Balls(String[] strings) {
        for (int i = 0; i < 3 ; i++) {
            Integer number = Integer.parseInt(strings[i]);
             balls[i] = new Ball(i+1, number);
        }
    }

    public List<PlayResult> compareWithBalls(Balls userBalls) {
        ArrayList<PlayResult> playResults= new ArrayList<>();
        for (Ball userBall : userBalls.balls) {
            playResults.add(this.compareWithBall(userBall));
        }
        return  playResults;
    }

    public PlayResult compareWithBall(Ball ball) {
        for (int i = 0; i < balls.length; i++) {
            PlayResult ballResult = balls[i].compare(ball);
            if (isStrike(ballResult) || isBall(ballResult)) {
                return ballResult;
            }
        }
        return PlayResult.NOTHING;
    }
    private Boolean isStrike(PlayResult playResult) {
        return playResult.equals(PlayResult.STRIKE);
    }

    private Boolean isBall(PlayResult playResult) {
        return playResult.equals(PlayResult.BALL);
    }
}
