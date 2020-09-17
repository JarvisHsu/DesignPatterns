package cn.hellojarvis.creationalpattern.singleton;

import org.junit.Test;

/**
 * @author Jarvis
 */
public class HungryHandSingleObjectTest {

    @Test
    public void SingletonTest() {
        HungryHandSingleObject instance = HungryHandSingleObject.getInstance();
        instance.showMessage();
    }
}