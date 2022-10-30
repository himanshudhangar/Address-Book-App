package com.bridgelabz.addressbookapp.repository;


import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressbookRepository extends JpaRepository<AddressBookData,Integer> {
}