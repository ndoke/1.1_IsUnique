package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsUniqueTest {
    IsUnique isUnique = new IsUnique();

    @Test
    public void test() {
        Assert.assertEquals(isUnique.hasUniqueCharacters(""), true);
        Assert.assertEquals(isUnique.hasUniqueCharacters("abcde"), true);
        Assert.assertEquals(isUnique.hasUniqueCharacters("abcdea"), false);
        Assert.assertEquals(isUnique.hasUniqueCharacters("ccdefty"), false);
        Assert.assertEquals(isUnique.hasUniqueCharacters("Cc"), true);
        Assert.assertEquals(isUnique.hasUniqueCharacters("ZAIETQ"), true);
        Assert.assertEquals(isUnique.hasUniqueCharacters("Zz"), true);

        Assert.assertEquals(isUnique.hasUniqueCharactersEfficiently(""), true);
        Assert.assertEquals(isUnique.hasUniqueCharactersEfficiently("abcde"), true);
        Assert.assertEquals(isUnique.hasUniqueCharactersEfficiently("abcdea"), false);
        Assert.assertEquals(isUnique.hasUniqueCharactersEfficiently("ccdefty"), false);
        Assert.assertEquals(isUnique.hasUniqueCharactersEfficiently("Cc"), true);
        Assert.assertEquals(isUnique.hasUniqueCharactersEfficiently("ZAIETQ"), true);
        Assert.assertEquals(isUnique.hasUniqueCharactersEfficiently("Zz"), true);
        Assert.assertEquals(isUnique.hasUniqueCharactersEfficiently("ZZ"), false);
    }
}
