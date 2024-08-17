package com.example.sanjay_kumar777.learn_spring_framework;

import com.example.sanjay_kumar777.learn_spring_framework.enterprise.example.MyWebController;
import game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"game","com.example.sanjay_kumar777.learn_spring_framework.enterprise.example"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		 GameRunner runner = context.getBean(GameRunner.class);
		 runner.run();
		 MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
//		Mario marioGame = new Mario();
//		SuperContra superContra = new SuperContra();
//		GameConsole gameConsole = new Pacman();
//		GameRunner gameRunner = new GameRunner(gameConsole);
//		gameRunner.run();
	}

}
