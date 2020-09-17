package cn.hellojarvis.creationalpattern.abstractfactory.factory;

import cn.hellojarvis.creationalpattern.abstractfactory.product.Color;
import cn.hellojarvis.creationalpattern.abstractfactory.product.Shape;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:24
 */
public class ShapeMiscFactory extends AbstractMiscFactory {
    private volatile static ShapeMiscFactory instance;

    private ShapeMiscFactory() {
    }

    /**
     * 懒汉DCL
     *
     * @return
     */
    public static ShapeMiscFactory getInstance() {
        if (instance == null) {
            synchronized (ShapeMiscFactory.class) {
                if (instance == null) {
                    instance = new ShapeMiscFactory();
                }
            }
        }
        return instance;
    }


    @Override
    public Shape getShape(Class<? extends Shape> shapeType) {
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(shapeType.getName()).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return shape;
    }

    @Override
    public Color getColor(Class<? extends Color> colorType) {
        return null;
    }
}
