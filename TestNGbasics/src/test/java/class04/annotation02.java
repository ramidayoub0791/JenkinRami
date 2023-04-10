package class04;

import org.testng.annotations.*;

public class annotation02 {
    @BeforeTest
    public void beforTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }

    @BeforeMethod
    public void before(){
        System.out.println("before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("after method");
    }
    @Test
    public void TestA(){
        System.out.println("I am test A");
    }
    @Test
    public void TestB(){
        System.out.println("I am test B");
    }
}
