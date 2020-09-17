package cn.hellojarvis.creationalpattern.builder.product.food.impl.packing;

import cn.hellojarvis.creationalpattern.builder.product.food.Packing;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:49
 * 瓶子包装
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
