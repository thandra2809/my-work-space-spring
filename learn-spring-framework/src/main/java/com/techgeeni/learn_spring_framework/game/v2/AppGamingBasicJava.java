package com.techgeeni.learn_spring_framework.game.v2;

import com.techgeeni.learn_spring_framework.game.v2.GameRunner;
import com.techgeeni.learn_spring_framework.game.v2.SuperContraGame;

public class AppGamingBasicJava {
    static void main() {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacManGame();
        var gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();
    }
}
