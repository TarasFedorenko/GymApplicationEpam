package com.epam;

import com.epam.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GymApplicationEpam
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        context.close();
    }
}
