package com.dev2hero.superheroes;

import com.dev2hero.teams.TeamType;

public abstract class AbstractHero {
	
	private String name;
	private HeroStatistics stats;
	private TeamType team;

	/*
	 * constructor goes here
	 */

	public abstract double getPower();
	
}
