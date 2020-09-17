package cn.hellojarvis.creationalpattern.builder.product.food.impl.item.burger;

import cn.hellojarvis.creationalpattern.builder.product.food.Packing;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:56
 * 实体类--鸡肉汉堡
 */
public class ChickenBurger extends AbstractBurger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
