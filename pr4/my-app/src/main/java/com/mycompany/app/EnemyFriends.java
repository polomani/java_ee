package com.mycompany.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Polomani on 12.02.2016.
 */
@Aspect
@Component
public class EnemyFriends {
    @Before("execution(* com.mycompany.app.Enemy.play())")
    public void callFriends () {
            System.out.println("Ooops! Enemy's friends are coming!");
    }
}
