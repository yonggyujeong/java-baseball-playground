package NumberBaseballGame;

import java.util.Scanner;

public class NumberBaseballGameService {
    public void process() {
        Number number = new Number();
        Number inputNumber = numberInput();

    }

    private Number numberInput() {
        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt();
        return new Number(input);
    }
}
