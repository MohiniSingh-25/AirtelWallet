package com.airtel.wallet.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airtel.wallet.DAO.Response;
import com.airtel.wallet.Entity.Wallet;
import com.airtel.wallet.Entity.WalletTransfer;
import com.airtel.wallet.Entity.WalletUpdate;
import com.airtel.wallet.Service.WalletService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping("wallet")
@RestController
public class WalletController {

	@Autowired
	WalletService service;
	
	@GetMapping("findById/{id}")
	public Optional<Wallet> checkBalance(@PathVariable Integer id)
	{
		return service.checkBalance(id);
	}
	
	@PutMapping("/credit")
	public ResponseEntity<Response> creditAmount(@RequestBody WalletUpdate wallet)
	{
		return service.creditAmount(wallet.getId(), wallet.getAmount());
	}
	
	@PutMapping("/debit")
	public ResponseEntity<Response> debitAmount(@RequestBody WalletUpdate wallet)
	{
		return service.debitAmount(wallet.getId(), wallet.getAmount());
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<Response> addUser(@RequestBody Wallet wallet)
	{
		return service.addUser(wallet);
	}
	
	@PutMapping("/transfer")
	public ResponseEntity<Response> transferMoney(@RequestBody WalletTransfer wallet)
	{
		return service.transferMoney(wallet.getSenderId(), wallet.getReceiverID(), wallet.getAmount());
				
	}
}
