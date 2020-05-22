package com.codegym.demospringboot.service;

import com.codegym.demospringboot.model.Customer;
import com.codegym.demospringboot.model.Province;
import com.codegym.demospringboot.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService{
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

//    @Override
//    public Iterable<Province> findAllByCustomer(Customer customer) {
//        return provinceRepository.findByCustomers(customer);
//    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void delete(Long id) {
        provinceRepository.deleteById(id);
    }
}
