package com.designpattern.abstractfactorydesignpattern;

import java.util.HashMap;
import java.util.Map;

public class GovernmentUniversityFactory extends UniversityFactory {
    public static Map<String, College> branchCollegeMap = new HashMap<>();

    public GovernmentUniversityFactory() {
        branchCollegeMap.put("MEDICAL", new GovernmentMedicalCollege());
        branchCollegeMap.put("ENGINEERING", new GovernmentEngineeringCollege());
    }

    public College getCollege(String branch) {
        return branchCollegeMap.get(branch);
    }
}
