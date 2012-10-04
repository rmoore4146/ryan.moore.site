
package org.ryan.moore.service.external.fantasynews.model;

import java.util.List;

public class Categories{
   	private String description;
   	private League league;
   	private Number leagueId;
   	private Number sportId;
   	private String type;

 	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
 	public League getLeague(){
		return this.league;
	}
	public void setLeague(League league){
		this.league = league;
	}
 	public Number getLeagueId(){
		return this.leagueId;
	}
	public void setLeagueId(Number leagueId){
		this.leagueId = leagueId;
	}
 	public Number getSportId(){
		return this.sportId;
	}
	public void setSportId(Number sportId){
		this.sportId = sportId;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
}
