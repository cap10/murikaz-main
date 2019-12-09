package com.cap10mycap10.murikazrestapi;

import com.cap10mycap10.murikazrestapi.clients.CardClient;
import com.cap10mycap10.murikazrestapi.clients.CountryClient;
import com.cap10mycap10.murikazrestapi.pojo.Result;
import com.cap10mycap10.murikazrestapi.pojo.ResultCountry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
@EnableFeignClients
public class MurikazRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MurikazRestApiApplication.class, args);
    }

    /*@Bean
    CommandLineRunner runner(final CardClient cardClient) {
        return args -> {
            final Result page = cardClient.getCards(0, 20);
            log.info("Result {}", page);
        };
    }
*/
    @Bean
    CommandLineRunner runner(final CountryClient countryClient) {
        return args -> {
            final ResultCountry resultCountry = countryClient.getCountries();
            log.info("Result {}", resultCountry);
        };
    }


}
