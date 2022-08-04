package com.airtel.wallet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airtel.wallet.Entity.Wallet;



public interface WalletRepository extends JpaRepository<Wallet, Integer>{

}
