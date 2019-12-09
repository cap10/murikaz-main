package com.cap10mycap10.murikazrestapi.clients;


import com.cap10mycap10.murikazrestapi.config.FeignConfig;
import com.cap10mycap10.murikazrestapi.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "card-client", url = "http://matsimbasystems.com:8080", configuration = FeignConfig.class)
@Service
public interface CardClient {

    @GetMapping("/api/v1/cards/{page}/{size}")
    Result getCards(@PathVariable("page") int page, @PathVariable("size") int size);
}
