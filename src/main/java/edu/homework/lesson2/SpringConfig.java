package edu.homework.lesson2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("edu.homework.lesson2")
@PropertySource("classpath:myPlayer.properties")
public class SpringConfig {
}
