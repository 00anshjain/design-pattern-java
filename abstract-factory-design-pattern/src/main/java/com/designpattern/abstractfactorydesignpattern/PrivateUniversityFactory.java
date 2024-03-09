package com.designpattern.abstractfactorydesignpattern;

import java.util.HashMap;
import java.util.Map;

public class PrivateUniversityFactory extends UniversityFactory {
    public static Map<String, College> branchCollegeMap = new HashMap<>();

    public PrivateUniversityFactory() {
        branchCollegeMap.put("MEDICAL", new PrivateMedicalCollege());
        branchCollegeMap.put("ENGINEERING", new PrivateEngineeringCollege());
    }

    public College getCollege(String branch) {
        return branchCollegeMap.get(branch);
    }
}
