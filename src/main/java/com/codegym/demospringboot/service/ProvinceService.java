package com.codegym.demospringboot.service;

import com.codegym.demospringboot.model.Customer;
import com.codegym.demospringboot.model.Province;

import java.util.Optional;

public interface ProvinceService {
    Iterable<Province> findAll();

    //Iterable<Province> findAllByCustomer(Customer customer);

    Optional<Province> findById(Long id);

    void save(Province province);

    void delete(Long id);
}
