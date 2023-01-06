package NumberBaseballGame;

import lombok.Getter;


public class RandomNumber {
    private final Integer randomNumber;

    public RandomNumber() {
        Double randomDouble = Math.floor(Math.random() * 1000);
        randomNumber = randomDouble.intValue();
    }

    public Integer get() {
        return randomNumber;
    }

    public String toString() {
        return randomNumber.toString();
    }

    public String[] toStringArray() {
        String str = randomNumber.toString();
        return str.split("");
    }
}
