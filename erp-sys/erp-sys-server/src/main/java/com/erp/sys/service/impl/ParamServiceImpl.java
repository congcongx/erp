package com.erp.sys.service.impl;

import com.erp.sys.model.domain.Param;
import com.erp.sys.repository.ParamRepository;
import com.erp.sys.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParamServiceImpl implements ParamService {

    @Autowired
    private ParamRepository paramRepository;

    @Override
    public List<Param> findAllParam() {
        return paramRepository.findAll();
    }
}
