package cn.hellojarvis.creationalpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jarvis
 */
public class HungryHandEasySingleObjectTest {

    @Test
    public void HungryHandEasySingletonTest(){
        HungryHandEasySingleObject instance = HungryHandEasySingleObject.INSTANCE;
        instance.getMessage();
    }
}