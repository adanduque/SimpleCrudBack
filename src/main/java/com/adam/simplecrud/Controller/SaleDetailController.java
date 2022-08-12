package com.adam.simplecrud.Controller;

import com.adam.simplecrud.Dto.SaleDTO;
import com.adam.simplecrud.Dto.SaleDetailDTO;
import com.adam.simplecrud.Model.SaleDetail;
import com.adam.simplecrud.Service.ISaleDetailService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/saleDetail")
public class SaleDetailController {

    @Autowired
    private ISaleDetailService service;

    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<SaleDetailDTO>> findAll() {
        List<SaleDetailDTO> list = service.findAll().stream().map(p -> mapper.map(p, SaleDetailDTO.class)).collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody SaleDTO dto) {
        SaleDetail p = service.save(mapper.map(dto, SaleDetail.class));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getIdSaleDetail()).toUri();
        return ResponseEntity.created(location).build();
    }


}
