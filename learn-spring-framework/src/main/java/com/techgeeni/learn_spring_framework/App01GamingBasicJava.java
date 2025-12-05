package com.techgeeni.learn_spring_framework;

import com.techgeeni.learn_spring_framework.game.v2.GameRunner;
import com.techgeeni.learn_spring_framework.game.v2.MarioGame;
import com.techgeeni.learn_spring_framework.game.v2.PacManGame;
import com.techgeeni.learn_spring_framework.game.v2.SuperContraGame;

public class App01GamingBasicJava {
    static void main() {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacManGame();
        var gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();
    }
}
