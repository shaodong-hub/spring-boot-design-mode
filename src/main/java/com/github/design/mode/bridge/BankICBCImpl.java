package com.github.design.mode.bridge;

/**
 * @author 石少东
 * @date 2020-07-29 22:42
 * @since 1.0
 */


public class BankICBCImpl extends AbstractBank {

    public BankICBCImpl(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("BankICBCImpl");
        return account.openAccount();
    }
}
