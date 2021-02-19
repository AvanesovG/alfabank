package com.avanes.alfabank.services;

import com.avanes.alfabank.model.Gif;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "gif", url = "api.giphy.com/v1/gifs/random")
public interface GifService {

    @PostMapping(value = "/id_gif_rich", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Gif getGifRich(@RequestParam(value = "gif") MultipartFile file);

    @RequestMapping(method = RequestMethod.GET)
    Gif getGifBroke(@RequestParam(name = "app_id_gif") String gifAppId, @RequestParam(name = "app.broke") String broke);
}
