package com.avanes.alfabank.services;

import com.avanes.alfabank.model.Currency;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;


@FeignClient(url = "https://openexchangerates.org", name = "Currency-Service")
public interface CurrencyService {


    @RequestMapping(method = RequestMethod.GET, path = "api/latest.json")
    Currency getCurrencyLatest(@RequestParam(name = "app_id") String appId, @RequestParam(name = "base") String base);

    @RequestMapping(method = RequestMethod.GET, path = "api/historical/{data}.json")
    Currency getCurrencyHistory(@RequestParam(name = "app_id") String appId,
                                @PathVariable String data,
                                @RequestParam(name = "base") String base);

}

