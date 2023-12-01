package com.mindex.challenge.service.impl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.CompensationService;

@Service
public class CompensationServiceImpl implements CompensationService{

    private static final Logger LOG = LoggerFactory.getLogger(CompensationServiceImpl.class);

    @Autowired
    CompensationRepository compensationRepository;

    @Override
    public Compensation create(Compensation compensation) {
        LOG.debug("Creating employee [{}]", compensation);

        compensationRepository.insert(compensation);

        return compensation;
    }

    @Override
    public Compensation read(String id) {
        LOG.debug("Creating employee with id [{}]", id);

        Compensation compensation = compensationRepository.findByEmployeeId(id);

        if (compensation == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }

        return compensation;
    }
    
}
