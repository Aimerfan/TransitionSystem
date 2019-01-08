package model;

import data.BorrowerData;

public class Borrower {

  private BorrowerData data;

  public Borrower(BorrowerData data) {
    setData(data);
  }

  public BorrowerData getData() {
    return data;
  }

  public void setData(BorrowerData data) {
    this.data = data;
  }

  public boolean equals(Borrower borrower) {
    return data.equals(borrower.data);
  }

  public String toString() {
    return data.toString();
  }
}