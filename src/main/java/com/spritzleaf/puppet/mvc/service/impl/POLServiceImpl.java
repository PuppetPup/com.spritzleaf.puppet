package com.spritzleaf.puppet.mvc.service.impl;

import com.spritzleaf.puppet.mvc.model.POL;
import com.spritzleaf.puppet.mvc.repository.POLDao;
import com.spritzleaf.puppet.mvc.service.POLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class POLServiceImpl implements POLService {

    @Autowired
    private POLDao polDao;

    @Override
    public List<POL> getAllPOLs() {
        return polDao.findAll();
    }
}
