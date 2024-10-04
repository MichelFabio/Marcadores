package org.mfsierrat.futbol.model;

import java.util.List;

import lombok.Getter;

@Getter
public class Season {
	private int id;
    private String startDate;
    private String endDate;
    private int currentMatchday;
    private List<String> stages;
    private String winner;
}
