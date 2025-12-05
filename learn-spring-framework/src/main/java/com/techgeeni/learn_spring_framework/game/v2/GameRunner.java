package com.techgeeni.learn_spring_framework.game.v2;

public class GameRunner {

    // MarioGame game;
    GamingConsole game;

//    public GameRunner(MarioGame game) {
//        this.game = game;
//    }

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Welcome to the Mario Game Application");

        game.up();
        game.down();
        game.left();
        game.right();

    }
}
