package com.github.design.mode.bridge;

/**
 * @author 石少东
 * @date 2020-07-29 22:41
 * @since 1.0
 */


public class AccountSavingImpl implements Account {

    @Override
    public Account openAccount() {
        System.out.println("openAccount-AccountSavingImpl");
        return new AccountSavingImpl();
    }

    @Override
    public void showAccountType() {
        System.out.println("showAccountType-AccountSavingImpl");

    }
}
