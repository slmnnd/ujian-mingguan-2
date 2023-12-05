package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest {
    @Test
    public void testAccount() {
        BankAccount depo = new BankAccount();
        double actual = depo.deposit(2.0);
        double expected = 2.0;

        Assert.assertEquals(actual, expected);

    }
}
