package cn.hellojarvis.creationalpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jarvis
 */
public class LazyHandBetterSingleObjectTest {
    @Test
    public void LazyHandBetterSingletonTest(){
        LazyHandBetterSingleObject instance = LazyHandBetterSingleObject.getInstance();
        instance.getMessage();
    }

}