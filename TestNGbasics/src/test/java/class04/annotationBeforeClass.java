package class04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class annotationBeforeClass {
    @BeforeClass
    public void heelo(){
        System.out.println("I am before class");
    }
    @Test
    public void testB(){
        System.out.println("I am test B");
    }
}
