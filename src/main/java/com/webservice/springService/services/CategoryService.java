package com.webservice.springService.services;

import com.webservice.springService.entities.Category;
import com.webservice.springService.entities.User;
import com.webservice.springService.repositories.CategoryRepository;
import com.webservice.springService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
