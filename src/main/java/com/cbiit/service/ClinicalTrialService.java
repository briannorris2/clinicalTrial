package com.cbiit.service;

import com.cbiit.entity.ClinicalTrial;

import java.util.List;

/**
 * Created by bnorris on 2/8/17.
 */
public interface ClinicalTrialService {

    public List<ClinicalTrial> getAllClinicalTrials();

    public ClinicalTrial findById(String id);
}
