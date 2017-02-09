package com.cbiit.repository;

import com.cbiit.entity.ClinicalTrial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bnorris on 2/8/17.
 */
@Repository("clinicalRepository")
public interface ClinicalTrialRepository extends JpaRepository<ClinicalTrial, String> {

    /**
     * Using this custom query instead of the findAll() becuase there are null values in the nct_id column in the database which is throwing an error.
     * For the sake of this assignment I am filtering out null id's
     * @return
     */
    @Query("SELECT c FROM ClinicalTrial c WHERE c.nctId IS NOT NULL")
    public List<ClinicalTrial> findAllByIdNotNull();

}