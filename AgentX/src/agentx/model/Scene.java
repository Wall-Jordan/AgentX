/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

/**
 *
 * @author matiasmikkola
 */
public class Scene {

    private static Scene[] createScenes() throws GameBoardControlException {
        return null;
    }

    private static class GameBoardControlException extends Exception {

        public GameBoardControlException() {
        }
    }

    Scene[] scenes = new Scene[10];
    
    
    public enum SectionOne {

        drill,
        learnDrill,
        calcFuel,
        learnFight,
        hammer,
        learnHammer,
        cave,
        fixShip,
        fightBoss,
        takeOff;

    }

    public enum SectionTwo {

        calcFuel,
        enterSchool,
        toolshop,
        shopTeachersOffice,
        roboticsLab,
        cafeteria,
        chemistryLab,
        fixShip,
        fightBoss,
        takeOff;

    }

    public enum SectionThree {

        calcFuel,
        oldVillage,
        waterfall,
        findToolbox,
        findSupplybox,
        drillFuel,
        puzzle,
        fixShip,
        fightBoss,
        takeOff;

    }

}
