package cn.hellojarvis.creationalpattern.builder.product.food.impl.item.colddrink;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:57
 * 实体类--可口可乐
 */
public class Coke extends AbstractColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
