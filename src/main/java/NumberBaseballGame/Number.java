package NumberBaseballGame;


public class Number {
    private final Integer numer;

    public Number() {
        Double randomDouble = Math.floor(Math.random() * 1000);
        numer = randomDouble.intValue();
    }

    public Number(Integer number){
        this.numer = number;
    }

    public Integer get() {
        return numer;
    }

    public String toString() {
        return numer.toString();
    }

    public String[] toStringArray() {
        String str = numer.toString();
        return str.split("");
    }
}
