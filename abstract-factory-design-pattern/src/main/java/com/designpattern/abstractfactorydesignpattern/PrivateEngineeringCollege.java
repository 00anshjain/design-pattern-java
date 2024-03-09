package com.designpattern.abstractfactorydesignpattern;

import java.util.Arrays;
import java.util.List;

public class PrivateEngineeringCollege implements College {
    @Override
    public Long getFees() {
        return 15000L;
    }

    @Override
    public List<String> getCourseList() {
        return Arrays.asList("DSA.pvt", "DBMS.pvt");
    }
}
