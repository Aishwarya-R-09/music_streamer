package com.example.music.service.account_verify;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.music.dao.account.AccountDao;
import com.example.music.dao.verify_account.VerifyAccountDao;
import com.example.music.model.Account;
import com.example.music.model.VerifyAccount;

@Service
public class VerifyAccountServiceImpl implements VerifyAccountService{

	@Autowired
	private VerifyAccountDao verifyAccountDao;
	
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public VerifyAccount create(VerifyAccount verifyAccount) {
		// TODO Auto-generated method stub
		return verifyAccountDao.create(verifyAccount);
	}

	@Override
	public Optional<VerifyAccount> findByToken(String token) {
		
		return verifyAccountDao.findByToken(token);
	}

	@Override
	public Optional<VerifyAccount> findById(Long id) {
		// TODO Auto-generated method stub
		return verifyAccountDao.findById(id);
	}
	

}
