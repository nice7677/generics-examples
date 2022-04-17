package kr.springboot.study;

public class GenericNumberContainerExamples {

    public static void main(String[] args) {

        GenericNumberContainer<Integer> genericNumberContainer = new GenericNumberContainer<>();
        genericNumberContainer.setObj(33333);
        System.out.println(genericNumberContainer.getObj());
        // result 33333

    }

}
