package com.worldremit;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

  @Test
  public void testBalance() {
    Account account = new Account("1", new Date());
    account.balance = 1;

    assertEquals(1d, account.balance);
  }

  @Test
  public void testDeposit() {
    Account account = new Account("1", new Date());
    account.balance = 1;
    account.deposit(new Double("0.5"));

    assertEquals(1.5, account.balance);
  }
}
