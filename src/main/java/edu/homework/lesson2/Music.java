package edu.homework.lesson2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface Music {
    String getSong();
    String getAuthorSong();
    String getGenre();

}
