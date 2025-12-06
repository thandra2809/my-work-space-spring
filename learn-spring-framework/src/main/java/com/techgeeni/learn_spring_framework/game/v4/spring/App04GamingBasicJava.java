package com.techgeeni.learn_spring_framework.game.v4.spring;


import com.techgeeni.learn_spring_framework.game.v4.spring.gamebeans.GameRunner;
import com.techgeeni.learn_spring_framework.game.v4.spring.gamebeans.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.techgeeni.learn_spring_framework.game.v4.spring.gamebeans")
public class App04GamingBasicJava {

//    @Bean
//    public GamingConsole gamingConsole() {
//        return new PacManGame();
//    }
//
//    @Bean
//    GameRunner gameRunner(GamingConsole gamingConsole) {
//        var gameRunner = new GameRunner(gamingConsole);
//        return gameRunner;
//    }

    static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(App04GamingBasicJava.class)){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }


}


