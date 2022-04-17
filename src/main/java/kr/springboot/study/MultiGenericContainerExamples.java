package kr.springboot.study;

public class MultiGenericContainerExamples {

    public static void main(String[] args) {

        MultiGenericContainer<String, String> mondayWeather =
                new MultiGenericContainer<>("Monday", "Rainy");
        MultiGenericContainer<Integer, Float> dayOfWeekDegrees =
                new MultiGenericContainer<>(1, 1.22f);

        System.out.printf("monday weather.....\n 1st -> %s, 2nd -> %s", mondayWeather.getFirstPosition(), mondayWeather.getSecondPosition());

        System.out.printf("doy of week degrees.....\n 1st -> %d, 2nd -> %f", dayOfWeekDegrees.getFirstPosition(), dayOfWeekDegrees.getSecondPosition());

        /**
         * result
         *  1st -> Monday, 2nd -> Rainydoy of week degrees.....
         *  1st -> 1, 2nd -> 1.220000
         */

        mondayWeather.setSecondPosition("Cloudy");

        System.out.printf("monday weather.....\n 1st -> %s, 2nd -> %s", mondayWeather.getFirstPosition(), mondayWeather.getSecondPosition());

        //  1st -> Monday, 2nd -> Cloudy

    }

}
