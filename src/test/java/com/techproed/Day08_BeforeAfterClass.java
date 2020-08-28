package com.techproed;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day08_BeforeAfterClass {
    @BeforeClass // bu annotaion a sahip method her class calismadan önce calisir
    public static void setup(){

        System.out.println("Setup calisti.");
    }

    @Test
    public void test1(){
        System.out.println("Test1 calisti.");
    }
    @Test
    public void test2(){
        System.out.println("Test2 calisti.");
    }
    @AfterClass // bu annotationa sahip method her classtaki tester calistirildiktan sonra calisir
    public static void tearDown(){
        System.out.println("tearDown calisti.");
    }
}
