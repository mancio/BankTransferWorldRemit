package com.worldremit;

import java.util.Date;
import java.util.Objects;

public class LoyaltyAccount extends Account {

  public int loyaltyPoints;
  public String loyaltyCardId;

  public LoyaltyAccount(String number, Date createdAt, int loyaltyPoints, String loyaltyCardId) {
    super(number, createdAt);
    this.loyaltyPoints = loyaltyPoints;
    this.loyaltyCardId = loyaltyCardId;
  }

  @Override public boolean equals(Object o) {
    if(this == o)
      return true;
    if(!(o instanceof LoyaltyAccount))
      return false;
    if(!super.equals(o))
      return false;
    LoyaltyAccount that = (LoyaltyAccount) o;
    return Objects.equals(loyaltyCardId, that.loyaltyCardId);
  }

  @Override public int hashCode() {
    return Objects.hash(super.hashCode(), loyaltyCardId);
  }
}
