package com.worldremit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class TransferServiceTest {

  @Test
  public void transferMoney() {
    TransferService ts = new TransferService();
    Transfer transfer = new Transfer();
    transfer.fromAccount = new Account("1", new Date());
    transfer.toAccount = new Account("1", new Date());
    transfer.amount = 1.123456;
    transfer.type = TransferType.INTERNATIONAL;

    ts.makeTransfer(transfer);

    assert transfer.toAccount.balance == transfer.amount;
  }

  @Test
  @DisplayName("Custom Orchestrator test")
  public void transfersOrchestrator() {
    TransfersOrchestrator o = new TransfersOrchestrator();

    Transfer transfer = new Transfer();
    transfer.toAccount = new Account("1", new Date());
    transfer.amount = 1.123456;
    transfer.type = TransferType.INTERNATIONAL;

    try {
      o.doTransfers(List.of(transfer));
      fail();
    } catch (Exception exe) {

    }
  }
}
