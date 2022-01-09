package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.ScrumRequest;
import com.pbo.pmo.model.Project;
import com.pbo.pmo.model.Scrum;
import com.pbo.pmo.model.Team;
import com.pbo.pmo.repository.ProjectRepository;
import com.pbo.pmo.repository.ScrumRepository;
import com.pbo.pmo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScrumService implements ScrumDomain{
    @Autowired
    private ScrumRepository scrumRepository;
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<Scrum> getAllScrum() {
        return scrumRepository.findAll();
    }

    @Override
    public Scrum addScrum(ScrumRequest scrumRequest) {
        Project project = projectRepository.findById(scrumRequest.project_id)
                .orElseThrow(() -> new IllegalStateException(
                    "project with id " + scrumRequest.project_id + " does not exist"
                ));
        Team team = teamRepository.findById(scrumRequest.team_id)
                .orElseThrow(()-> new IllegalStateException(
                        "team with id " + scrumRequest.team_id + "does not exist"
                ));

        Scrum scrum = new Scrum();
        scrum.setProject(project);
        scrum.setName("Scrum of "+project.getName());
        scrum.setTeam(team);

        return scrumRepository.save(scrum);
    }
}
