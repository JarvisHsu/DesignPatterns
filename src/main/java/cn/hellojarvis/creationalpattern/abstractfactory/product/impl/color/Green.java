package cn.hellojarvis.creationalpattern.abstractfactory.product.impl.color;

import cn.hellojarvis.creationalpattern.abstractfactory.product.Color;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:09
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("这是绿色");
    }
}
