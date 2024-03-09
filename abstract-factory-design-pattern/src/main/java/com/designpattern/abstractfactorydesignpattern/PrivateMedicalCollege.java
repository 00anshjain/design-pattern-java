package com.designpattern.abstractfactorydesignpattern;

import java.util.Arrays;
import java.util.List;

public class PrivateMedicalCollege implements College {
    @Override
    public Long getFees() {
        return 20000L;
    }

    @Override
    public List<String> getCourseList() {
        return Arrays.asList("Ophthalmology.pvt", "GeneralMedicine.pvt", "Pediatrics.pvt");
    }
}
