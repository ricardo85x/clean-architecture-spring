package com.ricardo85x.cleanarch.core.usecase;

import com.ricardo85x.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
