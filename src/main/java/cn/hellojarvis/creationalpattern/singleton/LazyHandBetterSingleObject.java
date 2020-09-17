package cn.hellojarvis.creationalpattern.singleton;

/**
 * @author Jarvis
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * volatile是一个特征修饰符（type specifier）.volatile的作用是作为指令关键字，
 * 确保本条指令不会因编译器的优化而省略，且要求每次直接读值。
 */
public class LazyHandBetterSingleObject {
    private volatile static LazyHandBetterSingleObject instance;

    /**
     * 私有化构造器
     */
    private LazyHandBetterSingleObject(){}

    /**
     *双重锁机制，DCL(Double-checked locking)
     */
    public static LazyHandBetterSingleObject getInstance(){
        if (instance==null){
            synchronized (LazyHandBetterSingleObject.class){
                if (instance==null){
                    instance = new LazyHandBetterSingleObject();
                }
            }
        }
        return instance;
    }

    public void getMessage(){
        System.out.println("这是懒汉单例模式，线程安全且高效的版本");
    }



}
