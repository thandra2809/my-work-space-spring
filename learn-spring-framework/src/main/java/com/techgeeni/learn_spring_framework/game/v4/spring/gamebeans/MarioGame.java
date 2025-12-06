package com.techgeeni.learn_spring_framework.game.v4.spring.gamebeans;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Mario Game up");
    }

    public void down(){
        System.out.println("Mario Game down");
    }

    public void left(){
        System.out.println("Mario Game left");
    }

    public void right(){
        System.out.println("Mario Game right");
    }
}

