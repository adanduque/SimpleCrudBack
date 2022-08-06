package com.adam.simplecrud.Service.Impl;

import com.adam.simplecrud.Model.Product;
import com.adam.simplecrud.Model.SaleDetail;
import com.adam.simplecrud.Repository.IGenericRepo;
import com.adam.simplecrud.Repository.IProductRepo;
import com.adam.simplecrud.Repository.ISaleDetailRepo;
import com.adam.simplecrud.Service.IProductService;
import com.adam.simplecrud.Service.ISaleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SaleDetailServiceImpl extends CRUDImpl<SaleDetail, Integer> implements ISaleDetailService {

    @Autowired
    private ISaleDetailRepo repo;

    @Override
    protected IGenericRepo<SaleDetail, Integer> getRepo() {
        return repo;
    }
}