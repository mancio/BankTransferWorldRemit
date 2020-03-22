package com.worldremit;

abstract class UtilTransfer {

  private static final double INT_FEE = 0.1;
  private static final double PRIO_FEE = 5;

  public void internationalTransfer(Transfer t) {
    if (t.type == TransferType.INTERNATIONAL) {
      t.fromAccount.withdraw(INT_FEE * t.amount);
    }
  }

  public void prioTransfer(Transfer t) {
    if (t.type == TransferType.PRIORITY) {
      t.fromAccount.withdraw(PRIO_FEE);
    }
  }
}
