package kr.springboot.study;

public class GenericNumberContainer <T extends Number> {

    private T obj;

    public GenericNumberContainer() {
    }

    public GenericNumberContainer(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}
