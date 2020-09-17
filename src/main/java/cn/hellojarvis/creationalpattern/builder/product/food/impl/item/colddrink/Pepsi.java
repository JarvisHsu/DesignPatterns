package cn.hellojarvis.creationalpattern.builder.product.food.impl.item.colddrink;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:58
 * 实体类--百事可乐
 */
public class Pepsi extends AbstractColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
