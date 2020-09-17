package cn.hellojarvis.creationalpattern.builder.product.food.impl.item.burger;

import cn.hellojarvis.creationalpattern.builder.product.food.Item;
import cn.hellojarvis.creationalpattern.builder.product.food.Packing;
import cn.hellojarvis.creationalpattern.builder.product.food.impl.packing.Wrapper;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:51
 */
public abstract class AbstractBurger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
