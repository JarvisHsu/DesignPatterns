package cn.hellojarvis.creationalpattern.simplefactory.product.impl;

import cn.hellojarvis.creationalpattern.simplefactory.product.Shape;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 20:24
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("这是一个正方形");
    }
}
