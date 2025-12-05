package com.techgeeni.learn_spring_framework.game.v3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole gamingConsole() {
        return new PacManGame();
    }

    @Bean GameRunner gameRunner(GamingConsole gamingConsole) {
        var gameRunner = new GameRunner(gamingConsole);
        return gameRunner;
    }
}
