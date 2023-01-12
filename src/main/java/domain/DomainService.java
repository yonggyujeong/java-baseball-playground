package domain;

import java.util.List;

public class DomainService {

    public String play(String[] com, String[] user) {
        Balls comBalls = new Balls(com);
        Balls userBalls = new Balls(user);

        List<PlayResult> playResults = comBalls.compareWithBalls(userBalls);

        Integer strike = 0;
        Integer ball = 0;
        for (PlayResult playResult : playResults) {
            if (playResult.equals(PlayResult.STRIKE)){
                strike += 1;
            }
            if (playResult.equals(PlayResult.BALL)) {
                ball += 1;
            }
        }

        return convertToString(strike, ball);
    }

    private static String convertToString(Integer strike, Integer ball) {
        if (strike == 0 && ball == 0) {
            return "nothing";
        }
        String returnValue = "";
        if (strike > 0) {
            returnValue += strike + "스트라이크 ";
        }
        if (ball > 0) {
            returnValue += ball + "볼";
        }
        return returnValue;
    }


}
