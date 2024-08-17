package com.example.sanjay_kumar777.learn_spring_framework;

import game.GameRunner;
import game.Mario;
import game.Pacman;
import game.SuperContra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		Mario marioGame = new Mario();
//		SuperContra superContra = new SuperContra();
		Pacman pacman = new Pacman();
		GameRunner gameRunner = new GameRunner(pacman);
		gameRunner.run();
	}

}
