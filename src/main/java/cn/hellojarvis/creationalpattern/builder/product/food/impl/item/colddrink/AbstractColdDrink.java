package cn.hellojarvis.creationalpattern.builder.product.food.impl.item.colddrink;

import cn.hellojarvis.creationalpattern.builder.product.food.Item;
import cn.hellojarvis.creationalpattern.builder.product.food.Packing;
import cn.hellojarvis.creationalpattern.builder.product.food.impl.packing.Bottle;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:53
 */
public abstract class AbstractColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
