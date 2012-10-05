package org.ryan.moore.service.external.team.model;

import java.util.List;

public class Leagues {

   	private String abbreviation;
   	private Number groupId;
   	private Number id;
   	private String name;
   	private String shortName;
   	private List<Teams> teams;

 	public String getAbbreviation(){
		return this.abbreviation;
	}
	public void setAbbreviation(String abbreviation){
		this.abbreviation = abbreviation;
	}
 	public Number getGroupId(){
		return this.groupId;
	}
	public void setGroupId(Number groupId){
		this.groupId = groupId;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getShortName(){
		return this.shortName;
	}
	public void setShortName(String shortName){
		this.shortName = shortName;
	}
 	public List<Teams> getTeams(){
		return this.teams;
	}
	public void setTeams(List teams){
		this.teams = teams;
	}
}
