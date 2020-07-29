package com.github.design.mode.bridge;

/**
 * @author 石少东
 * @date 2020-07-29 22:41
 * @since 1.0
 */


public class AccountDepositImpl implements Account{

    @Override
    public Account openAccount() {
        System.out.println("openAccount-AccountDepositImpl");
        return new AccountDepositImpl();
    }

    @Override
    public void showAccountType() {
        System.out.println("showAccountType-AccountDepositImpl");
    }
}
