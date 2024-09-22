package com.webservice.springService.services;

import com.webservice.springService.entities.Product;
import com.webservice.springService.entities.User;
import com.webservice.springService.repositories.ProductRepository;
import com.webservice.springService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
