package cn.hellojarvis.creationalpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jarvis
 */
public class LazyHandSingleObjectTest {
    @Test
    public void LazyHandSingletonTest() {
        LazyHandSingleObject instance = LazyHandSingleObject.getInstance();
        instance.getMessage();
    }

}