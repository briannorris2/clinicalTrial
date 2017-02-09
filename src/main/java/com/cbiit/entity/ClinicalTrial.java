package com.cbiit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bnorris on 2/8/17.
 */
@Entity
@Table(name="clinical_trial")
public class ClinicalTrial implements Serializable {

    @Id
    @GeneratedValue
    private String nctId;

    private String officialTitle;

    private String phase;

    private String primaryCompletionDate;

    public String getNctId() {
        return nctId;
    }

    public void setNctId(String nctId) {
        this.nctId = nctId;
    }

    public String getOfficialTitle() {
        return officialTitle;
    }

    public void setOfficialTitle(String officialTitle) {
        this.officialTitle = officialTitle;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPrimaryCompletionDate() {
        return primaryCompletionDate;
    }

    public void setPrimaryCompletionDate(String primaryCompletionDate) {
        this.primaryCompletionDate = primaryCompletionDate;
    }
}
