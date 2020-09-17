package cn.hellojarvis.creationalpattern.abstractfactory.product.impl.shape;

import cn.hellojarvis.creationalpattern.abstractfactory.product.Shape;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 20:24
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("这是一个三角形");
    }
}
