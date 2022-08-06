package com.adam.simplecrud.Service.Impl;

import com.adam.simplecrud.Model.Person;
import com.adam.simplecrud.Model.Sale;
import com.adam.simplecrud.Repository.IGenericRepo;
import com.adam.simplecrud.Repository.IPersonRepo;
import com.adam.simplecrud.Repository.ISaleRepo;
import com.adam.simplecrud.Service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService extends CRUDImpl<Sale, Integer> implements ISaleService {

    @Autowired
    private ISaleRepo repo;

    @Override
    protected IGenericRepo<Sale, Integer> getRepo() {
        return repo;
    }
}