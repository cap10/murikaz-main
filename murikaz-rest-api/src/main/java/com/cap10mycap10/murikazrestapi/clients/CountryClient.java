package com.cap10mycap10.murikazrestapi.clients;

import com.cap10mycap10.murikazrestapi.config.FeignConfig;
import com.cap10mycap10.murikazrestapi.pojo.Result;
import com.cap10mycap10.murikazrestapi.pojo.ResultCountry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "country-client", url = "http://localhost:8080", configuration = FeignConfig.class)
@Service
public interface CountryClient {
    @GetMapping("/api/v1/country")
    ResultCountry getCountries();
}
