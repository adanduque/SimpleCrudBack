package com.adam.simplecrud.Service.Impl;

import com.adam.simplecrud.Model.Person;
import com.adam.simplecrud.Repository.IGenericRepo;
import com.adam.simplecrud.Repository.IPersonRepo;
import com.adam.simplecrud.Service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends CRUDImpl<Person, Integer> implements IPersonService {

    @Autowired
    private IPersonRepo repo;

    @Override
    protected IGenericRepo<Person, Integer> getRepo() {
        return repo;
    }
}