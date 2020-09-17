package cn.hellojarvis.creationalpattern.singleton;

/**
 * @author Jarvis
 *
 * 懒汉单例模式，调用时才创建实例
 */
public class LazyHandSingleObject {
    /**
     * 实例，此时为null
     */
    private static LazyHandSingleObject instance;

    /**
     * 私有化构造器
     */
    private LazyHandSingleObject(){}

    /**
     * 线程不安全式懒汉模式
     */
    public static LazyHandSingleObject getInstance(){
        if (instance==null){
            instance = new LazyHandSingleObject();
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("这是懒汉单例模式，线程不安全版本");
    }
}
