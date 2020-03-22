package com.worldremit;

import java.security.InvalidParameterException;

public class TransferService extends UtilTransfer {
  private static final double INT_FEE = 0.1;
  private static final double PRIO_FEE = 5;

  public synchronized void makeTransfer(Transfer t) {
    if (t == null) throw new Error();
    else if (t.type == null) throw new Error();
    else if (t.fromAccount == null) throw new IllegalStateException();
    else if (t.toAccount == null) throw new InvalidParameterException();

    t.fromAccount.withdraw(t.amount);
    t.toAccount.deposit(t.amount);
    internationalTransfer(t);
    prioTransfer(t);
  }
}
