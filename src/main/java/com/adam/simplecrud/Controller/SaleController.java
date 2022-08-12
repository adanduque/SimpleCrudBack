package com.adam.simplecrud.Controller;


import com.adam.simplecrud.Dto.SaleDTO;
import com.adam.simplecrud.Exception.ModelNotFoundException;
import com.adam.simplecrud.Model.Sale;
import com.adam.simplecrud.Service.ISaleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private ISaleService service;

    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<SaleDTO>> findAll() {
        List<SaleDTO> list = service.findAll().stream().map(p -> mapper.map(p, SaleDTO.class)).collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaleDTO> findById(@PathVariable("id") Integer id) {
        SaleDTO dtoResponse;
        Sale obj = service.findById(id);
        if (obj == null) {
            throw new ModelNotFoundException("ID NOT FOUND: " + id);
        } else {
            dtoResponse = mapper.map(obj, SaleDTO.class);
        }
        return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody SaleDTO dto) {
        Sale c = mapper.map(dto, Sale.class);
        Sale obj = service.saveSaleDetail(c);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdSale()).toUri();
        return ResponseEntity.created(location).build();
    }

}
