package org.mfsierrat.futbol.model;

import lombok.Getter;

@Getter
public class CurrentSeason {
	private int id;
	private String startDate;
	private String endDate;
	private int currentMatchday;
	private Team winner;
}
