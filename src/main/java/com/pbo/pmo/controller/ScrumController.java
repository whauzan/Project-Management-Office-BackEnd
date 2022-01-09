package com.pbo.pmo.controller;


import com.pbo.pmo.Pojos.ScrumRequest;
import com.pbo.pmo.model.Scrum;
import com.pbo.pmo.service.ScrumDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scrum")
@CrossOrigin
public class ScrumController {

    @Autowired
    private ScrumDomain scrumDomain;

    @PostMapping("/add")
    public Scrum addScrum(@RequestBody ScrumRequest scrumRequest){
        return scrumDomain.addScrum(scrumRequest);
    }

    @GetMapping("/get")
    public List<Scrum> list() {
        return scrumDomain.getAllScrum();
    }
}
