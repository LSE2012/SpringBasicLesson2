package edu.homework.lesson2;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("edu.homework.lesson2")
@PropertySource("classpath:myPlayer.properties")
public class SpringConfig {
    @Bean(initMethod = "doChangeStatusPlayer",
          destroyMethod = "doClothePlayer")
    public MyPlayer myPlayer() {
        return new MyPlayer(classicMusic());
    }
    @Bean
    @Scope("prototype")
    public Computer computer() {
        return new Computer(myPlayer());
    }
    @Bean(initMethod = "doMyInit", destroyMethod = "doMyDestroy")
    public ClassicMusic classicMusic() {
        return new ClassicMusic();
    }
    @Bean(initMethod = "doMyInit", destroyMethod = "doMyDestroy")
    public RockMusic rockMusic() {
       return new RockMusic();
    }
    @Bean(initMethod = "doMyInit", destroyMethod = "doMyDestroy")
    public RapMusic rapMusic() {
        return new RapMusic();
    }

}
