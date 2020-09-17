package cn.hellojarvis.creationalpattern.simplefactory.factory;

import cn.hellojarvis.creationalpattern.simplefactory.product.Shape;
import cn.hellojarvis.creationalpattern.simplefactory.product.impl.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 20:42
 */
public class ShapeFactoryTest {
    @Test
    public void ShapeTest() {
        ShapeFactory instance = ShapeFactory.getInstance();
        Shape shape = instance.getShape(Circle.class);
        shape.draw();
    }
}