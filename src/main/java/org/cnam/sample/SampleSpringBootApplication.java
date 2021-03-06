package org.cnam.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.Entity;

@ComponentScan (basePackages =  ("org.cnam.*"))
@EntityScan("org.cnam.sample.model")
@EnableJpaRepositories("org.cnam.sample.repository")
@EnableAutoConfiguration
@EnableTransactionManagement
public class SampleSpringBootApplication {

    public static void main (String[] args)
    {
        SpringApplication.run(SampleSpringBootApplication.class, args);
    }
}
