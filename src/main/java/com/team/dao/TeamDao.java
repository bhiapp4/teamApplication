package com.team.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team.domain.Team;

@Repository
public class TeamDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void createUpdate(Team team){
		getSession().saveOrUpdate(team);
		getSession().flush();
	}
	
	public Team loadTeam(long id){
		Team team = (Team)getSession().load(Team.class, id);
		return team;		
	}
	
	public List<Team>getAllTeams(){
		Criteria criteria = getSession().createCriteria(Team.class);
		List<Team>teams = criteria.list();
		return teams;		
	}
	
	public void delete(Long id){
		Team team = loadTeam(id);
		getSession().delete(team);
		getSession().flush();
	}
	
}
