package cn.hellojarvis.creationalpattern.singleton;

/**
 * @author Jarvis
 */
public enum HungryHandEasySingleObject {
    /**
     * 实例
     */
    INSTANCE;

    /**
     * 自定义方法
     */

    public void getMessage() {
        System.out.println("这是饿汉单例，枚举实现简洁版本");
    }
}
