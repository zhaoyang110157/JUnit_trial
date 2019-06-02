package com.unit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void judgeTriangle() {

        int result = triangle.JudgeTriangle( 1,1,1);
        Assert.assertEquals("判定有问题",1,result);
    }

    @Test
    public void jdugeDTriangle() {
        int result = triangle.JudgeRTriangle(3,4,5);
        Assert.assertEquals("直角有问题",1,result);
    }

    @Test
    public void judgeRTriangle() {
        int result = triangle.JudgeDTriangle(3,4,5);
        Assert.assertEquals("等腰有问题",0,result);
    }
    @Test
    public void main() {
    }
}