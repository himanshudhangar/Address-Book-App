package com.bridgelabz.addressbookapp.service;


import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressbookData();

    AddressBookData getAddressbookDataById(int personId);

    AddressBookData createAddressbookData(AddressbookDTO addressbookDTO);

    AddressBookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO);

    void deleteAddressbookData(int personId);
}