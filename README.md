# Clinical Trial Java Project

Tech stack list:

 * Java 8
 * Spring Boot
 * Spring Data
 * Hibernate JPA
 * PostgresSQL database

After cloning this repo do the following to run the Spring Boot application:

Modify the applications.properties file to match your PostgresSQL username, password and database name
```
spring.datasource.url=jdbc:postgresql://localhost:5432/clinical
spring.datasource.username=postgres
spring.datasource.password=postgres
```

Assuming you have Maven installed, start the application using the following command in the terminal:
```
mvn spring-boot:run
```

Navigate to localhost:8080 and you should see the Clinical Trials Reporting Program Data Table


To Run this application as a standalone jar do the following:
```
mvn clean install
java -jar target/clinical-trial-0.0.1-SNAPSHOT.jar
```

Navigate to localhost:8080 and you should see the Clinical Trials Reporting Program Data Table

Sample Endpoints:

Please note this endpoint is extra and not used in the data table
```
curl http://localhost:8080/clinicalTrial/NCT00002643
```
```
{
  "nctId": "NCT00002643",
  "officialTitle": "INTENSIVE THERAPY WITH GROWTH FACTOR SUPPORT FOR PATIENTS WITH EWING'S TUMOR METASTATIC AT DIAGNOSIS:  A PEDIATRIC ONCOLOGY GROUP PHASE II STUDY",
  "phase": "II",
  "primaryCompletionDate": "2003-05-05"
}
```

