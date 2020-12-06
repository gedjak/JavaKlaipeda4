package basics;

import org.junit.jupiter.api.*;

import java.net.PortUnreachableException;

public class Example1 {

    @BeforeAll
    static void setUp(){
        System.out.println("BeforeAll test displayed before all testing methods");
    }
    @AfterAll
    public static void AfterAll(){
        System.out.println("AfterAll testingMethod");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("AfterEach testing method");
    }
    @BeforeEach
    public void  init(){
        System.out.println("BeforeEach testing method");
    }
    @Test
    public void firstTest() {
        System.out.println("Executing first test...");
    }
    @Test
    public void secondTest(){
        System.out.println("Executing second test...");
    }
    @Test
    @DisplayName("Any text")
    public void thirdTest(){
        System.out.println("Third test");
    }
    @Test
    @Disabled
    public void fourthTest(){
        System.out.println("fourth test");
    }
}
