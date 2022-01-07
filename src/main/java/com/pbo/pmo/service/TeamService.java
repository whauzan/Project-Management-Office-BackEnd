package com.pbo.pmo.service;

import com.pbo.pmo.Pojos.TeamRequest;
import com.pbo.pmo.model.Employee;
import com.pbo.pmo.model.Team;
import com.pbo.pmo.repository.EmployeeRepository;
import com.pbo.pmo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TeamService implements TeamDomain {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Team> getAllTeam() {
        return teamRepository.findAll();
    }

    @Override
    public Team addTeam(TeamRequest teamRequest) {
        Team team = new Team();
        team.setName(teamRequest.name);
        team.setCompany_id(teamRequest.company_id);
        return teamRepository.save(team);
    }

    @Override
    public Team addMember(TeamRequest teamRequest) {
        Employee employee = employeeRepository.findById(teamRequest.employee_id)
                .orElseThrow(() -> new IllegalStateException(
                        "employee with id " + teamRequest.employee_id + " does not exist"
                ));
        Team team = teamRepository.findById(teamRequest.id)
                .orElseThrow(() -> new IllegalStateException(
                        "team with id " + teamRequest.id + " does not exist"
                ));
        employee.setTeam_id(teamRequest.id);
        employeeRepository.save(employee);
        Set<Employee> employeeSet = team.getMemberSet();
        employeeSet.add(employee);
        team.setMemberSet(employeeSet);
        return teamRepository.save(team);
    }
}
