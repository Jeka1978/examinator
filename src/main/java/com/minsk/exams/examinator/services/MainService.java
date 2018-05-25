package com.minsk.exams.examinator.services;

import com.minsk.mystarter.Main;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @Main
    public void doWork(){
        System.out.println("УРА УРА!!! СЛава КПССС");
    }
}
