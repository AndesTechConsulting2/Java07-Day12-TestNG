package org.andestech.learning.rfb18.g2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest2
{
    private static int[] arr1 = {1,2,3};
    private static int[] arr2 ;

    @Test(dependsOnGroups= {"Select1"})
    //@Ignore
    public void testCase05()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotNull(arr1);
        Assert.assertTrue(true);
    }
}
