package com.techgeeni.learn_spring_framework.game.v3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {
    static void main() {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }

    }
}
