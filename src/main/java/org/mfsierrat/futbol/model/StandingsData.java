package org.mfsierrat.futbol.model;

import java.util.List;

import lombok.Getter;

@Getter
public class StandingsData {
	private Filters filters;
	private Area area;
	private Competition competition;
	private Season season;
	private List<Standings> standings;
	
}
