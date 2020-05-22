package com.codegym.demospringboot.repository;

import com.codegym.demospringboot.model.Customer;
import com.codegym.demospringboot.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {
    //Iterable<Province> findByCustomers(Customer customer);
}
