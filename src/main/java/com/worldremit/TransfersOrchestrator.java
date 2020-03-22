package com.worldremit;

import java.util.List;
import java.util.Optional;

public class TransfersOrchestrator {

  public static Optional<TransferService> transferService = Optional.of(new TransferService());

  public void doTransfers(List<Transfer> transfers) {
    TransferService service = transferService.get();
    transfers.stream().parallel().forEach(service::makeTransfer);
  }
}
