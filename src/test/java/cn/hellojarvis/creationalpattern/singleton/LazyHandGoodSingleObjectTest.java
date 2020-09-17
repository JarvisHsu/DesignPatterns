package cn.hellojarvis.creationalpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jarvis
 */
public class LazyHandGoodSingleObjectTest {
    @Test
    public void LazyHandGoodSingleton(){
        LazyHandGoodSingleObject instance = LazyHandGoodSingleObject.getInstance();
        instance.getMessage();
    }

}