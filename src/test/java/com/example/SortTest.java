package com.example;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
public class SortTest {
    @Test
    public void sortTest() {
        int intArray[] = new int[]{3, 2, 1, 0};
        int dreamArray[] = new int[]{0, 1, 2, 3};
        int result[] = NumberSorting.sortingNumber(intArray);
        Assert.assertTrue(Arrays.equals(result, dreamArray));


    }
}
