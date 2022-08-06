package com.adam.simplecrud.Service.Impl;

import com.adam.simplecrud.Model.Product;
import com.adam.simplecrud.Repository.IGenericRepo;
import com.adam.simplecrud.Repository.IProductRepo;
import com.adam.simplecrud.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends CRUDImpl<Product, Integer> implements IProductService {

@Autowired
private IProductRepo repo;

@Override
protected IGenericRepo<Product, Integer> getRepo() {
        return repo;
        }
}