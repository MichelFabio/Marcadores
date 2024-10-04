package org.mfsierrat.futbol.model;

import lombok.Getter;

@Getter
public class Coach {
	private Integer id;
    private String firstName;
    private String lastName;
    private String name;
    private String dateOfBirth;
    private String nationality;
    private Contract contract;
}
