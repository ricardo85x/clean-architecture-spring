package com.ricardo85x.cleanarch.core.usecase.impl;

import com.ricardo85x.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.ricardo85x.cleanarch.core.dataprovider.InsertCustomer;
import com.ricardo85x.cleanarch.core.domain.Customer;
import com.ricardo85x.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {

        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);

    }
}
