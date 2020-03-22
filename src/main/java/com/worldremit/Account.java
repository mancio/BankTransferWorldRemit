package com.worldremit;

import java.util.Date;
import java.util.Objects;

public class Account {
  public String number;
  public Date createdAt;
  public double balance;

  public Account(String number, Date createdAt) {
    this.number = number;
    this.createdAt = createdAt;
    this.balance = 0;
  }

  synchronized void deposit(double amount) {
    balance += amount;
  }

  synchronized void withdraw(double amount) {
    balance -= amount;
  }

  @Override public boolean equals(Object o) {
    if(this == o)
      return true;
    if(!(o instanceof Account))
      return false;
    Account account = (Account) o;
    return Objects.equals(number, account.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number);
  }
}
