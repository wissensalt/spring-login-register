package com.wissensalt.rnd.slr.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created on 1/3/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@EntityScan("com.wissensalt.rnd.slr")
@SpringBootApplication
public class SlrApiApplication {

    public static void main(String [] args) {
        SpringApplication.run(SlrApiApplication.class);
    }
}
