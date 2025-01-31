package entity;

import java.sql.Timestamp;
import java.util.Date;

public class Customer {
  private String custId;
  private String name;
  private String hp;
  private String addr;
  private String rDate;

  public Customer() {}

  public Customer(String custId, String name, String hp, String addr, String rDate) {
    this.custId = custId;
    this.name = name;
    this.hp = hp;
    this.addr = addr;
    this.rDate = rDate;
  }

  public Customer(String custId, String name, String hp, String addr) {
    this.custId = custId;
    this.name = name;
    this.hp = hp;
    this.addr = addr;
    this.rDate = new Timestamp(new Date().getTime()).toString();
  }

  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHp() {
    return hp;
  }

  public void setHp(String hp) {
    this.hp = hp;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String getrDate() {
    return rDate;
  }

  public void setrDate(String rDate) {
    this.rDate = rDate;
  }

  @Override
  public String toString() {
    return "Customer [custId=" + custId + ", name=" + name + ", hp=" + hp + ", addr=" + addr
        + ", rDate=" + rDate + "]";
  }

}
