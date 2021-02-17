package com.avanes.alfabank.services;

import com.avanes.alfabank.model.Currency;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;


@FeignClient(url = "https://openexchangerates.org", name = "Latest-Service")
public interface LatestService {


    @RequestMapping(method = RequestMethod.GET, path = "api/latest.json")
    public Currency getLatest(@RequestParam(name = "app_id") String app_id, @RequestParam(name = "base")  String base);


}

