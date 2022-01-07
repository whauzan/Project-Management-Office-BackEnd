package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.TeamRequest;
import com.pbo.pmo.model.Team;

import java.util.List;

public interface TeamDomain {
    List<Team> getAllTeam();
    Team addTeam(TeamRequest teamRequest);
    Team addMember(TeamRequest teamRequest);
}
