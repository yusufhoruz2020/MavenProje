package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

    @BeforeClass
    public static void setUp(){
        System.out.println("Setup calıstı..");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("TearDown calıstı..");
    }
    @Before
    public void methoddanOnce(){
        System.out.println("methoddanOnce calıstı.");
    }
    @After
    public void methoddanSonra(){
        System.out.println("methoddanSonra calıstı..");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 calıstı..");
    }
    @Test
    public void test2(){
        System.out.println("Test 2 calıstı..");
    }


}
