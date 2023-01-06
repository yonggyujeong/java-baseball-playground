package NumberBaseballGame;


public class Number {
    private final Integer number;

    public Number() {
        Double randomDouble = Math.floor(Math.random() * 1000);
        number = randomDouble.intValue();
    }

    public Number(Integer number){
        this.number = number;
    }

    public Integer get() {
        return number;
    }

    public String toString() {
        return number.toString();
    }

    public String[] toStringArray() {
        String str = number.toString();
        return str.split("");
    }
}
