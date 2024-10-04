package org.mfsierrat.futbol.model;

import java.util.List;

import lombok.Getter;

 @Getter
public class CompetitionsData {
	private int count;
	private Filters filters;
	private List<Competition> competitions;
	
}
