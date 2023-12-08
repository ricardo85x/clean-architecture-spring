package com.ricardo85x.cleanarch.core.dataprovider;

import com.ricardo85x.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
