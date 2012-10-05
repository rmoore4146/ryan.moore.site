
package org.ryan.moore.service.external.team.model;

import java.util.List;

public class Sports{
   	private Number id;
   	private List<Leagues> leagues;
   	private String name;

 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public List<Leagues> getLeagues(){
		return this.leagues;
	}
	public void setLeagues(List leagues){
		this.leagues = leagues;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
}
