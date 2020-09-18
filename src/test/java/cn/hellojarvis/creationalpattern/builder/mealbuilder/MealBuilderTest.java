package cn.hellojarvis.creationalpattern.builder.mealbuilder;

import cn.hellojarvis.creationalpattern.builder.container.meal.Meal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jarvis
 */
public class MealBuilderTest {
    @Before
    public void BeforeTest(){
        System.out.println("测试开始");
    }
    @Test
    public void MealTest_01(){
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
    }
    @Test
    public void MealTest_02(){
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItems();
    }
    @After
    public void AfterTest(){
        System.out.println("测试结束");
    }
}