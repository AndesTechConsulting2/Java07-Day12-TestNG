package org.andestech.learning.rfb18.g2;


import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest
{
    private static int[] arr1 = {1,2,3};
    private static int[] arr2 ;

    @Test(priority = 1000)
    public void testCase01()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr1);
        Assert.assertTrue(true);
    }

    @Test(enabled = true)
    public void testCase02()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr1);
        Assert.assertTrue(true);
    }

    @Test(groups = {"Select1"})
    //@Ignore
    public void testCase03()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr1);
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"testCase03"})
    //@Ignore
    public void testCase04()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr1);
        Assert.assertTrue(true);
    }
}
