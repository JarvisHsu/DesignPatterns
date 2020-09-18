package cn.hellojarvis.creationalpattern.builder.mealbuilder;

import cn.hellojarvis.creationalpattern.builder.container.meal.Meal;
import cn.hellojarvis.creationalpattern.builder.product.food.impl.item.burger.ChickenBurger;
import cn.hellojarvis.creationalpattern.builder.product.food.impl.item.burger.VegBurger;
import cn.hellojarvis.creationalpattern.builder.product.food.impl.item.colddrink.Coke;
import cn.hellojarvis.creationalpattern.builder.product.food.impl.item.colddrink.Pepsi;

/**
 * @author Jarvis
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