```
curl http://localhost:8080/trials
```
```
[
  {
    "nctId": "00064246",
    "officialTitle": "A Phase I/II Study: Zevalin Radioimmunotherapy for Patients with Post Transplant Lymphoproliferative Disease Following Solid Organ Transplantation",
    "phase": "I_II",
    "primaryCompletionDate": "2004-09-10"
  },
  {
    "nctId": "NCT00002537",
    "officialTitle": "A PHASE I STUDY OF PROLONGED LOW-DOSE TOPOTECAN INFUSION COMBINED WITH CHEST IRRADIATION",
    "phase": "I",
    "primaryCompletionDate": "2001-10-08"
  },
  {
    "nctId": "NCT00002556",
    "officialTitle": "The Treatment of Multiple Myeloma Utilizing VBMCP Chemotherapy Alternating with High-Dose Cyclophosphamide and Alpha2b-Interferon Versus VBMCP: A Phase III Study for Previously Untreated Multiple Myeloma",
    "phase": "III",
    "primaryCompletionDate": "2006-01-01"
  },
  {
    "nctId": "NCT00002574",
    "officialTitle": "PHASE II STUDY OF SIMULTANEOUS HOMOHARRINGTONINE (NSC 141633) AND ALPHA INTERFERON (IFN-A) THERAPY IN CHRONIC MYELOGENOUS LEUKEMIA (CML)",
    "phase": "II",
    "primaryCompletionDate": "2001-08-22"
  },
  {
    "nctId": "NCT00002587",
    "officialTitle": "A PHASE I STUDY OF PROLONGED LOW-DOSE TOPOTECAN INFUSION COMBINED WITH PACLITAXEL (TAXOL)",
    "phase": "I",
    "primaryCompletionDate": "2000-12-20"
  },
  {
    "nctId": "NCT00002643",
    "officialTitle": "INTENSIVE THERAPY WITH GROWTH FACTOR SUPPORT FOR PATIENTS WITH EWING'S TUMOR METASTATIC AT DIAGNOSIS:  A PEDIATRIC ONCOLOGY GROUP PHASE II STUDY",
    "phase": "II",
    "primaryCompletionDate": "2003-05-05"
  },
  {
    "nctId": "NCT00002649",
    "officialTitle": "Total Body Irradiation, Etoposide, Cyclophosphamide and Autologous Peripheral Blood Stem Cell Transplantation Followed by Randomization to Therapy with Interleukin-2 Versus Observation for Patients with Non-Hodgkin's Lymphoma",
    "phase": "III",
    "primaryCompletionDate": "2006-11-15"
  },
  {
    "nctId": "NCT00002705",
    "officialTitle": "TOPOTECAN FOR CHILDREN WITH REFRACTORY LEUKEMIA, A PEDIATRIC ONCOLOGY GROUP PHASE I COOPERATIVE AGREEMENT STUDY",
    "phase": "I",
    "primaryCompletionDate": "2000-06-20"
  },
  {
    "nctId": "NCT00002725",
    "officialTitle": "PHASE II EVALUATION OF BRYOSTATIN-1 (NSC 339555) IN NON-HODGKIN'S LYMPHOMA",
    "phase": "II",
    "primaryCompletionDate": "2000-08-02"
  },
  {
    "nctId": "NCT00002752",
    "officialTitle": "Phase I/II Study of Anti-Tenascin Monoclonal Antibody 131I 81C6 via Surgically Created Cystic Resection Cavity in the Treatment of Patients with Primary or Metastatic Malignant Brain Tumors.",
    "phase": "I_II",
    "primaryCompletionDate": "2003-01-01"
  },
  {
    "nctId": "NCT00002759",
    "officialTitle": "A PHASE I STUDY OF IRINOTECAN (CPT-11) WITH PHARMACOKINETIC MODULATION BY CYCLOSPORINE A AND PHENOBARBITAL",
    "phase": "I",
    "primaryCompletionDate": "2002-01-25"
  },
  {
    "nctId": "NCT00002787",
    "officialTitle": "Phase I Trial of Post Transplant Immunization with Autologous Myeloma Idiotype-KLH/GM-CSF In Myeloma Patients Following Autologous or Allogeneic Marrow or Stem Cell Transplantation",
    "phase": "I",
    "primaryCompletionDate": "2002-12-31"
  },
  {
    "nctId": "NCT00002796",
    "officialTitle": "Phase I-II Study of Fluorouracil in Combination with Phenylbutyrate, Indomethacin and Recombinant Human Interferon-Gamma in Advanced Colorectal Cancer",
    "phase": "I_II",
    "primaryCompletionDate": "2004-12-19"
  },
  {
    "nctId": "NCT00002798",
    "officialTitle": "A Phase III Study in Children with Untreated Acute Myelogenous Leukemia (AML) or Myelodysplastic Syndrome (MDS)",
    "phase": "III",
    "primaryCompletionDate": "2006-09-05"
  },
  {
    "nctId": "NCT00002852",
    "officialTitle": "A PHASE III STUDY OF ADJUVANT CHEMOTHERAPY AFTER RESECTION FOR PATIENTS WITH T2N0 STAGE I NON-SMALL CELL CARCINOMA OF THE LUNG",
    "phase": "III",
    "primaryCompletionDate": "2004-07-01"
  },
  {
    "nctId": "NCT00002909",
    "officialTitle": "A PHASE I CLINICAL AND PHARMACOLOGIC EVALUATION OF PHENYLBUTYRATE IN PATIENTS WITH REFRACTORY SOLID TUMORS:  STUDY OF CONTINUOUS EXPOSURE ORAL PHENYLBUTYRATE ON A THREE TIMES DAILY SCHEDULE",
    "phase": "I",
    "primaryCompletionDate": "2000-06-12"
  },
  {
    "nctId": "NCT00002912",
    "officialTitle": "A PHASE I COOPERATIVE AGREEMENT PEDIATRIC TRIAL OF MITOXANTRONE, ETOPOSIDE AND PSC-833 (PSC-ME) THERAPY IN PATIENTS WITH RELAPSED AND REFRACTORY ACUTE LEUKEMIA",
    "phase": "I",
    "primaryCompletionDate": "2005-09-01"
  },
  {
    "nctId": "NCT00002968",
    "officialTitle": "Phase III Randomized Study of Adjuvant Immunotherapy With Monoclonal Antibody 17-1A Versus No Adjuvant Therapy Following Resection for State II (Modified Astler-Coller B2) Adenocarcinoma of the Colon",
    "phase": "III",
    "primaryCompletionDate": "2003-07-01"
  },
  {
    "nctId": "NCT00002970",
    "officialTitle": "A Phase II Study of Compound 506U78 in Patients with Refractory T-Cell Malignancies-POG/CCG Intergroup Study",
    "phase": "II",
    "primaryCompletionDate": "2005-01-27"
  },
  {
    "nctId": "NCT00003039",
    "officialTitle": "A Phase II Trial of Flavopiridol (NSC 649890) Administered as a 72-Hour Continuous Infusion Every 2 Weeks in Patients with Previously Treated Intermediate and High Grade Non-Hodgkin's Lymphoma Including Mantle Cell Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2000-01-04"
  },
  {
    "nctId": "NCT00003145",
    "officialTitle": "Induction Of Mixed Hematopoietic Chimerism Using Fludarabine, Low Dose TBI , PBSC Infusion And Post-Transplant Immunosuppression With Cyclosporine And Mycophenolate Mofetil to be Followed by Donor Lymphocyte Infusion In Patients With Chronic Myeloid Leukemia in Chronic and Accelerated Phases: A Multi-Center Study.",
    "phase": "II",
    "primaryCompletionDate": "2005-03-30"
  },
  {
    "nctId": "NCT00003166",
    "officialTitle": "A Phase I Trial of Combination Bryostatin 1 (NSC 339555) and Vincristine in B-Cell Malignancies",
    "phase": "I",
    "primaryCompletionDate": "2001-07-12"
  },
  {
    "nctId": "NCT00003167",
    "officialTitle": "A Phase I Trial of Intravesical Ad-p53 Treatment in Locally Advanced and Metastatic Bladder Cancer",
    "phase": "I",
    "primaryCompletionDate": "2002-12-17"
  },
  {
    "nctId": "NCT00003190",
    "officialTitle": "Phase III Study of MDR Modulation with PSC-833 (NSC #648265) Followed by Immunotherapy with rIL-2 (NSC #373364) vs. No Further Therapy in Previously Untreated Patients with AML >60 Years",
    "phase": "III",
    "primaryCompletionDate": "2002-08-01"
  },
  {
    "nctId": "NCT00003196",
    "officialTitle": "Induction Of Mixed Hematopoietic Chimerism In Older Patients With B-Cell Malignancies and in Selected Other Diseases, Using Low Dose TBI , PBSC Infusion And Post-Transplant Immunosuppression With Cyclosporine And Mycophenolate Mofetil to be Followed by Donor Lymphocyte Infusion: A Pilot Study.",
    "phase": "NA",
    "primaryCompletionDate": "2002-04-10"
  },
  {
    "nctId": "NCT00003204",
    "officialTitle": "Randomized Phase III Study in Low Grade Lymphoma Comparing Maintenance Anti-CD20 Antibody Versus Observation Following Induction Therapy",
    "phase": "III",
    "primaryCompletionDate": "2006-05-01"
  },
  {
    "nctId": "NCT00003210",
    "officialTitle": "A Phase II Study of Recombinant Human Interleukin-12 (rhIL-12) for the Treatment of Relapsed Lymphoma and Hodgkin's Disease",
    "phase": "II",
    "primaryCompletionDate": "2003-11-07"
  },
  {
    "nctId": "NCT00003282",
    "officialTitle": "Phase I Trial of EF5, an Agent for the Detection of Hypoxia",
    "phase": "I",
    "primaryCompletionDate": "2005-05-25"
  },
  {
    "nctId": "NCT00003370",
    "officialTitle": "A Trial of MGI 114 in Children With Solid Tumors: A Pediatric Oncology Group Phase I Cooperative Agreement Study",
    "phase": "I",
    "primaryCompletionDate": "2005-09-01"
  },
  {
    "nctId": "NCT00003433",
    "officialTitle": "A Phase I/II Study of Active Immunotherapy With Carcinoembryonic Antigen RNA-Pulsed, Autologous, Cultured Dendritic Cells After Complete Resection of Hepatic Metastases of Colorectal Carcinoma",
    "phase": "I_II",
    "primaryCompletionDate": "2002-01-08"
  },
  {
    "nctId": "NCT00003439",
    "officialTitle": "A Phase I Dose-Escalating Study of Recombinant Human Interleukin-12 (NSC # 672423) Administered by Intraperitoneal Infusion in Refractory Advanced Stage Ovarian Cancer and Other Abdominal Carcinomatosis",
    "phase": "I",
    "primaryCompletionDate": "2001-01-31"
  },
  {
    "nctId": "NCT00003440",
    "officialTitle": "A Phase III Study of Paclitaxel Via Weekly 1 Hour Infusion Versus Standard 3 Hour Infusion Every 3 Weeks with Herceptin (Trastuzumab) (NSC #688097) in the Treatment of Patients with/without HER-2/Neu-Overexpressing Metastatic Breast Cancer",
    "phase": "III",
    "primaryCompletionDate": "2004-07-01"
  },
  {
    "nctId": "NCT00003484",
    "officialTitle": "Phase I/II Study of Anti-tenascin Monoclonal Antibody 131I-labeled 81C6 via Surgically Created Cystic Resection Cavity in the Treatment of Patients with Primary Brain Tumors After External Beam Radiotherapy",
    "phase": "I_II",
    "primaryCompletionDate": "2003-11-01"
  },
  {
    "nctId": "NCT00003528",
    "officialTitle": "A Phase I Trial of Tomudex in Children with Leukemia",
    "phase": "I",
    "primaryCompletionDate": "2002-06-20"
  },
  {
    "nctId": "NCT00003575",
    "officialTitle": "A Pre-Phase II Trial of Interleukin-12 Following Response to Ifosfamide/Etoposide Chemotherapy for Refractory HIV-Associated Non-Hodgkin's Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2002-05-31"
  },
  {
    "nctId": "NCT00003588",
    "officialTitle": "A Phase I Study of Ad-p53 (NSC# 683550) for Patients with Platinum- and Paclitaxel-Resistant Epithelial Ovarian Cancer",
    "phase": "I",
    "primaryCompletionDate": "2000-12-18"
  },
  {
    "nctId": "NCT00003595",
    "officialTitle": "Randomized Trial of CHOP Chemotherapy with or without Rituximab (Chimeric Anti-CD20 Antibody) for HIV-associated Non-Hodgkin's Lymphoma",
    "phase": "III",
    "primaryCompletionDate": "2006-04-01"
  },
  {
    "nctId": "NCT00003613",
    "officialTitle": "Phase I Trial of O6 Benzylguanine and BCNU in Cutaneous T-cell Lymphoma",
    "phase": "I",
    "primaryCompletionDate": "2006-05-03"
  },
  {
    "nctId": "NCT00003620",
    "officialTitle": "A PHASE II STUDY OF FLAVOPIRIDOL (NSC # 649890) IN PATIENTS WITH PREVIOUSLY TREATED B-CELL\\nCHRONIC LYMPHOCYTIC LEUKEMIA",
    "phase": "II",
    "primaryCompletionDate": "2006-06-28"
  },
  {
    "nctId": "NCT00003694",
    "officialTitle": "A Phase II Study of Newly Diagnosed Patients with BCR/ABL (+) Chronic Myelogenous Leukemia Treated with Combined Homoharringtonine (NSC #141633) and Low-Dose Cytarabine",
    "phase": "II",
    "primaryCompletionDate": "2003-08-01"
  },
  {
    "nctId": "NCT00003745",
    "officialTitle": "A Phase II Study of Continuous 21 Day Infusion of Topotecan (NSC # 609699) in Children with Relapsed Solid Tumors",
    "phase": "II",
    "primaryCompletionDate": "2003-04-01"
  },
  {
    "nctId": "NCT00003778",
    "officialTitle": "Phase II Trial of Dolastatin-10 in Patients with Previously Untreated Recurrent/Metastatic Sarcoma",
    "phase": "II",
    "primaryCompletionDate": "2000-05-31"
  },
  {
    "nctId": "NCT00003789",
    "officialTitle": "A Randomized Phase III Trial of Hyperthermic Isolated Limb Perfusion and Melphalan with and without Tumor Necrosis Factor in Patients with Localized Advanced Extremity Melanoma",
    "phase": "III",
    "primaryCompletionDate": "2004-01-01"
  },
  {
    "nctId": "NCT00003799",
    "officialTitle": "Phase I Study of Preoperative Radiation Therapy with Concurrent Protracted Continuous Infusion 5-FU and Dose Escalating Oxaliplatin Followed by Surgery, 5-FU, and Leucovorin for Locally Advanced (T3 and T4) Rectal Adenocarcinoma",
    "phase": "I",
    "primaryCompletionDate": "2003-09-29"
  },
  {
    "nctId": "NCT00003832",
    "officialTitle": "Cell Kinetic Study of Bromodeoxyuridine (BrdU) in Prostate Cancer",
    "phase": "II",
    "primaryCompletionDate": "2002-06-20"
  },
  {
    "nctId": "NCT00003850",
    "officialTitle": "A Phase II Study of Thalidomide in Recurrent and Metastatic Squamous Cell Carcinoma of the Head and Neck",
    "phase": "II",
    "primaryCompletionDate": "2000-11-14"
  },
  {
    "nctId": "NCT00003861",
    "officialTitle": "Molecular Genetic Features of Acute Leukemia",
    "phase": "NA",
    "primaryCompletionDate": "2003-10-15"
  },
  {
    "nctId": "NCT00003934",
    "officialTitle": "Phase III Randomized Study of Concurrent Tretinoin and Chemotherapy with or without Arsenic Trioxide (AS2O3) (NSC # 706363) as Initial Consolidation Therapy Followed by Maintenance Therapy with Intermittent Tretinoin Versus Intermittent Tretinoin Plus Mercaptopurine and Methotrexate for Patients with Untreated Acute Promyelocytic Leukemia",
    "phase": "III",
    "primaryCompletionDate": "2006-11-01"
  },
  {
    "nctId": "NCT00003953",
    "officialTitle": "A Phase II Study of Pre-operative Dose Dense Chemotherapy with Sequential Doxorubicin and Docetaxel for Initial Treatment of Operable and Inoperable Stage II-IIIB Breast Cancer",
    "phase": "II",
    "primaryCompletionDate": "2001-10-17"
  },
  {
    "nctId": "NCT00003954",
    "officialTitle": "Allogeneic Stem Cell Transplantation For Multiple Myeloma: A Two Step Approach To Reduce Toxicity Involving High Dose Melphalan and Autologous Stem Cell Transplant Followed By PBSC Allografting After Low Dose TBI",
    "phase": "I_II",
    "primaryCompletionDate": "2002-12-20"
  },
  {
    "nctId": "NCT00003968",
    "officialTitle": "Phase II Study of Bryostatin-1 in Metastatic Renal Cell Carcinoma(Summary Last Modified 8/1999)",
    "phase": "II",
    "primaryCompletionDate": "2001-07-31"
  },
  {
    "nctId": "NCT00003970",
    "officialTitle": "A Phase I Clinical Trial to Investigate the Correlation Between UGT1A1 Genotype and Irinotecan (CPT-11) Pharmacokinetics and Toxicity in Cancer Patients",
    "phase": "I",
    "primaryCompletionDate": "2003-10-03"
  },
  {
    "nctId": "NCT00003995",
    "officialTitle": "Phase II and Pharmacokinetic Study of CPT-11 and Trastuzumab (RhuMab HER2, Herceptin) in Advanced Colo-Rectal Cancer with p185 HER 2 Overexpression",
    "phase": "II",
    "primaryCompletionDate": "2003-01-30"
  },
  {
    "nctId": "NCT00003997",
    "officialTitle": "Phase I Study of MGI-114 (NSC#683863) in Patients with Refractory Myelodysplastic Syndromes, Acute Leukemia and Chronic Myelogenous Leukemia in Blastic Phase (CML-BP)",
    "phase": "I",
    "primaryCompletionDate": "2000-10-20"
  },
  {
    "nctId": "NCT00004032",
    "officialTitle": "Intraperitoneal (IP) Autologous Therapeutic Tumor Vaccine AUT-OV-ALVAC-h.B7.1 Plus IP rIFN-gamma for Patients with Ovarian Cancer. A Pilot Study",
    "phase": "I",
    "primaryCompletionDate": "2004-04-13"
  },
  {
    "nctId": "NCT00004038",
    "officialTitle": "Pilot Study of p53 Intralesional Gene Therapy With Chemotherapy in Breast Cancer",
    "phase": "I",
    "primaryCompletionDate": "2001-04-24"
  },
  {
    "nctId": "NCT00004079",
    "officialTitle": "A Phase I Trial of Sarcosinamide Nitrosourea (SarCNU) in Patients with Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2005-09-02"
  },
  {
    "nctId": "NCT00004229",
    "officialTitle": "A Phase I Surrogate Endpoint Trial of Human Recombinant Endostatin in Patients with Advanced Solid Tumors Amenable to Biopsy",
    "phase": "I",
    "primaryCompletionDate": "2001-08-10"
  },
  {
    "nctId": "NCT00004241",
    "officialTitle": "A Phase I Trial of Weekly 17-Allylamino-17 Demethoxygeldanamycin",
    "phase": "I",
    "primaryCompletionDate": "2006-05-01"
  },
  {
    "nctId": "NCT00004262",
    "officialTitle": "PHASE I TRIAL OF GADOLINIUM TEXAPHYRIN (PCI -0120) AS A RADIOSENSITIZER DURING STEREOTACTIC RADIOSURGERY BOOST FOR GLIOBLASTOMA MULTIFORME",
    "phase": "I",
    "primaryCompletionDate": "2005-05-07"
  },
  {
    "nctId": "NCT00004856",
    "officialTitle": "A Phase II Trial of Trastuzumab (Herceptin; NSC #688097, IND #6667) in Patients with Previously Treated Advanced Urothelial Tract Transitional Cell Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2002-07-30"
  },
  {
    "nctId": "NCT00004862",
    "officialTitle": "A Phase I Study of G3139 (NSC 683428) in Combination With Salvage Chemotherapy for Treatment of Refractory and Relapsed Acute Myeloid Leukemia (AML) and Acute Lymphoblastic Leukemia (ALL)",
    "phase": "I",
    "primaryCompletionDate": "2002-03-26"
  },
  {
    "nctId": "NCT00004883",
    "officialTitle": "A Phase II Trial of Trastuzumab (Herceptin) for Advanced Stage (IIIB, IV), HER2 Overexpressing, Non-Small Cell Lung Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-08-02"
  },
  {
    "nctId": "NCT00004919",
    "officialTitle": "A Trial of Irinotecan and Cisplatin in Children with Refractory Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2003-03-26"
  },
  {
    "nctId": "NCT00004931",
    "officialTitle": "A Clinical Trial Comparing 5-Fluorouracil (5-FU) Plus Leucovorin (LV) and Oxaliplatin with 5-FU Plus LV for the Treatment of Patients with Stages II and III Carcinoma of the Colon",
    "phase": "III",
    "primaryCompletionDate": "2005-09-01"
  },
  {
    "nctId": "NCT00005036",
    "officialTitle": "A Randomized Phase III Equivalence Trial of Irinotecan (CPT-11) Versus Oxaliplatin (OXAL)/5-Fluorouracil (5-FU)/Leucovorin (CF) in Patients with Advanced Colorectal Carcinoma Previously Treated with 5-FU",
    "phase": "III",
    "primaryCompletionDate": "2006-12-06"
  },
  {
    "nctId": "NCT00005064",
    "officialTitle": "Phase I Study of PS-341 in Acute Myeloid Leukemias, Myelodysplastic Syndromes and Chronic Myeloid Leukemia in Blast Phase",
    "phase": "I",
    "primaryCompletionDate": "2002-10-24"
  },
  {
    "nctId": "NCT00005065",
    "officialTitle": "A Phase I Study of Induction Carboplatin / Paclitaxel Chemotherapy, Pre-operative Radiotherapy with Gadolinium Texaphyrin (Gd-Tex), and Surgical Resection in Stage IIIA (N2) Non-small Cell Lung Carcinoma.",
    "phase": "I",
    "primaryCompletionDate": "2003-12-05"
  },
  {
    "nctId": "NCT00005080",
    "officialTitle": "A Phase II Study of 506U78 in Patients with Previously Systemically Untreated Cutaneous T-cell Lymphoma (CTCL) or with Refractory or Relapsed Non-cutaneous Peripheral T-cell Lymphoma (PTCL)",
    "phase": "II",
    "primaryCompletionDate": "2006-01-02"
  },
  {
    "nctId": "NCT00005094",
    "officialTitle": "Prevention of Sporadic Colorectal Adenomas with Celecoxib",
    "phase": "III",
    "primaryCompletionDate": "2006-04-17"
  },
  {
    "nctId": "NCT00005576",
    "officialTitle": "A Phase I Study of Chimeric Human/Murine Anti-GD2 Monoclonal Antibody (CH14.18) with GM-CSF and Interleukin-2 (IL-2) in Children with Neuroblastoma and Other GD2 Positive Malignancies Immediately Post Autologous BMT or PBSC Rescue",
    "phase": "I",
    "primaryCompletionDate": "2002-03-31"
  },
  {
    "nctId": "NCT00005577",
    "officialTitle": "A PEDIATRIC PHASE I STUDY OF GEMCITABINE (NSC# 613327) IN SOLID TUMORS",
    "phase": "I",
    "primaryCompletionDate": "2002-09-30"
  },
  {
    "nctId": "NCT00005604",
    "officialTitle": "Phase I Trial of Twice Weekly IV IL-12 Plus Low-Dose Subcutaneous IL-2 in Patients with Advanced Malignancies",
    "phase": "I",
    "primaryCompletionDate": "2003-07-31"
  },
  {
    "nctId": "NCT00005786",
    "officialTitle": "A Pilot Study of Arsenic Trioxide in the Treatment of Relapsed and Refractory Indolent Lymphomas",
    "phase": "NA",
    "primaryCompletionDate": "2004-11-22"
  },
  {
    "nctId": "NCT00005799",
    "officialTitle": "Low-Dose TBI and Fludarabine Followed by Unrelated Donor Stem Cell Transplantation for Patients with Hematologic Malignancies and Renal Cell Carcinoma � A Multi-Center Trial.",
    "phase": "NA",
    "primaryCompletionDate": "2002-07-21"
  },
  {
    "nctId": "NCT00005808",
    "officialTitle": "Phase I Study Photodynamic Therapy Using Lutrin (Lutetium Texaphyrin) in the Treatment of Patients with Cervical Intraepithelial Neoplasia",
    "phase": "I",
    "primaryCompletionDate": "2004-04-01"
  },
  {
    "nctId": "NCT00005811",
    "officialTitle": "A Phase II Study of Intrathecal Topotecan (NSC #609699) in Patients with Refractory Meningeal Malignancies",
    "phase": "II",
    "primaryCompletionDate": "2006-04-07"
  },
  {
    "nctId": "NCT00005817",
    "officialTitle": "A Randomized Phase 2 Study of Rebeccamycin Analog in Advanced Breast Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-05-01"
  },
  {
    "nctId": "NCT00005818",
    "officialTitle": "A Phase I/II Study of Escalating Doses of SU5416 (NSC 696819) in Combination with CPT-11 in Patients with Advanced Colorectal Carcinoma",
    "phase": "I_II",
    "primaryCompletionDate": "2003-03-12"
  },
  {
    "nctId": "NCT00005831",
    "officialTitle": "Phase II Evaluation of Trastuzumab (Herceptin), Paclitaxel, Carboplatin, and Gemcitabine in the Treatment of Advanced Urothelial Cancer",
    "phase": "II",
    "primaryCompletionDate": "2004-08-11"
  },
  {
    "nctId": "NCT00005843",
    "officialTitle": "Phase II Trial of R115777 (NSC-702818), an Inhibitor of Farnesyl Protein Transferase, in Patients With Previously Untreated Metastatic Pancreatic Adenocarcinoma",
    "phase": "II",
    "primaryCompletionDate": "2004-11-22"
  },
  {
    "nctId": "NCT00005851",
    "officialTitle": "Phase I/II Study of HLA-Matched Non-Myeloablative Peripheral Blood Mobilized Hematopoietic Progenitor Cell Transplantation as Treatment for Patients with Metastatic Renal Cell Carcinoma. A Multi-Center Trial.",
    "phase": "I_II",
    "primaryCompletionDate": "2004-07-15"
  },
  {
    "nctId": "NCT00005940",
    "officialTitle": "Phase II Study of Radiolabeled BC8 (Anti-CD45) Antibody Combined with Busulfan and Cyclophosphamide as Treatment for Acute Myelogenous Leukemia in First Remission Followed by HLA-Identical Related Peripheral Blood Stem Cell Transplantation",
    "phase": "II",
    "primaryCompletionDate": "2006-01-22"
  },
  {
    "nctId": "NCT00005942",
    "officialTitle": "Phase II Trial of Liposomal Daunorubicin (Daunoxome) and SU5416 (NSC 696819) in Patients with AML, RAEB, RAEB-T or CMML in Transformation Refractory to One Course of Induction Chemotherapy",
    "phase": "I_II",
    "primaryCompletionDate": "2000-12-31"
  },
  {
    "nctId": "NCT00005949",
    "officialTitle": "Phase II Study of Melanoma Vaccine (NSC #683472/675756, IND #6123) and Low-Dose, Subcutaneous Interleukin-2 in Advanced Melanoma",
    "phase": "II",
    "primaryCompletionDate": "2006-03-20"
  },
  {
    "nctId": "NCT00005950",
    "officialTitle": "Phase II Study of 506U78 (NSC #686673) for Patients with Relapsed or Refractory Indolent B-Cell or Peripheral T-Cell Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2004-10-19"
  },
  {
    "nctId": "NCT00005961",
    "officialTitle": "A Phase II Trial of O6-Benzylguanine (NSC 637037) and BCNU (Carmustine) in Patients with Metatstatic Melanoma",
    "phase": "II",
    "primaryCompletionDate": "2005-02-04"
  },
  {
    "nctId": "NCT00005967",
    "officialTitle": "A Dose Finding Study of R115777 (NSC 702818) in Patients with Advanced Hematologic Malignancies",
    "phase": "I",
    "primaryCompletionDate": "2003-04-08"
  },
  {
    "nctId": "NCT00005973",
    "officialTitle": "Phase I Study of Farnesyl Transferase Inhibitor BMS-214662 (NSC 710086D) in Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2004-07-07"
  },
  {
    "nctId": "NCT00005982",
    "officialTitle": "Phase II Study of 506U78 (NSC #686673) in Patients with Previously Treated Cutaneous T-Cell Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2004-07-22"
  },
  {
    "nctId": "NCT00006003",
    "officialTitle": "A Phase II Trial of SU5416 (NSC #696819) in Patients with Metastatic Melanoma",
    "phase": "II",
    "primaryCompletionDate": "2003-07-30"
  },
  {
    "nctId": "NCT00006006",
    "officialTitle": "Thalidomide for Unresectable Hepatocellular Cancer with Optional Interferon alpha-2a Upon Disease Progression",
    "phase": "II",
    "primaryCompletionDate": "2005-04-27"
  },
  {
    "nctId": "NCT00006016",
    "officialTitle": "An Evaluation of Chronic Thalidomide Administration in Patients Undergoing Chemoembolization for Unresectable Hepatocellular Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-04-27"
  },
  {
    "nctId": "NCT00006053",
    "officialTitle": "A Study to Determine the Safety and Efficacy of STI571 in Patients With Chronic Myeloid Leukemia Who Are Hematologically or Cytogenetically Resistant or Refractory to Interferon-Alpha, or Intolerant of, Interferon-Alpha",
    "phase": "II",
    "primaryCompletionDate": "2003-03-01"
  },
  {
    "nctId": "NCT00006094",
    "officialTitle": "A Phase I/II Study of Preoperative Oxaliplatin (NSC# 266046), 5-Fluorouracil, and External Beam Radiation Therapy in Locally Advanced Rectal Cancer",
    "phase": "I_II",
    "primaryCompletionDate": "2006-10-23"
  },
  {
    "nctId": "NCT00006102",
    "officialTitle": "A Phase II Trial of Rebeccamycin Analogue (NSC #655649) in Children with Solid Tumors",
    "phase": "II",
    "primaryCompletionDate": "2005-09-15"
  },
  {
    "nctId": "NCT00006213",
    "officialTitle": "Phase I Study of Farnesyl Transferase Inhibitor BMS-214662 (NSC 710086) in Acute Leukemias, Myelodysplastic Syndromes (RAEB and RAEB-T) and Chronic Myeloid Leukemia in Blast Phase",
    "phase": "I",
    "primaryCompletionDate": "2002-10-24"
  },
  {
    "nctId": "NCT00006222",
    "officialTitle": "A Phase I trial of EMD 121974 in patients with HIV related Kaposi's Sarcoma",
    "phase": "I",
    "primaryCompletionDate": "2001-03-01"
  },
  {
    "nctId": "NCT00006228",
    "officialTitle": "Phase II Trial of Anti-HER-2 Monoclonal Antibody Trastuzumab (Herceptin) in Combination with Low Dose Interleukin-2 (Proleukin) in Metastatic Breast Cancer Patients who have Previously Failed Trastuzumab",
    "phase": "II",
    "primaryCompletionDate": "2003-07-02"
  },
  {
    "nctId": "NCT00006242",
    "officialTitle": "A Phase I Trial of Farnesyltransferase Inhibitor BMS-214662 (NSC 710086) Escalating to a 24 Hour Continuous Intravenous Infusion in Patients with Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2005-09-02"
  },
  {
    "nctId": "NCT00006243",
    "officialTitle": "Melanoma Vaccines: Differentiation Antigen Peptides (MART-1:27-35, Tyrosinase and gp-100) as Immune Targets",
    "phase": "NA",
    "primaryCompletionDate": "2006-05-03"
  },
  {
    "nctId": "NCT00006251",
    "officialTitle": "Induction of Mixed Hematopoietic Chimerism in Patients Using Fludarabine, Low Dose TBI, PBSC Infusion and Post-Transplant Immunosuppression with Cyclosporine and Mycophenolate Mofetil",
    "phase": "NA",
    "primaryCompletionDate": "2005-09-15"
  },
  {
    "nctId": "NCT00006256",
    "officialTitle": "Concurrent Taxol (Paclitaxel) and Definitive Breast Radiation Therapy in Early Stage Breast Cancer following Four Cycles of Adriamycin/Cytoxan Chemotherapy",
    "phase": "II",
    "primaryCompletionDate": "2004-12-21"
  },
  {
    "nctId": "NCT00006363",
    "officialTitle": "Phase III Randomized Study of Induction Chemotherapy with or without MDR-Modulation with PSC-833 (NSC # 648265, IND # 41121) Followed by Cytogenetic Risk-Adapted Intensification Therapy Followed by Immunotherapy with rIL-2 (NSC # 373364, IND # 1969) vs. Observation in Previously Untreated Patients with AML < 60 Years",
    "phase": "III",
    "primaryCompletionDate": "2005-06-01"
  },
  {
    "nctId": "NCT00006364",
    "officialTitle": "Phase I and Pilot Study of Subcutaneous Homoharringtonine in Chronic Myelogenous Leukemia",
    "phase": "II",
    "primaryCompletionDate": "2005-09-30"
  },
  {
    "nctId": "NCT00006473",
    "officialTitle": "A Phase II Study of Oxaliplatin in Relapsed and Refractory Non-Hodgkin's Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2006-02-21"
  },
  {
    "nctId": "NCT00006486",
    "officialTitle": "A Phase II Randomized Discontinuation Trial Of Carboxyaminoimidazole (CAI, NSC 609974) In Metastatic Renal Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2005-10-12"
  },
  {
    "nctId": "NCT00006942",
    "officialTitle": "A Phase II Trial of Bryostatin in Combination with Cisplatin in Patients with Recurrent or Persistent Epithelial Ovarian Cancer",
    "phase": "II",
    "primaryCompletionDate": "2004-03-08"
  },
  {
    "nctId": "NCT00007904",
    "officialTitle": "A Phase II Study of the Safety and Tolerability of Adjuvant Chemotherapy with Continuous Infusion of Paclitaxel and Dose Intense Cyclophosphamide and Hematopoietic Growth Factor Support Followed by Doxorubicin for Stage II-IIIA Breast Cancer Involving Greater than or equal to 4 Lymph Nodes",
    "phase": "II",
    "primaryCompletionDate": "2006-06-16"
  },
  {
    "nctId": "NCT00009867",
    "officialTitle": "A PHASE II STUDY OF ARSENIC TRIOXIDE (NSC #706363, IND #57974) IN UROTHELIAL CANCER",
    "phase": "II",
    "primaryCompletionDate": "2004-06-01"
  },
  {
    "nctId": "NCT00009919",
    "officialTitle": "Phase II Study of SU5416 (NSC 696819) for Patients with Progressive Metastatic Renal Cancer Failing Prior Biologic Therapy or 5-Fluorouracil Containing Regimens",
    "phase": "II",
    "primaryCompletionDate": "2003-06-02"
  },
  {
    "nctId": "NCT00009984",
    "officialTitle": "Randomized Phase II Study of Thalidomide Versus Thalidomide Plus Fludarabine for Patients with Chronic Lymphocytic Leukemia Previously Treated with Fludarabine",
    "phase": "II",
    "primaryCompletionDate": "2006-11-17"
  },
  {
    "nctId": "NCT00010192",
    "officialTitle": "A Phase I Trial Of Rituximab And Interleukin-2",
    "phase": "I",
    "primaryCompletionDate": "2003-01-22"
  },
  {
    "nctId": "NCT00012142",
    "officialTitle": "Randomized, Double-Blind, Placebo-Controlled, Phase II Study Of Intravenous CCI-779 Administered Weekly To Patients With Androgen-Independent Prostate Cancer",
    "phase": "II",
    "primaryCompletionDate": "2001-10-02"
  },
  {
    "nctId": "NCT00012181",
    "officialTitle": "A PHASE I STUDY OF FLAVOPIRIDOL (NSC# 649890; IND# 46211) IN PATIENTS WITH RELAPSED OR REFRACTORY PEDIATRIC SOLID TUMORS OR LYMPHOMAS",
    "phase": "I",
    "primaryCompletionDate": "2005-01-12"
  },
  {
    "nctId": "NCT00014170",
    "officialTitle": "Phase II Study Of ZD1839 (NSC 715055) In Newly Diagnosed Patients With Glioblastoma (Grade 4 Astrocytoma)",
    "phase": "II",
    "primaryCompletionDate": "2003-07-30"
  },
  {
    "nctId": "NCT00014235",
    "officialTitle": "Nonmyeloablative PBSC Allografting from HLA Matched Related Donors Using Fludarabine and/or Low Dose TBI with Disease-Risk Based Immunosuppression",
    "phase": "NA",
    "primaryCompletionDate": "2005-02-26"
  },
  {
    "nctId": "NCT00015834",
    "officialTitle": "A Phase I/II Trial of STI571 and High-Dose Cytarabine in Myeloid Blast Crisis of Chronic Myeloid Leukemia",
    "phase": "I_II",
    "primaryCompletionDate": "2003-04-16"
  },
  {
    "nctId": "NCT00015912",
    "officialTitle": "A Phase II Clinical And Biologic Study Of The Combination Of Low Dose Interferon-Alpha And Thalidomide (NSC #66847) For Patients With Relapsed Or Refractory Low-Grade Follicular Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2003-09-04"
  },
  {
    "nctId": "NCT00016016",
    "officialTitle": "A Phase I/II Study of Flavopiridol (NSC 649890, IND 46,211) in Timed Sequential Combination with Cytosine Arabinoside (ara-C) and Mitoxantrone for Adults with Poor-Risk Acute Leukemias",
    "phase": "I_II",
    "primaryCompletionDate": "2006-11-11"
  },
  {
    "nctId": "NCT00016094",
    "officialTitle": "Bevacizumab (rhuMab VEGF) (NSC-704865) Therapy for Patients with Relapsed Aggressive Non-Hodgkin's Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2005-08-01"
  },
  {
    "nctId": "NCT00016276",
    "officialTitle": "A 2X2X2 Factorial Randomized Phase III Trial Of Multimodality Therapy Comparing 4 Cycles Of Doxorubicin And Cyclophosphamide With Or Without Dexrazoxane (AC+/-Z) Followed By 12 Weeks Of Weekly Paclitaxel With Or Without Trastuzumab (T+/-H) Followed By Local Therapy Followed By 40 Weeks Of Weekly Trastuzumab Or None In Women With HER-2+ STAGE IIIA, IIIB OR REGIONAL STAGE IV BREAST CANCER",
    "phase": "III",
    "primaryCompletionDate": "2005-03-31"
  },
  {
    "nctId": "NCT00016328",
    "officialTitle": "A Phase II Study of CCI-779 in Patients with Recurrent Glioblastoma Multiforme",
    "phase": "II",
    "primaryCompletionDate": "2005-08-10"
  },
  {
    "nctId": "NCT00017251",
    "officialTitle": "A Phase I Study Of Genasense, A Bcl-2 Antisense Oligonucleotide, Combined With Carboplatin And Etoposide In Patients With Small Cell Lung Cancer",
    "phase": "I",
    "primaryCompletionDate": "2004-01-05"
  },
  {
    "nctId": "NCT00017472",
    "officialTitle": "Phase I Study of Thrice Weekly Hu1D10*in Patients with Chronic Lymphocytic Leukemia/Small Lymphocytic Lymphoma and Acute Leukemia",
    "phase": "I",
    "primaryCompletionDate": "2006-04-28"
  },
  {
    "nctId": "NCT00020683",
    "officialTitle": "A Phase II Trial of COL-3 in Patients with HIV Related Kaposi's Sarcoma",
    "phase": "II",
    "primaryCompletionDate": "2005-11-30"
  },
  {
    "nctId": "NCT00021060",
    "officialTitle": "Randomized Phase II/III Trial of Paclitaxel plus Carboplatin With or Without Bevacizumab (NSC #704865) in Patients with Advanced Nonsquamous NSCLC",
    "phase": "II_III",
    "primaryCompletionDate": "2006-09-07"
  },
  {
    "nctId": "NCT00021073",
    "officialTitle": "Phase I Study of Flavopiridol in Combination with 5-Fluorouracil, Leucovorin and Irinotecan in Patients with Advanced Malignancies",
    "phase": "I",
    "primaryCompletionDate": "2006-04-26"
  },
  {
    "nctId": "NCT00021216",
    "officialTitle": "A Phase I Study Of PS-341 In Pediatric Patients With Refractory Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2005-12-01"
  },
  {
    "nctId": "NCT00022113",
    "officialTitle": "A Phase I Study of EMD 121974 in Patients with Advanced Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2005-05-25"
  },
  {
    "nctId": "NCT00022529",
    "officialTitle": "Phase I Study of Intravenous BMS-214662 FTI (NSC #710086) and Trastuzumab (NSC #688097) Weekly in Patients with Advanced Malignancies",
    "phase": "I",
    "primaryCompletionDate": "2004-01-15"
  },
  {
    "nctId": "NCT00022542",
    "officialTitle": "A Phase II Study of Epothilone B Analog (BMS-247550) in Advanced Soft Tissue Sarcomas",
    "phase": "II",
    "primaryCompletionDate": "2006-06-19"
  },
  {
    "nctId": "NCT00022555",
    "officialTitle": "A Phase I Trial of Combination Bryostatin-1 and Vincristine in HIV-Related B-cell Neoplasms",
    "phase": "I",
    "primaryCompletionDate": "2003-07-11"
  },
  {
    "nctId": "NCT00022581",
    "officialTitle": "A Phase II Trial of Thalidomide (NSC #66847, IND #48832) for Patients with Relapsed or Refractory Low Grade Non-Hodgkin's Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2004-12-02"
  },
  {
    "nctId": "NCT00022737",
    "officialTitle": "A Children's Oncology Group Pilot Study for the Treatment of Very High Risk Acute Lymphoblastic Leukemia in Children and Adolescents (Imatinib (STI571, GLEEVEC) NSC#716051)",
    "phase": "III",
    "primaryCompletionDate": "2006-10-31"
  },
  {
    "nctId": "NCT00023920",
    "officialTitle": "A Phase II Study of Bevacizumab (rhuMab VEGF, NSC 704865), Idarubicin and Cytarabine in Patients with Chronic Myeloid Leukemia in Blast Phase",
    "phase": "II",
    "primaryCompletionDate": "2004-09-23"
  },
  {
    "nctId": "NCT00023933",
    "officialTitle": "Phase I Trial of 131I-HuCC49^CH2 for Colon Cancer",
    "phase": "I",
    "primaryCompletionDate": "2005-07-20"
  },
  {
    "nctId": "NCT00023946",
    "officialTitle": "A Phase II Trial Of The Epothilone B Analog BMS-247550 (NSC 710428D) In Patients With Hepatobiliary Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-07-01"
  },
  {
    "nctId": "NCT00023998",
    "officialTitle": "A Groupwide Phase II Study of Trastuzumab (Herceptin) in Metastatic Osteosarcoma Patients with Tumors that Overexpress HER2",
    "phase": "II",
    "primaryCompletionDate": "2005-11-09"
  },
  {
    "nctId": "NCT00024011",
    "officialTitle": "A Phase II Study of PS-341 in the Treatment of Metastatic Malignant Melanoma",
    "phase": "II",
    "primaryCompletionDate": "2006-09-30"
  },
  {
    "nctId": "NCT00024024",
    "officialTitle": "A Phase I-II Trial Of BMS-275291 In Patients With HIV-Related Kaposi's Sarcoma",
    "phase": "I_II",
    "primaryCompletionDate": "2002-07-25"
  },
  {
    "nctId": "NCT00024206",
    "officialTitle": "A Phase I Surrogate Endpoint Trial of SU6668 in Patients with Incurable Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2003-07-07"
  },
  {
    "nctId": "NCT00025207",
    "officialTitle": "A Phase II Study Of ZD 1839 (NSC 715055, IND 61187) In Patients With Malignant Mesothelioma",
    "phase": "II",
    "primaryCompletionDate": "2006-02-16"
  },
  {
    "nctId": "NCT00025220",
    "officialTitle": "A Phase II Evaluation of Thalidomide (NSC #66847) in the Treatment of Recurrent or Persistent Leiomyosarcoma of the Uterus",
    "phase": "II",
    "primaryCompletionDate": "2003-04-07"
  },
  {
    "nctId": "NCT00025415",
    "officialTitle": "A Phase I Pharmacokinetic Study of STI571 in Patients with Advanced Malignancies and Varying Levels of Liver Dysfunction",
    "phase": "I",
    "primaryCompletionDate": "2005-01-25"
  },
  {
    "nctId": "NCT00025584",
    "officialTitle": "Phase II Trial Of PS-341 In Metastatic Breast Cancer",
    "phase": "II",
    "primaryCompletionDate": "2004-08-18"
  },
  {
    "nctId": "NCT00026091",
    "officialTitle": "Phase II Trial of Fenretinide (NSC 374551) in Recurrent Ovarian Cancer and Primary Peritoneal Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2004-03-01"
  },
  {
    "nctId": "NCT00026104",
    "officialTitle": "A Randomized Phase II Trial of Weekly Gemcitabine, Paclitaxel and External Irradiation (50.4 GY) Followed by the Farnesyl Transferase Inhibitor R115777 (NSC #702818) for Locally Advanced Pancreatic Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-08-23"
  },
  {
    "nctId": "NCT00026143",
    "officialTitle": "Phase II Trial of Interleukin-12 (NSC #672423, IND #6798) Followed by Interferon Alfa-2B in Patients With Metastatic Malignant Melanoma",
    "phase": "II",
    "primaryCompletionDate": "2004-07-01"
  },
  {
    "nctId": "NCT00026169",
    "officialTitle": "A Phase I Pharmacokinetic Study of STI571 in Patients with Advanced Malignancies and Varying Degrees of Renal Dysfunction for the CTEP-Sponsored Organ Dysfunction Working Group",
    "phase": "I",
    "primaryCompletionDate": "2005-04-17"
  },
  {
    "nctId": "NCT00026182",
    "officialTitle": "Randomized Phase II Study Of Interleukin-12 In Combination With Rituximab In Patients With Non-Hodgkin's Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2005-02-26"
  },
  {
    "nctId": "NCT00026234",
    "officialTitle": "A Phase II Trial Evaluating Multiple Metastasectomy Combined With Hepatic Artery Infusion Of Floxuridine (FUDR) And Dexamethasone (DXM), Alternating With Systemic Oxaliplatin (OXAL) And Capecitabine (CAPCIT) For Colorectal Carcinoma Metastatic To The Liver",
    "phase": "II",
    "primaryCompletionDate": "2006-01-01"
  },
  {
    "nctId": "NCT00027690",
    "officialTitle": "A Phase II Trial of ZD 1839 (IRESSA) (NSC #715055) in the Treatment of Persistent or Recurrent Endometrial Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2004-09-10"
  },
  {
    "nctId": "NCT00027703",
    "officialTitle": "A Double Blind, Placebo Controlled Randomized Phase II Trial Of Gemcitabine And Cisplatin With Or Without The VEGF Inhibitor Bevacizumab (NSC #704865) In Patients With Malignant Mesotheloma",
    "phase": "II",
    "primaryCompletionDate": "2006-05-22"
  },
  {
    "nctId": "NCT00027898",
    "officialTitle": "A Phase I Study of PS-341 (NSC 681239), Carboplatin, and Etoposide in Patients with Advanced Solid Tumors Refractory to Standard Therapy",
    "phase": "I",
    "primaryCompletionDate": "2006-01-09"
  },
  {
    "nctId": "NCT00028496",
    "officialTitle": "Phase I Study of a Recombinant Fowl Pox Vaccine rF-CEA (6D)/TRICOM Alone or With GM-CSF in Patients with Advanced CEA Expressing Adenocarinomas",
    "phase": "I",
    "primaryCompletionDate": "2005-11-15"
  },
  {
    "nctId": "NCT00028587",
    "officialTitle": "A Phase I and Pharmacologic Study of the Proteasome Inhibitor PS-341 in Combination with Paclitaxel and Carboplatin in Patients with Advanced Malignancies",
    "phase": "I",
    "primaryCompletionDate": "2006-04-26"
  },
  {
    "nctId": "NCT00028600",
    "officialTitle": "Autologous Followed by Non-Myeloablative Allogeneic Transplant for Multiple Myeloma",
    "phase": "II",
    "primaryCompletionDate": "2006-06-30"
  },
  {
    "nctId": "NCT00028756",
    "officialTitle": "Randomized Phase III Trial Comparing Immediate Versus Deferred Chemotherapy After Radical Cystectomy in Patients with pT3-pT4, and/or N+M0 Transitional Cell Carcinoma (TCC) of the Bladder",
    "phase": "III",
    "primaryCompletionDate": "2005-01-17"
  },
  {
    "nctId": "NCT00028821",
    "officialTitle": "A Phase I and Pharmacologic Study of 2-Methoxyestradiol in Patients with Advanced Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2006-04-26"
  },
  {
    "nctId": "NCT00028834",
    "officialTitle": "A Phase II Trial Of Bevacizumab (NSC#704865) Plus Gemcitabine In Patients With Advanced Pancreatic Cancer",
    "phase": "II",
    "primaryCompletionDate": "2004-12-10"
  },
  {
    "nctId": "NCT00029003",
    "officialTitle": "Phase II Trial of Chronic Oral ZD1839 (Iressa�) (NSC-715055) in Both Previously-Untreated and Previously-Treated Patients with Selected Stage IIIB and IV Bronchioloalveolar Carcinoma (BAC)",
    "phase": "II",
    "primaryCompletionDate": "2004-12-01"
  },
  {
    "nctId": "NCT00030381",
    "officialTitle": "Phase I Trial of 4'-IODO-4'-Deoxydoxorubicin in Primary Amyloidosis (AL)",
    "phase": "I",
    "primaryCompletionDate": "2003-01-27"
  },
  {
    "nctId": "NCT00030667",
    "officialTitle": "A Phase II Study of Gleevec (Imatinib Mesylate, NSC 716051 Formerly STI571) in Children with Refractory or Relapsed Solid Tumors",
    "phase": "II",
    "primaryCompletionDate": "2005-12-01"
  },
  {
    "nctId": "NCT00031655",
    "officialTitle": "Nonmyeloablative Allogeneic Hematopoietic Cell Transplantation from HLA Matched Unrelated Donors for Treatment of Patients with High Risk Acute Lymphocytic Leukemia in Complete Remission - A Multicenter Trial",
    "phase": "II",
    "primaryCompletionDate": "2006-08-29"
  },
  {
    "nctId": "NCT00031993",
    "officialTitle": "A Phase II Evaluation Of OSI-774 (NSC #718781) In The Treatment Of Persistent or Recurrent Squamous Cell Carcinoma Of The Cervix",
    "phase": "II",
    "primaryCompletionDate": "2005-11-04"
  },
  {
    "nctId": "NCT00032188",
    "officialTitle": "A Randomized Phase II Study Of Interluekin-2 In Combination With Three Different Doses Of Bryostatin In Patients With Renal Cell Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2006-06-29"
  },
  {
    "nctId": "NCT00033254",
    "officialTitle": "A Phase III Study of Conventional Radiation Therapy Plus Thalidomide (NSC#66847) Versus Conventional Radiation Therapy for Multiple Brain Metastases",
    "phase": "III",
    "primaryCompletionDate": "2006-05-01"
  },
  {
    "nctId": "NCT00033267",
    "officialTitle": "A Phase II Study of CCI-779 in Previously Treated Patients with Mantle Cell Non-Hodgkin's Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2006-02-17"
  },
  {
    "nctId": "NCT00033397",
    "officialTitle": "Contrast-Enhanced Breast MRI, MRS, And Correlative Science Studies To Characterize Tumor Response In Patients Undergoing Neoadjuvant Treatment For Locally Advanced Breast Cancer",
    "phase": "NA",
    "primaryCompletionDate": "2005-06-01"
  },
  {
    "nctId": "NCT00033462",
    "officialTitle": "A Phase II Trial of OSI-774 in Patients with Hepatocellular or Biliary Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2006-11-01"
  },
  {
    "nctId": "NCT00036764",
    "officialTitle": "A Phase II Study Of Epothilone B Analog BMS 247550 (NSC # 710428) In Stage IV Malignant Melanoma",
    "phase": "II",
    "primaryCompletionDate": "2004-08-09"
  },
  {
    "nctId": "NCT00036777",
    "officialTitle": "A Phase 1 Study of UCN-01 in Combination with Carboplatin in Advanced Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2004-10-01"
  },
  {
    "nctId": "NCT00036855",
    "officialTitle": "A Phase I Study Of Yttrium-Ibritumomab Tiuxetan (90Y Zevalin, Yttrium (90)-Anti-CD20, NSC # 710085) Preceded By Rituximab In Children With Recurrent/Refractory CD20 Positive Lymphoma",
    "phase": "I",
    "primaryCompletionDate": "2005-03-17"
  },
  {
    "nctId": "NCT00037609",
    "officialTitle": "Phase I-II Study to Evaluate Safety, Efficacy and Pharmacokinetic Interactions Between Capecitabine (XELODA) and Exisulind (APTOSYN) in Patients With Metastatic Breast Cancer",
    "phase": "I_II",
    "primaryCompletionDate": "2003-02-01"
  },
  {
    "nctId": "NCT00039104",
    "officialTitle": "A Phase II, Open-Label, Randomized Trial of Zoledronic Acid (Zometa�) and BMS-275291 (NSC#713763)\\nin Patients with Hormone Refractory Prostate Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-01-01"
  },
  {
    "nctId": "NCT00039117",
    "officialTitle": "A Phase I Study of G3139 ( NSC # 683428) in Combination with Cytarabine and Daunorubicin in Previously Untreated Patients with Acute Myeloid Leukemia (AML)>= 60 Years of Age",
    "phase": "I",
    "primaryCompletionDate": "2003-09-30"
  },
  {
    "nctId": "NCT00039403",
    "officialTitle": "A Phase I Study Of UCN-01 In Combination With Gemcitabine In Unresectable Or Metastatic Pancreatic Carcinoma",
    "phase": "I",
    "primaryCompletionDate": "2006-05-09"
  },
  {
    "nctId": "NCT00039455",
    "officialTitle": "A Phase I Study of Herceptin/Flavopiridol in HER-2 Positive Metastatic Breast Cancer",
    "phase": "I",
    "primaryCompletionDate": "2004-12-31"
  },
  {
    "nctId": "NCT00039481",
    "officialTitle": "A Phase I Trial Of G3139 (BCL-2 Antisense, NSC# 683428, IND# 58842) Combined With Cytotoxic Chemotherapy In Relapsed Childhood Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2005-10-12"
  },
  {
    "nctId": "NCT00040755",
    "officialTitle": "Randomized Phase II Trial of BMS-275291 (NSC 713763, IND 62573) in Hormone Refractory Prostate Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-07-06"
  },
  {
    "nctId": "NCT00040768",
    "officialTitle": "A Phase II Study Of PS-341 In Metastatic Non-Small Cell Lung Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-03-31"
  },
  {
    "nctId": "NCT00040781",
    "officialTitle": "A Phase I Study of ZD1839 (Iressa TM), an Oral Epidermal Growth Factor Receptor Tyrosine Kinase Inhibitor, in Children with Refractory Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2004-10-22"
  },
  {
    "nctId": "NCT00040794",
    "officialTitle": "ZD1839 (NSC #715055, IND #61187) With Induction Paclitaxel And Carboplatin Followed By Either Radiation Or Concomitant Radiation With Weekly Paclitaxel And Carboplatin In Stage III Non-Small Cell Lung Cancer, A Phase II Study",
    "phase": "II",
    "primaryCompletionDate": "2006-03-01"
  },
  {
    "nctId": "NCT00041340",
    "officialTitle": "Phase II Study Of Gleevec (Imatinib Mesylate Formerly Known As(STI571) (NSC #716051) In Patients With Colorectal Cancer Stage IV",
    "phase": "II",
    "primaryCompletionDate": "2006-07-14"
  },
  {
    "nctId": "NCT00042796",
    "officialTitle": "A Phase I Study Of Decitabine (DAC) (IND # 50733) In Children With Relapsed Or Refractory Acute Leukemia",
    "phase": "I",
    "primaryCompletionDate": "2005-10-12"
  },
  {
    "nctId": "NCT00042952",
    "officialTitle": "A Phase II Study Of Imatinib Mesylate (Gleevec, Formerly Known As STI571; IND 61,135, NSC #716051) In Patients With Refractory Seminoma",
    "phase": "II",
    "primaryCompletionDate": "2003-10-31"
  },
  {
    "nctId": "NCT00042978",
    "officialTitle": "A Randomized Phase II Study Of Carboplatin And Etoposide With Or Without G3139 (NSC #683428, IND #58842) In Patients With Extensive Stage Small Cell Lung Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-05-01"
  },
  {
    "nctId": "NCT00043043",
    "officialTitle": "Rectal Aberrant Crypt Foci and Other Intermediate Biomarkers for Sporadic Colorectal Neoplasia: Cross-sectional Prevalence and Modulation by Celecoxib",
    "phase": "II",
    "primaryCompletionDate": "2005-08-01"
  },
  {
    "nctId": "NCT00044356",
    "officialTitle": "A Phase II Study of High-Dose Allovectin-7� in Patients With Advanced Metastatic Melanoma",
    "phase": "II",
    "primaryCompletionDate": "2004-08-01"
  },
  {
    "nctId": "NCT00045188",
    "officialTitle": "Phase II Trial of STI571 in Metastatic Breast Cancer",
    "phase": "II",
    "primaryCompletionDate": "2004-07-07"
  },
  {
    "nctId": "NCT00046891",
    "officialTitle": "The Use of Ginkgo Biloba For The Prevention Of Chemotherapy-Related Cognitive Dysfunction",
    "phase": "NA",
    "primaryCompletionDate": "2006-10-27"
  },
  {
    "nctId": "NCT00047203",
    "officialTitle": "A Phase II Study of Flavopiridol in Patients with Relapsed and Refractory Multiple Myeloma",
    "phase": "II",
    "primaryCompletionDate": "2006-09-30"
  },
  {
    "nctId": "NCT00047333",
    "officialTitle": "A Phase 2 Open-Label Study Of OSI-774 (NSC 718781) In Unresectable Hepatocellular Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2006-01-31"
  },
  {
    "nctId": "NCT00047346",
    "officialTitle": "A Dose-Finding, Safety, And Pharmacokinetic Study Of The Epidermal Growth Factor Receptor Tyrosine Kinase Inhibitor OSI-774 (NSC 718781) In Patients With Unresectable Hepatocellular Carcinoma And Moderate Hepatic Dysfunction",
    "phase": "I",
    "primaryCompletionDate": "2005-12-15"
  },
  {
    "nctId": "NCT00048555",
    "officialTitle": "A Phase I/II Trial of IDEC-114 (Anti-CD80 Monoclonal Antibody) in Combination With Rituxan� for Patients With Relapsed or Refractory, Follicular Lymphoma",
    "phase": "I_II",
    "primaryCompletionDate": "2004-03-01"
  },
  {
    "nctId": "NCT00048958",
    "officialTitle": "Cytogenetic Studies in Acute Leukemia and Multiple Myeloma",
    "phase": "NA",
    "primaryCompletionDate": "2005-10-22"
  },
  {
    "nctId": "NCT00049192",
    "officialTitle": "A PHASE II STUDY OF G3139 (GENASENSE�, NSC # 683428 IND # 58842) + IMATINIB MESYLATE (GLEEVEC�, STI571) IN PATIENTS WITH IMATINIB-RESISTANT CHRONIC MYELOID LEUKEMIA",
    "phase": "II",
    "primaryCompletionDate": "2005-11-01"
  },
  {
    "nctId": "NCT00049309",
    "officialTitle": "Prostate Cancer:  Impact of Fat & Flax Modified Diets.  Cross-listed Title:  Prostate Specific Antigen Readings & the Influence of Diet",
    "phase": "II",
    "primaryCompletionDate": "2006-05-01"
  },
  {
    "nctId": "NCT00049569",
    "officialTitle": "Intensive Induction Therapy for Children with Acute Lymphoblastic Leukemia (ALL) Who Experience a Bone Marrow Relapse",
    "phase": "NA",
    "primaryCompletionDate": "2006-03-20"
  },
  {
    "nctId": "NCT00052208",
    "officialTitle": "A Phase I/II Study of an Oral Epidermal Growth Factor Receptor Tyrosine Kinase Inhibitor (EGFR-TKI), ZD 1839 (Iressa), [NSC #715055] with Radiation Therapy in Glioblastoma Multiforme",
    "phase": "I_II",
    "primaryCompletionDate": "2005-06-03"
  },
  {
    "nctId": "NCT00052338",
    "officialTitle": "A Phase I Study Of PS-341 In Combination With Gemcitabine And Carbloplatin In Selected Stage IIIB Or IV Non-Small Cell Lung Cancer",
    "phase": "I",
    "primaryCompletionDate": "2004-05-01"
  },
  {
    "nctId": "NCT00052364",
    "officialTitle": "A Phase II Study of Oxaliplatin in Hepatocellular Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-01-01"
  },
  {
    "nctId": "NCT00052377",
    "officialTitle": "A Phase II Open-Label Study Of Recombinant Human Interleukin-12 (NSC 672423) In Mycosis Fungoides (MF) Patients With Cross-Over To Phase I Evaluation Of Escalating Doses Of Interleukin-2 (NSC 373364) Administered With Interleukin-12",
    "phase": "I_II",
    "primaryCompletionDate": "2005-06-30"
  },
  {
    "nctId": "NCT00052559",
    "officialTitle": "A Phase I Study Of The Antiangiogenic Agent Bevacizumab In Combination With 5-Fluourouracil And External Beam Radiation Therapy In Rectal Cancer",
    "phase": "I",
    "primaryCompletionDate": "2003-04-01"
  },
  {
    "nctId": "NCT00052585",
    "officialTitle": "A Phase II Trial Of IRESSA (NSC 715055, IND 61187) In Combination With 5-FU/LV/ CPT-11 In Patients With Advanced Or Recurrent Colorectal Cancer",
    "phase": "II",
    "primaryCompletionDate": "2004-11-30"
  },
  {
    "nctId": "NCT00052897",
    "officialTitle": "A Phase I/II Trial of SGN-00101 in the Treatment of High-Grade Anal Intraepithelial Neoplasia (AIN) in HIV-Positive Individuals",
    "phase": "I_II",
    "primaryCompletionDate": "2005-07-12"
  },
  {
    "nctId": "NCT00053326",
    "officialTitle": "A Phase II Study of Fenretinide (NSC# 374551, IND# 40294) in Children with Recurrent/Resistant High Risk Neuroblastoma",
    "phase": "II",
    "primaryCompletionDate": "2006-03-20"
  },
  {
    "nctId": "NCT00053963",
    "officialTitle": "A Phase I Study of Depsipeptide (NSC# 630176, IND# 51810) in Pediatric Patients with Refractory Solid Tumors and Leukemias",
    "phase": "I",
    "primaryCompletionDate": "2006-02-01"
  },
  {
    "nctId": "NCT00055757",
    "officialTitle": "A Phase II Trial of R115777, a Farnesyl Transferase Inhibitor, in Combination with Gemcitabine and Cisplatin in Advanced Non-Small Cell Lung Cancer (NSCLC)",
    "phase": "II",
    "primaryCompletionDate": "2004-04-13"
  },
  {
    "nctId": "NCT00055770",
    "officialTitle": "A Phase I and Phase II Study of OSI-774 in Combination with Docetaxel in Squamous Cell Carcinoma of the Head and Neck",
    "phase": "I_II",
    "primaryCompletionDate": "2006-12-15"
  },
  {
    "nctId": "NCT00055861",
    "officialTitle": "PHASE 2 STUDY OF BEVACIZUMAB IN COMBINATION WITH DOCETAXEL IN PATIENTS WITH ADVANCED BREAST CANCER",
    "phase": "II",
    "primaryCompletionDate": "2006-08-16"
  },
  {
    "nctId": "NCT00057850",
    "officialTitle": "Phase I/II Trial of the Epothilone B Analogue BMS 247550 (NSC 710428)/Cisplatin in Patients with Metastatic  or Recurrent Squamous Cell Carcinoma of the Head and Neck",
    "phase": "I_II",
    "primaryCompletionDate": "2003-07-16"
  },
  {
    "nctId": "NCT00058357",
    "officialTitle": "The Efficacy of Lidocaine Patch in the Management of Postsurgical Neuropathic Pain in Patients with Cancer: A Phase III Double-Blind, Crossover Study",
    "phase": "III",
    "primaryCompletionDate": "2006-07-26"
  },
  {
    "nctId": "NCT00059345",
    "officialTitle": "The Impact of Patient-Provider Interaction on Response to Acupuncture",
    "phase": "NA",
    "primaryCompletionDate": "2006-07-01"
  },
  {
    "nctId": "NCT00059813",
    "officialTitle": "A Phase II Trial of G3139 (Genasense) Anti-Bcl-2 Antisense Oligonucleotide Plus Alpha-Interferon in Metastatic Renal Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-06-18"
  },
  {
    "nctId": "NCT00060125",
    "officialTitle": "PHASE II TRIAL OF R115777 IN PATIENTS WITH METASTATIC MALIGNANT MELANOMA",
    "phase": "II",
    "primaryCompletionDate": "2006-06-01"
  },
  {
    "nctId": "NCT00061958",
    "officialTitle": "A Phase II Study of Arsenic Trioxide (NSC 706363) in Patients with Advanced Adenocarcinoma of the Esophagus or Gastroesophageal Junction",
    "phase": "II",
    "primaryCompletionDate": "2005-04-26"
  },
  {
    "nctId": "NCT00062101",
    "officialTitle": "A Phase II Study of OSI 774 (IND Number 63383) in Combination with Celecoxib (Celebrex, Pharmacia) as Second-Line Therapy in Advanced Non-Small Cell Lung Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-01-14"
  },
  {
    "nctId": "NCT00062127",
    "officialTitle": "A Phase I Pharmacokinetic Interaction Study of Irinotecan (NSC616348) and Thalidomide (NSC66847) in Patients with Advanced Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2006-05-10"
  },
  {
    "nctId": "NCT00063895",
    "officialTitle": "A Pharmacogenetic and Pharmacodynamic Study of Erlotinib (OSI-774) Toxicity in Patients with Advanced Solid Tumors",
    "phase": "I_II",
    "primaryCompletionDate": "2005-10-21"
  },
  {
    "nctId": "NCT00064142",
    "officialTitle": "A Phase II Trial of Topical Halofuginone in Patients with HIV Related Kaposi's Sarcoma",
    "phase": "II",
    "primaryCompletionDate": "2006-12-01"
  },
  {
    "nctId": "NCT00064246",
    "officialTitle": "A Phase I/II Study: Zevalin Radioimmunotherapy for Patients with Post Transplant Lymphoproliferative Disease Following Solid Organ Transplantation",
    "phase": "I_II",
    "primaryCompletionDate": "2004-09-10"
  },
  {
    "nctId": "NCT00064324",
    "officialTitle": "A Phase II Study of Perifosine in Soft Tissue Sarcoma",
    "phase": "II",
    "primaryCompletionDate": "2005-11-01"
  },
  {
    "nctId": "NCT00064779",
    "officialTitle": "Pilot Imaging Study to Assess the Distribution of IL13-PE38QQR Cytotoxin Infusions in Patients With Recurrent, Resectable, Supratentorial Malignant Glioma",
    "phase": "I",
    "primaryCompletionDate": "2006-06-01"
  },
  {
    "nctId": "NCT00068328",
    "officialTitle": "Chemotherapy Decisions and Outcomes in Women Age 65 or Older with Operable, Newly Diagnosed Breast Cancer",
    "phase": "NA",
    "primaryCompletionDate": "2005-07-01"
  },
  {
    "nctId": "NCT00068484",
    "officialTitle": "A Dose Finding Phase I Trial of the Combination of Topotecan and PS-341, a Novel Proteasome Inhibitor, in Advanced Malignancies",
    "phase": "I",
    "primaryCompletionDate": "2006-02-15"
  },
  {
    "nctId": "NCT00068692",
    "officialTitle": "Intergroup Randomized Phase III Study of Postoperative Irinotecan, 5-Fluorouracil and Leucovorin vs. Oxaliplatin, 5-Fluorouracil and Leucovorin vs. 5-Fluorouracil and Leucovorin for Patients with Stage II or III Rectal Cancer Receiving Either Preoperative Radiation and 5-Fluorouracil or Postoperative Radiation and 5-Fluorouracil",
    "phase": "III",
    "primaryCompletionDate": "2005-01-01"
  },
  {
    "nctId": "NCT00069238",
    "officialTitle": "Phase 2 Trial of Alemtuzumab and Dose-Adjusted EPOCH in Chemotherapy Naive Aggressive T and NK-Cell Lymphomas",
    "phase": "II",
    "primaryCompletionDate": "2005-06-01"
  },
  {
    "nctId": "NCT00070239",
    "officialTitle": "A Phase I Clinical, Pharmacokinetic and Pharmacodynamic Study of Flavopiridol in Patients with Refractory Solid Tumors and Hematologic Malignancies",
    "phase": "I",
    "primaryCompletionDate": "2006-06-01"
  },
  {
    "nctId": "NCT00070252",
    "officialTitle": "Phase Ib/II Neoadjuvant Trial of the Farnesyltransferase Inhibitor, R115777 with Docetaxel and Capecitabine for Patients with Stage IIIA or IIIB Breast Cancer",
    "phase": "I_II",
    "primaryCompletionDate": "2006-02-08"
  },
  {
    "nctId": "NCT00070265",
    "officialTitle": "A Multi-Institutional Phase II Trial Of Neoadjuvant Capecitabine (XELODA) And Oxaliplatin (ELOXATIN) For Resectable Colorectal Metastases In The Liver",
    "phase": "II",
    "primaryCompletionDate": "2004-09-03"
  },
  {
    "nctId": "NCT00070525",
    "officialTitle": "A Phase II Study of R115777 (Zarnestra) (NSC # 702818, IND# 58,359) in Children with Recurrent or Progressive: High Grade Glioma, Medulloblastoma/PNET or Brainstem Glioma",
    "phase": "II",
    "primaryCompletionDate": "2006-09-05"
  },
  {
    "nctId": "NCT00071994",
    "officialTitle": "A Phase II Study of ZD1839 (Iressa, Gefitinib, NSC 715055) in Advanced Unresectable Hepatocellular Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2005-05-18"
  },
  {
    "nctId": "NCT00072150",
    "officialTitle": "Phase II Trial of PS-341 (Bortezomib) in Patients with Previously Treated Advanced Urothelial Tract Transitional Cell Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2006-03-01"
  },
  {
    "nctId": "NCT00072163",
    "officialTitle": "A Phase II Study Of Temozolomide And Thalidomide In Patients With Metastatic Melanoma In The Brain",
    "phase": "II",
    "primaryCompletionDate": "2006-09-28"
  },
  {
    "nctId": "NCT00072475",
    "officialTitle": "A Phase II Study of an Oral VEGF Receptor Tyrosine Kinase Inhibitor (PTK787/ZK222584) (IND #66370, NSC #719335) in Myelodysplastic Syndrome (MDS)",
    "phase": "II",
    "primaryCompletionDate": "2006-11-30"
  },
  {
    "nctId": "NCT00075400",
    "officialTitle": "A Phase II Evaluation Of Gleevec� (NCI-Supplied Agent: STI571 [Imatinib Mesylate], IND #61135, NSC #716051) In The Treatment Of Recurrent Or Persistent Carcinosarcoma Of The Uterus",
    "phase": "II",
    "primaryCompletionDate": "2005-08-01"
  },
  {
    "nctId": "NCT00075491",
    "officialTitle": "A Phase II Evaluation With Correlative Studies Of Fenretinide (NSC 374551-4HPR) As A Single Agent In The Treatment Of Adult Patients With Recurrent Glioblastoma Multiforme",
    "phase": "II",
    "primaryCompletionDate": "2005-03-25"
  },
  {
    "nctId": "NCT00075647",
    "officialTitle": "Phase II Trial of CCI-779 in Locally Advanced or Metastatic Pancreatic Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-03-08"
  },
  {
    "nctId": "NCT00076349",
    "officialTitle": "A Multi-Center Phase II Study to Investigate the Safety and Activity of SDX-105 (Bendamustine) in Combination With Rituximab in Patients With Relapsed Indolent or Mantle Cell Non-Hodgkin's Lymphoma (NHL)",
    "phase": "II",
    "primaryCompletionDate": "2005-12-01"
  },
  {
    "nctId": "NCT00077194",
    "officialTitle": "A Phase II Study Of Depsipeptide, A Histone Deacetylase Inhibitor, In Relapsed Or Refractory Mantle Cell Or Diffuse Large Cell Non-Hodgkin's Lymphoma",
    "phase": "II",
    "primaryCompletionDate": "2005-12-08"
  },
  {
    "nctId": "NCT00077350",
    "officialTitle": "A Phase II Trial of Triapine� (NSC #663249) in Combination with Gemcitabine as Second Line Treatment of Non-Small Cell Lung Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-04-18"
  },
  {
    "nctId": "NCT00077441",
    "officialTitle": "Phase II Trial of PS-341 in Patients with Hepatocellular Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2006-06-25"
  },
  {
    "nctId": "NCT00077467",
    "officialTitle": "A Phase I Study of PS-341 (Velcade, Bortezomib) in Pediatric Patients with Refractory/Recurrent Leukemias",
    "phase": "I",
    "primaryCompletionDate": "2006-03-07"
  },
  {
    "nctId": "NCT00078858",
    "officialTitle": "Prolonged Mycophenolate Mofetil and Truncated Cyclosporine Postgrafting Immunosuppression to Reduce Life-Threatening GVHD after Unrelated Donor Peripheral Blood Cell Transplantation using Nonmyeloablative Conditioning for Patients with Hematologic Malignancies and Renal Cell Carcinoma � A Multi-Center Trial.",
    "phase": "I_II",
    "primaryCompletionDate": "2006-01-28"
  },
  {
    "nctId": "NCT00079404",
    "officialTitle": "A Phase I Study of 17-AAG in Relapsed/Refractory Pediatric Patients with Solid Tumors or Leukemia",
    "phase": "I",
    "primaryCompletionDate": "2006-05-27"
  },
  {
    "nctId": "NCT00079443",
    "officialTitle": "A Phase II Study of Single Agent Depsipeptide (NSC 630176) Followed by a Phase I Study of Rituximab/Fludarabine Combination with an Escalating Dose of Depsipeptide in Relapsed or Refractory Low Grade B Cell Lymphomas",
    "phase": "II",
    "primaryCompletionDate": "2005-09-13"
  },
  {
    "nctId": "NCT00081211",
    "officialTitle": "A Phase I Study Of PV701 In Patients With Head And Neck Squamous Cell Carcinoma",
    "phase": "I",
    "primaryCompletionDate": "2004-07-14"
  },
  {
    "nctId": "NCT00082875",
    "officialTitle": "A Phase 2 Study of EMD 121974 (Cilengitide, NSC 707544) in Patients with Metastatic Melanoma",
    "phase": "II",
    "primaryCompletionDate": "2006-07-01"
  },
  {
    "nctId": "NCT00083109",
    "officialTitle": "Phase I/II Trial Of Low Dose Suramin (CI-1003, NSC#34936) And 5-Fluorouracil In Patients With Metastatic Renal Cell Carcinoma (RCC)",
    "phase": "I_II",
    "primaryCompletionDate": "2005-12-15"
  },
  {
    "nctId": "NCT00084461",
    "officialTitle": "Phase II Study of Depsipeptide in Metastatic Neuroendocrine Tumors",
    "phase": "II",
    "primaryCompletionDate": "2004-10-15"
  },
  {
    "nctId": "NCT00085111",
    "officialTitle": "A Phase I Study of Bevacizumab in Refractory Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2005-10-12"
  },
  {
    "nctId": "NCT00085280",
    "officialTitle": "A Pilot Study to Determine if Downstream Markers of EGFR Linked Signaling Pathways Predict Response to OSI-774 (Erlotinib) in the First-Line Treatment of Patients with Advanced Non-Small Cell Lung Cancer",
    "phase": "NA",
    "primaryCompletionDate": "2006-10-24"
  },
  {
    "nctId": "NCT00085371",
    "officialTitle": "A Phase II Study Of Triapine For Advanced Adenocarcinoma Of The Pancreas",
    "phase": "II",
    "primaryCompletionDate": "2006-07-06"
  },
  {
    "nctId": "NCT00086827",
    "officialTitle": "A Phase II Study of Single Agent Depsipeptide (FK228) (NSC 630176; IND 51,810) in Relapsed Small Cell Lung Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-11-15"
  },
  {
    "nctId": "NCT00086840",
    "officialTitle": "A Phase II Study of CCI-779 in Patients with Relapsed, Refractory or Transformed Chronic Lymphocytic Leukemia",
    "phase": "II",
    "primaryCompletionDate": "2005-08-18"
  },
  {
    "nctId": "NCT00086944",
    "officialTitle": "A Phase I/II Study of G3139 (Genasense) in Combination With RICE Chemotherapy in Relapsed B-Cell Non-Hodgkin's Lymphoma",
    "phase": "I_II",
    "primaryCompletionDate": "2006-07-17"
  },
  {
    "nctId": "NCT00086970",
    "officialTitle": "A Phase I Study Of BG In Combination With Ifosfamide For Advanced Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2005-11-09"
  },
  {
    "nctId": "NCT00086983",
    "officialTitle": "A Phase I Study of XL119 (Rebeccamycin Analogue) in Combination with Oxaliplatin in Patients with Refractory Solid Tumors",
    "phase": "I",
    "primaryCompletionDate": "2006-09-20"
  },
  {
    "nctId": "NCT00087074",
    "officialTitle": "A Trial of CCI-779 in Patients with Soft Tissue Sarcoma.",
    "phase": "II",
    "primaryCompletionDate": "2005-12-27"
  },
  {
    "nctId": "NCT00087191",
    "officialTitle": "Distribution Of The Photosensitizer Motexafin Lutetium And Hypoxia In Patients With Malignancies",
    "phase": "NA",
    "primaryCompletionDate": "2006-01-10"
  },
  {
    "nctId": "NCT00087269",
    "officialTitle": "Phase II Study to Evaluate the Tumor Biochemical Effects of the EGFR Tyrosine Kinase Inhibitor OSI-774 (Erlotinib) Administered Prior to Surgical Resection in Patients with Early Stage Non-Small Cell Lung Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-04-01"
  },
  {
    "nctId": "NCT00087373",
    "officialTitle": "Phase II Study of Intratumoral Injection of rF-TRICOMTM in Patients with Metastatic Melanoma Who Have Detectable Tumor Associated T Cells",
    "phase": "II",
    "primaryCompletionDate": "2006-02-16"
  },
  {
    "nctId": "NCT00088855",
    "officialTitle": "Phase II Study of Bortezomib (PS-341) and Pegylated Liposomal Doxorubicin as Initial Therapy for Adult Patients with Symptomatic Multiple Myeloma",
    "phase": "II",
    "primaryCompletionDate": "2006-10-31"
  },
  {
    "nctId": "NCT00088855",
    "officialTitle": "Phase II Study of Bortezomib (PS-341) and Pegylated Liposomal Doxorubicin as Initial Therapy for Adult Patients with Symptomatic Multiple Myeloma",
    "phase": "II",
    "primaryCompletionDate": "2006-10-31"
  },
  {
    "nctId": "NCT00088894",
    "officialTitle": "A Randomized Phase III Trial Of Gemcitabine Plus Bevacizumab (NSC#704865 IND#7621) Versus Gemcitabine Plus Placebo In Patients With Advanced Pancreatic Cancer",
    "phase": "III",
    "primaryCompletionDate": "2006-06-01"
  },
  {
    "nctId": "NCT00089154",
    "officialTitle": "A Phase II Study of Thrice Weekly Apolizumab in Patients with Chronic Lymphocytic Leukemia : CRC Master Protocol",
    "phase": "II",
    "primaryCompletionDate": "2005-10-31"
  },
  {
    "nctId": "NCT00089349",
    "officialTitle": "A Phase II Study of Campath-1H in Children with Acute Lymphoblastic Leukemia in Second or Greater Relapse or Twice Induction Failure",
    "phase": "II",
    "primaryCompletionDate": "2006-09-20"
  },
  {
    "nctId": "NCT00089388",
    "officialTitle": "A Phase 2 Study of EMD 121974 as Maintenance Therapy for Patients with Acute Myeloid Leukemia in Complete Remission",
    "phase": "II",
    "primaryCompletionDate": "2006-06-07"
  },
  {
    "nctId": "NCT00089661",
    "officialTitle": "A Randomized, Double-Blind, Placebo-Controlled Study to Evaluate AMG 162 in the Treatment of Bone Loss in Subjects Undergoing Aromatase Inhibitor Therapy for Non-metastatic Breast Cancer",
    "phase": "III",
    "primaryCompletionDate": "2006-06-01"
  },
  {
    "nctId": "NCT00091078",
    "officialTitle": "A Phase IIA Study to Determine the Safety and Efficacy of A NCI-Supplied Agent: G3139 (NSC 683428, IND 58842) and Imatinib Mesylate in Patients with Refractory or Relapsed Gastrointestinal Stromal Tumor",
    "phase": "II",
    "primaryCompletionDate": "2006-07-01"
  },
  {
    "nctId": "NCT00091169",
    "officialTitle": "Phase III Randomized Placebo-Controlled Trial to Determine Efficacy of L-Carnitine Supplementation for Fatigue in Patients With Cancer",
    "phase": "III",
    "primaryCompletionDate": "2006-07-13"
  },
  {
    "nctId": "NCT00091182",
    "officialTitle": "A Phase II Study of Oxaliplatin in Children With Recurrent  Solid Tumors",
    "phase": "II",
    "primaryCompletionDate": "2006-02-04"
  },
  {
    "nctId": "NCT00093418",
    "officialTitle": "Phase II Studies of Two Different Schedules and Two Different Doses of the Farnesyl Transferase Inhibitor R115777 (Tipifarnib, Zarnestra�, NSC-702818) for Previously Untreated Acute Myeloid Leukemia (AML) in Patients of Age 70 or Older",
    "phase": "II",
    "primaryCompletionDate": "2006-06-01"
  },
  {
    "nctId": "NCT00093964",
    "officialTitle": "A Multicenter, Open-label, Randomized, Uncontrolled, Phase IIa Trial in Subjects With Recurrent Glioblastoma Multiforme to Investigate the Clinical Activity, Safety, and Tolerability of Cilengitide (EMD 121,974) Administered as a Single Agent.",
    "phase": "II",
    "primaryCompletionDate": "2006-04-01"
  },
  {
    "nctId": "NCT00095693",
    "officialTitle": "Phase II Study of BAY 43-9006 in Patients with Metastatic Thyroid Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2005-08-04"
  },
  {
    "nctId": "NCT00095888",
    "officialTitle": "A Phase II Trial Of Gemcitabine And Triapine In Refractory Metastatic Breast Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-06-07"
  },
  {
    "nctId": "NCT00095966",
    "officialTitle": "A Phase II Study of BAY 43-9006/Gemcitabine for Advanced Pancreatic Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-09-15"
  },
  {
    "nctId": "NCT00096122",
    "officialTitle": "PHASE I-II STUDY OF IDARUBICIN, CYTARABINE AND R115777 (TIPIFARNIB, ZARNESTRA; 702818; IND 58359), A FARNESYLTRANSFERASE INHIBITOR, IN PATIENTS WITH HIGH-RISK MYELODYSPLASTIC SYNDROMES AND ACUTE MYELOID LEUKEMIAS",
    "phase": "I_II",
    "primaryCompletionDate": "2006-09-01"
  },
  {
    "nctId": "NCT00096148",
    "officialTitle": "Randomized Phase II Trial of Idarubicin + Ara-C +/- Bevacizumab in Patients Age < 60 with Untreated Acute Myeloid Leukemia",
    "phase": "II",
    "primaryCompletionDate": "2006-11-01"
  },
  {
    "nctId": "NCT00096434",
    "officialTitle": "Phase II Trial of Raf Kinase Inhibitor BAY 43-9006 as Single Oral Agent in Patients With Metastatic Breast Cancer Previously Exposed to Anthracycline and/or Taxane",
    "phase": "II",
    "primaryCompletionDate": "2006-06-02"
  },
  {
    "nctId": "NCT00096512",
    "officialTitle": "Phase II Evaluation of BAY 43-9006 (NSC-724772) in Patients with Recurrent or Metastatic Head and Neck Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-05-15"
  },
  {
    "nctId": "NCT00098397",
    "officialTitle": "A Phase II Study Of Single Agent Depsipeptide (FK228) In Breast Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-09-16"
  },
  {
    "nctId": "NCT00098527",
    "officialTitle": "A Phase 2 Study of Single Agent Depsipeptide (FK228) in Gastric and Esophageal Cancers",
    "phase": "II",
    "primaryCompletionDate": "2005-09-01"
  },
  {
    "nctId": "NCT00098605",
    "officialTitle": "A Phase 2 Study of GW572016 for Brain Metastases in Patients with HER2-Positive Breast Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-09-10"
  },
  {
    "nctId": "NCT00098618",
    "officialTitle": "A Phase 2 Study Of BAY 43-9006 In Combination With Interferon Alfa-2b In Metastatic Renal Cell Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-01-01"
  },
  {
    "nctId": "NCT00098800",
    "officialTitle": "A Multicenter, Randomized Double-Blinded Trial for Chemoprevention of Ovarian Cancer: Modulation of Biomarkers and Spectral Properties Using Fluoresence and Contrast Enhanced Ultrasound in High-Risk Women using Fenretinide (4-HPR)",
    "phase": "II",
    "primaryCompletionDate": "2006-08-31"
  },
  {
    "nctId": "NCT00101114",
    "officialTitle": "A Phase II Study of the RAF-Kinase Inhibitor BAY 43-9006 (NSC-724772, IND-69,896) in Combination with Interferon-Alpha 2B in Patients with Advanced Renal Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-05-07"
  },
  {
    "nctId": "NCT00103610",
    "officialTitle": "A Multicenter, Randomized, Double-Blind, Placebo-Controlled, Comparative Trial of AMD3100 Plus G-CSF Versus G-CSF Plus Placebo to Mobilize and Collect ? 5 * 10^6 CD34+ Cells/kg in Non-Hodgkin's Lymphoma Patients for Autologous Transplantation",
    "phase": "III",
    "primaryCompletionDate": "2006-07-01"
  },
  {
    "nctId": "NCT00103662",
    "officialTitle": "A Multicenter, Randomized, Double-Blind, Placebo-Controlled, Comparative Trial of AMD3100 Plus G-CSF Versus G-CSF Plus Placebo to Mobilize and Collect ? 6*10^6 CD34+ Cells/kg in Multiple Myeloma Patients for Autologous Transplantation",
    "phase": "III",
    "primaryCompletionDate": "2006-10-01"
  },
  {
    "nctId": "NCT00107445",
    "officialTitle": "Evaluation of Hypoxia by EF5 Binding in Gynecologic Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-09-30"
  },
  {
    "nctId": "NCT00114257",
    "officialTitle": "A  Phase I Study of 5-AZA-2'-Deoxycytidine and Depsipeptide in Patients with Relapsed/Refractory Leukemia, Myelodysplastic Syndromes, or Myeloproliferative Disease",
    "phase": "I",
    "primaryCompletionDate": "2006-10-24"
  },
  {
    "nctId": "NCT00114283",
    "officialTitle": "A Phase 2 Trial of GW572016 in Patients With Metastatic and Recurrent Squamous Cell Carcinomas of the Head and Neck",
    "phase": "II",
    "primaryCompletionDate": "2006-10-26"
  },
  {
    "nctId": "NCT00115505",
    "officialTitle": "Quality of Life, Employment and Informal Care Cost Analysis in Women Receiving Adjuvant Chemotherapy for  Breast Cancer With 0-3 Positive Axillary Lymph Nodes",
    "phase": "NA",
    "primaryCompletionDate": "2006-10-01"
  },
  {
    "nctId": "NCT00118092",
    "officialTitle": "A Phase II Trial of 17-Allylamino-17-Demethoxygeldanamycin (17-AAG) in Patients with Hormone-Refractory Metastatic Prostate Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-05-31"
  },
  {
    "nctId": "NCT00121628",
    "officialTitle": "A Phase 2, Open-label Study of AMG 706 to Treat Subjects With Locally Advanced or Metastatic Thyroid Cancer",
    "phase": "II",
    "primaryCompletionDate": "2006-11-01"
  },
  {
    "nctId": "NCT00123474",
    "officialTitle": "A Randomized Two-by-Two, Multicenter, Open-Label Phase III Study of BMS-354825 Administered Orally at a Dose of 50 mg or 70 mg Twice Daily or 100 mg or 140 mg Once Daily in Subjects With Chronic Phase Philadelphia Chromosome or BCR-ABL Positive Chronic Myelogenous Leukemia Who Are Resistant or Intolerant to Imatinib Mesylate (Gleevec)",
    "phase": "III",
    "primaryCompletionDate": "2006-09-01"
  },
  {
    "nctId": "NCT00123487",
    "officialTitle": "A Randomized Two-Arm, Multicenter, Open-Label Phase III Study of BMS-354825 Administered Orally at a Dose of 70 mg Twice Daily or 140 mg Once Daily in Subjects With Chronic Myeloid Leukemia in Accelerated Phase or in Myeloid or Lymphoid Blast Phase or With Philadelphia Chromosome Positive Acute Lymphoblastic Leukemia Who Are Resistant or Intolerant to Imatinib Mesylate (Gleevec)",
    "phase": "III",
    "primaryCompletionDate": "2006-11-01"
  },
  {
    "nctId": "NCT00132067",
    "officialTitle": "A Phase II Evaluation of Vorinostat, (SAHA, NCI-Supplied Agent [NSC #701852]) in the Treatment of Persistent or Recurrent Epithelial Ovarian or Primary Peritoneal Carcinoma",
    "phase": "II",
    "primaryCompletionDate": "2006-08-04"
  },
  {
    "nctId": "NCT00165399",
    "officialTitle": "Docetaxel, Estramustine and Short Term Androgen Withdrawal for Patients with a Rising PSA After Definitive Local Treatment",
    "phase": "II",
    "primaryCompletionDate": "2005-04-01"
  },
  {
    "nctId": "NCT00187226",
    "officialTitle": "A Phase II Study Of Image-Guided Radiation Therapy For Pediatric CNS Tumors And Quantification Of Radiation-Related CNS Effects",
    "phase": "II",
    "primaryCompletionDate": "2005-01-31"
  },
  {
    "nctId": "NCT00189137",
    "officialTitle": "PHASE II EVALUATION OF IFOSFAMIDE PLUS DOXORUBICIN & FILGRASTIM VERSUS GEMCITABINE PLUS DOCETAXEL & FILGRASTIM IN THE TREATMENT OF LOCALIZED POOR PROGNOSIS SOFT TISSUE SARCOMA",
    "phase": "II",
    "primaryCompletionDate": "2006-08-26"
  },
  {
    "nctId": "NCT00223925",
    "officialTitle": "A Randomized, Double-blind, Placebo-controlled, Dose-ranging Study to Assess the Safety, Tolerability, and Prophylactic Anti-cytomegalovirus Activity of Maribavir in Recipients of Allogeneic Stem Cell Transplants",
    "phase": "II",
    "primaryCompletionDate": "2006-04-01"
  },
  {
    "nctId": "NCT00253500",
    "officialTitle": "Prediction of Response or Resistance to Dose Intensified Pre-operative Epirubicin Therapy of Operable Breast Cancer",
    "phase": "II",
    "primaryCompletionDate": "2005-09-01"
  },
  {
    "nctId": "NCT00253565",
    "officialTitle": "A Phase I Dose Escalation Study of Imatinib Mesylate (Gleevec/ STI571) Plus Capecitabine (Xeloda) in Advanced Solid Tumor Malignancies",
    "phase": "I",
    "primaryCompletionDate": "2006-07-01"
  },
  {
    "nctId": "NCT00255762",
    "officialTitle": "Phase II Trial of Carboplatin, Weekly Paclitaxel and Biweekly Bevacizumab in Patients with Unresectable Stage IV Melanoma",
    "phase": "II",
    "primaryCompletionDate": "2006-12-28"
  },
  {
    "nctId": "NCT00268359",
    "officialTitle": "Bevacizumab in Combination with Irinotecan for Malignant Gliomas",
    "phase": "II",
    "primaryCompletionDate": "2006-08-01"
  },
  {
    "nctId": "NCT00315731",
    "officialTitle": "A Multi-Center Study to Examine the Pharmacokinetics, Whole Body and Organ Dosimetry, and Biodistribution of Fission-Derived Iodine I 131 Tositumomab for Patients With Previously Untreated or Relapsed Follicular or Transformed Follicular Non-Hodgkin's Lymphoma",
    "phase": "I",
    "primaryCompletionDate": "2006-12-01"
  },
  {
    "nctId": "NCT00317876",
    "officialTitle": "Dose-finding Study for Cyclophosphamide as Conditioning Regimens for Bone Marrow Transplantation from Related Donors in Patients with Fanconi Anemia",
    "phase": "NA",
    "primaryCompletionDate": "2003-07-03"
  },
  {
    "nctId": "NCT00340808",
    "officialTitle": "A Molecular Staging Study of Endometrial Carcinoma",
    "phase": "NA",
    "primaryCompletionDate": "2006-06-01"
  },
  {
    "nctId": "NCT00343629",
    "officialTitle": "Bioequivalency Study of Sulindac in Capsule vs. Tablet Formulations",
    "phase": "NA",
    "primaryCompletionDate": "2006-04-14"
  },
  {
    "nctId": "NCT00352521",
    "officialTitle": "Dynamic Contrast-Enhanced Magnetic Resonance Imaging with Bevacizumab in Combination with Irinotecan for Malignant Gliomas",
    "phase": "II",
    "primaryCompletionDate": "2006-12-01"
  },
  {
    "nctId": "NCT00394511",
    "officialTitle": "Phase III Randomized Evaluation of Adjuvant Radiotherapy vs No Adjuvant Therapy Following Radical Prostatectomy and Pelvic Lymphadenectomy in Surgical Stage C Adenocarcinoma of the Prostate",
    "phase": "III",
    "primaryCompletionDate": "2006-12-01"
  },
  {
    "nctId": "NCT00575068",
    "officialTitle": "A Phase I/II Trial of Anti-CD80 Monoclonal Antibody (IDEC-114) Therapy for Patients With Relapsed or Refractory Follicular Lymphoma",
    "phase": "I_II",
    "primaryCompletionDate": "2002-09-01"
  },
  {
    "nctId": "NCT00582725",
    "officialTitle": "Phase II Trial of Rituximab-CHOP (R-CHOP) plus GM-CSF for Previously Untreated Diffuse Large Cell Lymphoma in the Elderly",
    "phase": "II",
    "primaryCompletionDate": "2006-04-24"
  },
  {
    "nctId": "NCT00586326",
    "officialTitle": "MammoSite Radiation Therapy System (RTS) as the Sole Radiation Therapy Technique for Ductal Carcinoma In-Situ (DCIS)",
    "phase": "II",
    "primaryCompletionDate": "2006-01-01"
  },
  {
    "nctId": "NCT00611000",
    "officialTitle": "Effect of Folate on Colonic and Blood Cells",
    "phase": "I",
    "primaryCompletionDate": "2006-01-17"
  },
  {
    "nctId": "NCT00769548",
    "officialTitle": "A PHASE III TRIAL COMPARING WHOLE PELVIC IRRADIATION FOLLOWED BY A CONEDOWN BOOST TO BOOST IRRADIATION ONLY AND COMPARING NEOADJUVANT TO ADJUVANT TOTAL ANDROGEN SUPPRESSION (TAS)",
    "phase": "III",
    "primaryCompletionDate": "2001-04-01"
  },
  {
    "nctId": "NCT00779402",
    "officialTitle": "Autologous PAP-loaded Dendritic Cell Vaccine (APC8015, Provenge [TM]) in Patients With Non-metastatic Prostate Cancer Who Experience PSA Elevation Following Radical Prostatectomy: a Randomized, Controlled, Double-blind Trial",
    "phase": "III",
    "primaryCompletionDate": "2006-08-01"
  },
  {
    "nctId": "NCT00849030",
    "officialTitle": "A Randomised, Double Blind Trial Comparing Arimidex Alone With Nolvadex Alone With Arimidex and Nolvadex in Combination, as Adjuvant Treatment in Post-Menopausal Women With Breast Cancer",
    "phase": "III",
    "primaryCompletionDate": "2001-06-01"
  },
  {
    "nctId": "NCT00898833",
    "officialTitle": "Laboratory Studies in Hormone Refractory Prostate Cancer",
    "phase": "NA",
    "primaryCompletionDate": "2005-12-01"
  },
  {
    "nctId": "NCT00899223",
    "officialTitle": "The CALGB Leukemia Tissue Bank",
    "phase": "NA",
    "primaryCompletionDate": "2001-05-15"
  },
  {
    "nctId": "NCT01056614",
    "officialTitle": "Conditioning for Hematopoietic Stem Cell Transplantation with Fludarabine plus Targeted IV Busulfan and GVHD Prophylaxis with Thymoglobulin, Tacrolimus and Methotrexate in Patients with Myeloid Malignancies",
    "phase": "II",
    "primaryCompletionDate": "2005-08-04"
  },
  {
    "nctId": "NCT01177371",
    "officialTitle": "High-dose Busulfan, High-dose Cyclophosphamide, and Allogeneic Bone Marrow Transplantation for Leukemia, Myelodysplastic Syndromes, Multiple Myeloma and Lymphoma",
    "phase": "NA",
    "primaryCompletionDate": "2000-02-28"
  },
  {
    "nctId": "NCT02090933",
    "officialTitle": "Clinical Protocol for an Open Label Study of Celecoxib (SC-58635) on the Acute Effect of Human UV-Irradiation",
    "phase": "II",
    "primaryCompletionDate": "2004-12-29"
  },
  {
    "nctId": "NCT02099136",
    "officialTitle": "Clinical Protocol for a Double-Blind, Placebo-Controlled, Randomized Dose-Ranging Study of Celecoxib (SC-58635) on the Acute Effect of Human UV-Irradiation",
    "phase": "II",
    "primaryCompletionDate": "2001-09-11"
  }
]
```