package org.struts.test.service;

public class TutorialService {

    public String getBestTutorialsWebsite(String language) {
        if (language.equals("java")) {
            return "Java Brains";
        } else {
            return "Language is not supported";
        }
    }

}
