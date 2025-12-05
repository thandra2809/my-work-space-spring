package com.techgeeni.learn_spring_framework.game.v3;


public class GameRunner {

    GamingConsole game;

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
