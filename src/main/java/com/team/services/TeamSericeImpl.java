package com.team.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.dao.TeamDao;
import com.team.domain.Team;

@Service
public class TeamSericeImpl implements TeamService{

	@Autowired
	private TeamDao teamDao;
	
	@Override
	public void createTeam(Team t) {
		teamDao.createUpdate(t);
	}
	
	@Override
	public void updateTeam(Team t) {
		teamDao.createUpdate(t);		
	}
	
	@Override
	public List<Team> loadAll() {
		return teamDao.getAllTeams();
	}
	
	@Override
	public void deleteTeam(long teamId) {
		teamDao.delete(teamId);		
	}
	
	@Override
	public Team getTeamById(long id) {		
		return teamDao.loadTeam(id);
	}
	
	
}
