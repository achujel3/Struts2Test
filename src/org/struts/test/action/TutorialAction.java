package org.struts.test.action;

import org.struts.test.service.TutorialService;

public class TutorialAction {

    private String bestTutorialsWebsite;

    public String execute() {
        System.out.println("Hello from execute");
        TutorialService tutorialService = new TutorialService();
        setBestTutorialsWebsite(tutorialService.getBestTutorialsWebsite());
        return "success";
    }

    public String getBestTutorialsWebsite() {
        return bestTutorialsWebsite;
    }

    public void setBestTutorialsWebsite(String bestTutorialsWebsite) {
        this.bestTutorialsWebsite = bestTutorialsWebsite;
    }
}
