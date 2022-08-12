package com.adam.simplecrud.Service;

import com.adam.simplecrud.Model.Product;
import com.adam.simplecrud.Model.Sale;

import java.util.List;

public interface ISaleService extends ICRUD<Sale, Integer>{
    Sale saveSaleDetail(Sale sale);

}
