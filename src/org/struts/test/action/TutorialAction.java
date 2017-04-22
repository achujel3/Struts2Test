package org.struts.test.action;

import org.struts.test.service.TutorialService;

public class TutorialAction {

    private String bestTutorialsWebsite;
    private String language;

    public String execute() {
        System.out.println("Hello from execute");
        TutorialService tutorialService = new TutorialService();
        setBestTutorialsWebsite(tutorialService.getBestTutorialsWebsite(getLanguage()));
        return "success";
    }

    public String getBestTutorialsWebsite() {
        return bestTutorialsWebsite;
    }

    public void setBestTutorialsWebsite(String bestTutorialsWebsite) {
        this.bestTutorialsWebsite = bestTutorialsWebsite;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
