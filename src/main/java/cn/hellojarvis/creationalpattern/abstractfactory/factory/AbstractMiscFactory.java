package cn.hellojarvis.creationalpattern.abstractfactory.factory;

import cn.hellojarvis.creationalpattern.abstractfactory.product.Color;
import cn.hellojarvis.creationalpattern.abstractfactory.product.Shape;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:17
 */
public abstract class AbstractMiscFactory {
    public abstract Shape getShape(Class<?extends Shape> shapeType);
    public abstract Color getColor(Class<?extends Color> colorType);
}
