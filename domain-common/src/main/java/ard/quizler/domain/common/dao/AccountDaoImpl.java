package ard.quizler.domain.common.dao;

import ard.quizler.core.dao.BaseDaoImpl;
import ard.quizler.domain.common.entity.Account;

public class AccountDaoImpl extends BaseDaoImpl<Account> implements AccountDao {
    public AccountDaoImpl() {
        super(Account.class);
    }
}
