package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    defime private field for dependency
    private Coach myCoach;

//    define constructor for dependency injection

//    if you have only one constructor then @autowired on constructor is optional

    @Autowired
    public DemoController(Coach theCoach)
    {
        myCoach = theCoach;
    }

//    add getmapping

    @GetMapping("/dailyWorkout")
    public  String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
