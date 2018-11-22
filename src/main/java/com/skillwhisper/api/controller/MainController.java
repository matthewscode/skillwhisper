package com.skillwhisper.api.controller;

import com.skillwhisper.api.dao.WhisperDao;
import com.skillwhisper.api.entity.Whisper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class MainController {

    @Autowired
    private WhisperDao whisperDao;

    @RequestMapping("/hello/{name}")
    public String returnHello(@PathVariable String name){
        Whisper whisper = new Whisper();
        whisper.setName(name);
        whisper.setCategory("category");
        whisperDao.save(whisper);
        List<Whisper> whisperList = whisperDao.findByName(name);
        String message = whisperList.get(0).getName();
        return "added whisper was: " + message;
    }
}
