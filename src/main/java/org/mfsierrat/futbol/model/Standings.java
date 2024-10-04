package org.mfsierrat.futbol.model;

import lombok.Getter;

@Getter
public class Standings {
	private int position;
	private Team team;
	private int playedGames;
	private String form;
	private int won;
	private int draw;
	private int lost;
	private int points;
	private int goalsFor;
	private int goalsAgainst;
	private int goalDifference;
	
}
