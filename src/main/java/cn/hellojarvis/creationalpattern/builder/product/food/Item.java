package cn.hellojarvis.creationalpattern.builder.product.food;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : JarvisHsu
 * @create 2020/09/17 21:45
 * 食物条目
 */

public interface Item {
    public String name();
    public Packing packing();
    public float price();

}
