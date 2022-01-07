package com.pbo.pmo.controller;

import com.pbo.pmo.Pojos.TeamRequest;
import com.pbo.pmo.model.Team;
import com.pbo.pmo.service.TeamDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
@CrossOrigin
public class TeamController {
    @Autowired
    private TeamDomain teamDomain;

    @GetMapping("/getAll")
    public List<Team> listAll() {
        return teamDomain.getAllTeam();
    }

    @PostMapping("/addTeam")
    public Team addTeam(@RequestBody TeamRequest teamRequest) {
        return teamDomain.addTeam(teamRequest);
    }

    @PostMapping("/addMember")
    public Team addMember(@RequestBody TeamRequest teamRequest) {
        return teamDomain.addMember(teamRequest);
    }
}
