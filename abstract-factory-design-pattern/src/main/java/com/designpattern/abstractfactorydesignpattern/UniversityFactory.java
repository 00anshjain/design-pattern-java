package com.designpattern.abstractfactorydesignpattern;

public abstract class UniversityFactory {
    static int cutOff = 109;

    public static UniversityFactory getUniversity(int score) {
        if (score >= cutOff) {
            return new GovernmentUniversityFactory();
        }
        return new PrivateUniversityFactory();
    }

    public abstract College getCollege(String branch);
}
