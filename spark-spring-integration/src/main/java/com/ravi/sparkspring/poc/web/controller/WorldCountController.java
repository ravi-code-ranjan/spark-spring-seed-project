package com.ravi.sparkspring.poc.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ravi.sparkspring.poc.beans.Count;
import com.ravi.sparkspring.poc.job.WordCountJob;

@RequestMapping("api")
@Controller
public class WorldCountController {

    @Autowired
    WordCountJob wordCountJob;

    @RequestMapping("wordcount")
    public ResponseEntity<List<Count>> words() {
        return new ResponseEntity<>(wordCountJob.count(), HttpStatus.OK);
    }
    
}
