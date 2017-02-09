package com.cbiit.controller;

import com.cbiit.entity.ClinicalTrial;
import com.cbiit.service.ClinicalTrialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bnorris on 2/8/17.
 */
@RestController
public class ClinicalTrialController {

    @Autowired
    private ClinicalTrialService clinicalTrialService;

    @RequestMapping(path="/trials", method=RequestMethod.GET)
    public List<ClinicalTrial> getAllClinicalTrials(){
        return clinicalTrialService.getAllClinicalTrials();
    }
    @RequestMapping(value = "/clinicalTrial/{id}", method = RequestMethod.GET)
    public ClinicalTrial getClinicalTrialById(@PathVariable("id") String id){
        return clinicalTrialService.findById(id);
    }
}
