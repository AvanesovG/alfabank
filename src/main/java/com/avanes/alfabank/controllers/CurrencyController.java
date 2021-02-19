package com.avanes.alfabank.controllers;

import com.avanes.alfabank.model.Currency;
import com.avanes.alfabank.model.Gif;
import com.avanes.alfabank.services.CurrencyService;
import com.avanes.alfabank.services.GifService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class CurrencyController {
    @Value("{currency.app_id}")
    private String appId;
    @Value("{currency.base}")
    private String base;
    @Value("{currency.app_id_gif }")
    private String gifAppId;
    @Value("{gif.app.rich}")
    private String rich;
    @Value("{gif.app.broke}")
    private String broke;
    private byte[] gif;

    private String data = LocalDate.now().minusDays(1).toString();


    private final CurrencyService service;
    private final GifService gifService;

    public CurrencyController(CurrencyService service, GifService gifService) {
        this.service = service;
        this.gifService = gifService;
    }

    @GetMapping("/app")
    @ResponseBody
    public Currency app(String currencyСode) {
        Currency now = service.getCurrencyLatest(appId, base);
      //  Currency yesterday = service.getCurrencyHistory(appId, data, data);
      //  Double ratesNow = Double.parseDouble(now.getRates().get(currencyСode));
      //  Double ratesYesterday = Double.parseDouble(yesterday.getRates().get(currencyСode));

       //if (ratesYesterday < ratesNow) {
       //    gif = gifService.getGifRich(M).getGif();
       //    System.out.println(gif);
       //} else {
       //    gif = gifService.getGifBroke(gifAppId, broke).getGif();
       //    System.out.println(gif.toString());

       //}


//        Currency currencyModel = service.getCurrencyLatest(appId, base);
      System.out.println(now.getTimestamp());
        return now;


    }
}
