package cn.hellojarvis.creationalpattern.builder.container.meal;

import cn.hellojarvis.creationalpattern.builder.product.food.Item;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jarvis
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost+=item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("商品名称 : "+item.name());
            System.out.print(", 打包类型 : "+item.packing().pack());
            System.out.println(", 单价 : "+item.price());
        }
    }
}

