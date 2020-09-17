package cn.hellojarvis.creationalpattern.abstractfactory.factory;

import cn.hellojarvis.creationalpattern.abstractfactory.product.Color;
import cn.hellojarvis.creationalpattern.abstractfactory.product.Shape;
import cn.hellojarvis.creationalpattern.abstractfactory.product.impl.color.Red;
import cn.hellojarvis.creationalpattern.abstractfactory.product.impl.shape.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:35
 */
public class AbstractMiscFactoryTest {

    @Test
    public void ShapeMiscTest(){
        ShapeMiscFactory instance = ShapeMiscFactory.getInstance();
        Shape shape = instance.getShape(Circle.class);
        shape.draw();
    }
    @Test
    public void ColorMiscTest(){
        ColorMiscFactory instance = ColorMiscFactory.getInstance();
        Color color = instance.getColor(Red.class);
        color.fill();
    }
}