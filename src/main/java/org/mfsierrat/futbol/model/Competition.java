package org.mfsierrat.futbol.model;

import lombok.Getter;

@Getter
public class Competition {
	private int id;
	private Area area;
	private String name;
	private String code;
	private String type;
	private String emblem;
	private String plan;
	private CurrentSeason currentSeason;
	private int numberOfAvailableSeasons;
	private String lastUpdated;
	
}
