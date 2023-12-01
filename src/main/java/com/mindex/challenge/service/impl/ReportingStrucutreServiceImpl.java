package com.mindex.challenge.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindex.challenge.dao.ReportingStructureRepository;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;

@Service
public class ReportingStrucutreServiceImpl implements ReportingStructureService{
    
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStrucutreServiceImpl.class);

    //Use of same employee repo since the request for an employee is the same for both endpoints
    @Autowired
    private ReportingStructureRepository reportingStructureRepository;

    @Override
    public ReportingStructure read(String id) {
        LOG.debug("Creating reportingReport with id [{}]", id);

        ReportingStructure reportingStructure = reportingStructureRepository.findReportingStructureById(id);

        if (reportingStructure == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }

        return reportingStructure;
    }

}
