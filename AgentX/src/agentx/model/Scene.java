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






//
    private static Scene[] createScenes() throws GameBoardControlException {
        return null;
    }

    private static class GameBoardControlException extends Exception {

        public GameBoardControlException() {
        }
    }

    public enum SceneType {

        combat,
        puzzle,
        explore,
        takeoff;

    }
}
