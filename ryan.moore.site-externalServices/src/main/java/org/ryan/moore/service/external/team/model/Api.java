
package org.ryan.moore.service.external.team.model;

public class Api{
   	private News news;
   	private Notes notes;
   	private Teams teams;

 	public News getNews(){
		return this.news;
	}
	public void setNews(News news){
		this.news = news;
	}
 	public Notes getNotes(){
		return this.notes;
	}
	public void setNotes(Notes notes){
		this.notes = notes;
	}
 	public Teams getTeams(){
		return this.teams;
	}
	public void setTeams(Teams teams){
		this.teams = teams;
	}
}
