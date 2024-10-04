package org.mfsierrat.futbol.model;

import java.util.List;

import lombok.Getter;

@Getter

public class TeamsData {
	private int count;
    private Filters filters;
    private Competition competition;
    private Season season;
    private List<Team> teams;
}
