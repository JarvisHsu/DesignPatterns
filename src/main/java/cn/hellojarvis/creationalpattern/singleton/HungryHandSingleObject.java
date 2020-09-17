package cn.hellojarvis.creationalpattern.singleton;

/**
 * @author Jarvis
 * 单例模式，私有化构造器
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * 实现饿汉单例模式
 */
public class HungryHandSingleObject {
    private static HungryHandSingleObject instance = new HungryHandSingleObject();

    /**
     * 私有化构造器，不允许其他类创建本类实例对象
     */
    private HungryHandSingleObject() {
    }
    /**
     * 通过该方法获取实例
     */
    public static HungryHandSingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("这是饿汉单例模式");
    }


}
