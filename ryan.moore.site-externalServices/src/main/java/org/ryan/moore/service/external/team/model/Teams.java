
package org.ryan.moore.service.external.team.model;

public class Teams{
   	private String abbreviation;
   	private String color;
   	private Number id;
   	private Links links;
   	private String location;
   	private String name;

 	public String getAbbreviation(){
		return this.abbreviation;
	}
	public void setAbbreviation(String abbreviation){
		this.abbreviation = abbreviation;
	}
 	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public Links getLinks(){
		return this.links;
	}
	public void setLinks(Links links){
		this.links = links;
	}
 	public String getLocation(){
		return this.location;
	}
	public void setLocation(String location){
		this.location = location;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
}
