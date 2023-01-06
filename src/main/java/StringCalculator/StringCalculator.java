package StringCalculator;

import java.util.Scanner;

public class StringCalculator {

     Integer sumValue = 0;
     String operator = "+";

    public void start() {
        System.out.println("start");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        System.out.println(value);
        String[] values = value.split(" ");

        for(int i = 0; i < values.length; i++) {
            processDependOnOrder(i, values);
        }
        System.out.println(sumValue);
    }

    private void processDependOnOrder(Integer order, String[] arr) {
        if (order % 2 == 0) {
            processNumber(arr[order]);
            return;
        }
        processOperator(arr[order]);

    }

    private void processNumber(String numberStr) {
        Integer number = Integer.parseInt(numberStr);
        this.sumValue = calculate(this.sumValue, this.operator, number);
    }

    private void processOperator(String operator) {
        this.operator = operator;
    }

    public Integer calculate(Integer accumulateNumber,
                                    String operator,
                                    Integer number) throws IllegalArgumentException {
        if (operator.equals("+")) {
            return (accumulateNumber + number);
        }

        if (operator.equals("-")) {
            return (accumulateNumber - number);
        }

        if (operator.equals("*")) {
            return (accumulateNumber * number);
        }

        if (operator.equals("/")) {
            return (accumulateNumber / number);
        }
        throw new IllegalArgumentException("it isn't a normal operator");
    }
}
