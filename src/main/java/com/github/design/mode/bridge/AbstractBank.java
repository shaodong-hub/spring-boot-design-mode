package com.github.design.mode.bridge;

/**
 * @author 石少东
 * @date 2020-07-29 22:40
 * @since 1.0
 */


public abstract class AbstractBank {

    protected Account account;

    public AbstractBank(Account account){
        this.account = account;
    }

    public abstract Account openAccount();

}
