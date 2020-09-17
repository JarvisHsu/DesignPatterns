package cn.hellojarvis.creationalpattern.singleton;

/**
 * @author Jarvis
 *
 * 懒汉单例模式，改进版本。
 * 将实例创建变为线程安全型
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */
public class LazyHandGoodSingleObject {
    /**
     * 实例，此时为null
     */
    private static LazyHandGoodSingleObject instance;

    /**
     * 私有化构造器
     */
    private LazyHandGoodSingleObject(){}

    /**
     * 线程不安全式懒汉模式
     */
    public static synchronized LazyHandGoodSingleObject getInstance(){
        if (instance==null){
            instance = new LazyHandGoodSingleObject();
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("这是懒汉单例模式，线程安全但效率较低的版本");
    }
}
