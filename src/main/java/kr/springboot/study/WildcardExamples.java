package kr.springboot.study;

import java.util.ArrayList;
import java.util.List;

public class WildcardExamples {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(4);
        intList.add(6);

        List<String> strList = new ArrayList<>();
        strList.add("two");
        strList.add("four");
        strList.add("six");

        List<Object> objList = new ArrayList<>();
        objList.add("two");
        objList.add("four");
        objList.add(strList);

        printList(intList);
        printList(strList);
        printList(objList);

        checkList(intList, 3);
        checkList(strList, strList);
        checkList(objList, objList);

        checkNumber(intList, 3);

        /**
         * 2
         * 4
         * 6
         * two
         * four
         * six
         * two
         * four
         * [two, four, six]
         * false
         * false
         * false
         * false
         */

    }

    public static <T> void printList(List<T> myList) {
        myList.stream()
                .forEach(System.out::println);
    }

    public static <T> void checkList(List<?> myList, T obj) {
        if (myList.contains(obj))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static <T> void checkNumber(List<? extends Number> myList, T obj) {
        if (myList.contains(obj))
            System.out.println("true");
        else
            System.out.println("false");
    }

}
