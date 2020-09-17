package cn.hellojarvis.creationalpattern.abstractfactory.factory;

import cn.hellojarvis.creationalpattern.abstractfactory.product.Color;
import cn.hellojarvis.creationalpattern.abstractfactory.product.Shape;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:25
 */
public class ColorMiscFactory extends AbstractMiscFactory {
    private volatile static ColorMiscFactory instance;

    private ColorMiscFactory() {
    }

    /**
     * 懒汉DCL
     *
     * @return
     */
    public static ColorMiscFactory getInstance() {
        if (instance == null) {
            synchronized (ColorMiscFactory.class) {
                if (instance == null) {
                    instance = new ColorMiscFactory();
                }
            }
        }
        return instance;
    }

    @Override
    public Shape getShape(Class<? extends Shape> shapeType) {
        return null;
    }

    @Override
    public Color getColor(Class<? extends Color> colorType) {
        Color color = null;
        try {
            color = (Color) Class.forName(colorType.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return color;
    }
}
