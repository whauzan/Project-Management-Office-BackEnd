package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.ScrumRequest;
import com.pbo.pmo.model.Scrum;

import java.util.List;

public interface ScrumDomain {
    List<Scrum> getAllScrum();
    Scrum addScrum(ScrumRequest scrumRequest);
    Scrum getByProject_id(int id);
}
