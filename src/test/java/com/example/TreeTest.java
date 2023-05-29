package com.example;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

    @Test
    public void testTree() {
        Assert.assertEquals(StarTree.drawTree(3), "***\n" +
                " *" + "\n");


    }
}
