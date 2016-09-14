package edu.elon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ATMTest {

  @Test
  public void testDeposit() {
    ATM atm = new ATM();
    atm.deposit(5.0);
    double actual = atm.getBalance();
    double expected = 5.0;
    assertEquals(expected, actual, 0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDepositException() {
    ATM atm = new ATM();
    atm.deposit(-2.3);
  }

  @Test
  public void testGetBalance() {
    ATM atm = new ATM();
    double actual = atm.getBalance();
    double expected = 0.0;
    assertEquals(expected, actual, 0);
  }

  @Test
  public void testToString() {
    ATM atm = new ATM();
    atm.deposit(3.0);
    String expected = "Amount balance is $3.00";
    assertEquals(expected, atm.toString());

  }

  @Test
  public void testWithdraw() {
    ATM atm = new ATM();
    atm.deposit(5.0);
    atm.withdraw(3.0);
    double expected = 2.0;
    double actual = atm.getBalance();
    assertEquals(actual, expected, 0);

    ATM atmException = new ATM();
    try {
      atmException.withdraw(3.00);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithdrawException() {
    ATM atm = new ATM();
    atm.withdraw(356776.0);
  }

}
