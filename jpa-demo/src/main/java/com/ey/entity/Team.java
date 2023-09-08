package com.ey.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
	@Id
	@Column(name = "team_id")
	private int teamId;
	@Column(name = "team_name", length =20)
	private String teamName;
	private String leauge;
	
	@OneToMany
	private List<Player> players;
	
	public Team() {
	}

	public Team(int teamId, String teamName, String leauge) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.leauge = leauge;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getLeauge() {
		return leauge;
	}

	public void setLeauge(String leauge) {
		this.leauge = leauge;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
}
