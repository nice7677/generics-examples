package kr.springboot.study;

/**
 * Generic Container
 * @param <T>
 */
public class GenericContainer<T> {

    private T obj;

    public GenericContainer() {
    }

    public GenericContainer(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}
