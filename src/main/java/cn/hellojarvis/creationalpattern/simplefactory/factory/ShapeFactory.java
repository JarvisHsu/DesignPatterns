package cn.hellojarvis.creationalpattern.simplefactory.factory;

import cn.hellojarvis.creationalpattern.simplefactory.product.Shape;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 20:26
 * 使用单例模式实现简单工厂
 */
public class ShapeFactory {
    private volatile static ShapeFactory instance;

    private ShapeFactory() {
    }

    /**
     * 懒汉DCL模式
     *
     * @return
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            synchronized (ShapeFactory.class) {
                if (instance == null) {
                    instance = new ShapeFactory();
                }
            }
        }
        return instance;
    }

    public Shape getShape(Class<? extends Shape> shapeType) {
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(shapeType.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shape;
    }
}
