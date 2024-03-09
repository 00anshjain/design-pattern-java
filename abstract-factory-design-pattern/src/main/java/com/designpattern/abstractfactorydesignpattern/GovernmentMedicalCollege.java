package com.designpattern.abstractfactorydesignpattern;

import java.util.Arrays;
import java.util.List;

public class GovernmentMedicalCollege implements College {
    @Override
    public Long getFees() {
        return 200L;
    }

    @Override
    public List<String> getCourseList() {
        return Arrays.asList("Ophthalmology.gov", "GeneralMedicine.gov", "Pediatrics.gov");
    }
}
