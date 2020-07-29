package com.github.design.mode.bridge;

/**
 * @author 石少东
 * @date 2020-07-29 22:55
 * @since 1.0
 */


public class Main {

    public static void main(String[] args) {
        AbstractBank bank = new BankABCImpl(new AccountSavingImpl());
        Account account = bank.openAccount();
        account.showAccountType();
    }

}
