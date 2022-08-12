package com.adam.simplecrud.Service.Impl;

import com.adam.simplecrud.Model.Person;
import com.adam.simplecrud.Model.Sale;
import com.adam.simplecrud.Repository.IGenericRepo;
import com.adam.simplecrud.Repository.IPersonRepo;
import com.adam.simplecrud.Repository.ISaleRepo;
import com.adam.simplecrud.Service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService extends CRUDImpl<Sale, Integer> implements ISaleService {

@Autowired
private ISaleRepo saleRepo;


@Override
protected IGenericRepo<Sale, Integer> getRepo() {
        return saleRepo;
}

@Transactional
@Override
public Sale saveSaleDetail(Sale sale) {
        //Consult + ConsultDetail
        sale.getDetails().forEach(det -> det.setSale(sale));
        saleRepo.save(sale);
        return sale;
        }
}

