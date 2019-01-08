package model;

import java.util.ArrayList;

import data.Book;
import data.LenderData;

public class Lender {

  private LenderData data;
  private ArrayList<Goods> goods;

  public Lender(LenderData data, ArrayList<Goods> goods) {
    setData(data);
    setGoods(goods);
  }

  public ArrayList<Goods> getGoods() {
    return this.goods;
  }

  public void setGoods(ArrayList<Goods> goods) {
    this.goods = goods;
  }

  public LenderData getData() {
    return this.data;
  }

  public void setData(LenderData data) {
    this.data = data;
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    for (Goods b : this.goods) {
      s.append("\n");
      s.append(b.toString());
    }
    return data.toString() + "\nGoods: " + s.toString();
  }

}
