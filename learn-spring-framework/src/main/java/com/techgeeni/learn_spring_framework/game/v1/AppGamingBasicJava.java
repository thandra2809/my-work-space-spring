package com.techgeeni.learn_spring_framework.game.v1;

public class AppGamingBasicJava {
    static void main() {
        // var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
