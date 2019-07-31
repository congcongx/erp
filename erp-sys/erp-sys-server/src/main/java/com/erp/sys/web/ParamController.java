package com.erp.sys.web;

import com.erp.sys.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/params")
public class ParamController {

    @Autowired
    private ParamService paramService;


    @GetMapping
    public Object findAll(){
        return paramService.findAllParam();
    }
}
