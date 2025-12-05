package com.techgeeni.learn_spring_framework.game.v3;


public class PacManGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("PacManGame Game up");
    }

    @Override
    public void down() {
        System.out.println("PacManGame Game down");
    }

    @Override
    public void left() {
        System.out.println("PacManGame Game left");
    }

    @Override
    public void right() {
        System.out.println("PacManGame Game right");
    }
}
