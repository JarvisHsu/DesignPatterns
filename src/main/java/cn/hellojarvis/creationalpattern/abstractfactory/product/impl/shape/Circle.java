package cn.hellojarvis.creationalpattern.abstractfactory.product.impl.shape;


import cn.hellojarvis.creationalpattern.abstractfactory.product.Shape;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 20:23
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是一个圆形");
    }
}
