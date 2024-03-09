package com.designpattern.abstractfactorydesignpattern;

import java.util.Arrays;
import java.util.List;

public class GovernmentEngineeringCollege implements College {

    @Override
    public Long getFees() {
        return 150L;
    }

    @Override
    public List<String> getCourseList() {
        return Arrays.asList("DSA.gov", "DBMS.gov");
    }
}
