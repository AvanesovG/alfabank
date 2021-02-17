package com.avanes.alfabank.controllers;

import com.avanes.alfabank.model.Currency;
import com.avanes.alfabank.services.LatestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
    @Value("${latest.app_id}")
    private String appId;
    @Value("${latest.base}")
    private String base;
    private final LatestService service;

    public CurrencyController(LatestService service) {
        this.service = service;

    }
    @GetMapping("/app")
    @ResponseBody
    public String app() {


        Currency currencyModel = service.getLatest(appId, base);
        System.out.println(currencyModel.getTimestamp());
        return currencyModel.toString();


    }
}
