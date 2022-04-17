package kr.springboot.study;

import java.util.function.Consumer;

public class CalculatorExample {

    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;

        float floatValue = Calculator.addFloat(2f, 3f);
        printConsumer(consumer, "Float value is " + floatValue);

        int intValue = Calculator.addInteger(3, 4);
        printConsumer(consumer, "Integer value is " + intValue);

        double genericValue1 = Calculator.add(3, 3f);
        printConsumer(consumer, "The int + float result is " + genericValue1);

        double genericValue2 = Calculator.add(7.54, 174);
        printConsumer(consumer, "The double + int result is " + genericValue2);

        /**
         * Float value is 5.0
         * Integer value is 7
         * The int + float result is 6.0
         * The double + int result is 181.54
         */

    }

    public static void printConsumer(Consumer<String> consumer, String msg) {
        consumer.accept(msg);
    }

}
