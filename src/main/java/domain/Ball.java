package domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Ball {
    private final Integer position;
    private final Integer number;

    public PlayResult compare(Ball userBall) {
        if (position.equals(userBall.position) && number.equals(userBall.number)) {
            return PlayResult.STRIKE;
        }
        if (number.equals(userBall.number)) {
            return PlayResult.BALL;
        }
        return PlayResult.NOTHING;
    }

}
