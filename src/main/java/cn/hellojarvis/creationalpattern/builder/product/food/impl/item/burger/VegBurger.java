package cn.hellojarvis.creationalpattern.builder.product.food.impl.item.burger;

import cn.hellojarvis.creationalpattern.builder.product.food.Packing;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:54
 * 实体类--蔬菜汉堡
 */
public class VegBurger extends AbstractBurger {
    @Override
    public String name() {
        return "Veg Burger";
    }
    @Override
    public float price() {
        return 25.0f;
    }
}
