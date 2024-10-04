package org.mfsierrat.futbol.model;

import java.util.List;

import lombok.Getter;

@Getter
public class Team {
	private Area area;
	private int id;
    private String name;
    private String shortName;
    private String tla;
    private String crest;
    private String address;
    private String website;
    private int founded;
    private String clubColors;
    private String venue;
    private Coach coach;
    private List<Competition> runningCompetitions;
    private long marketValue;
    private List<Player> squad;
    private List<Player> staff;
    private String lastUpdated;
}
