package com.cbiit.service;

import com.cbiit.entity.ClinicalTrial;
import com.cbiit.repository.ClinicalTrialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bnorris on 2/8/17.
 */
@Service("clinicalTrialService")
public class ClinicalTrialServiceImpl implements ClinicalTrialService {

    @Autowired
    private ClinicalTrialRepository clinicalTrialRepository;

    @Override
    public List<ClinicalTrial> getAllClinicalTrials() {
        return clinicalTrialRepository.findAllByIdNotNull();
    }

    @Override
    public ClinicalTrial findById(String id) {
        return clinicalTrialRepository.findOne(id);
    }
}
