
package org.ryan.moore.service.external.team.model;

import java.util.List;

public class NFLTeamContainer{
   	private Number resultsCount;
   	private Number resultsLimit;
   	private Number resultsOffset;
   	private List<Sports> sports;
   	private String status;
   	private String timestamp;

 	public Number getResultsCount(){
		return this.resultsCount;
	}
	public void setResultsCount(Number resultsCount){
		this.resultsCount = resultsCount;
	}
 	public Number getResultsLimit(){
		return this.resultsLimit;
	}
	public void setResultsLimit(Number resultsLimit){
		this.resultsLimit = resultsLimit;
	}
 	public Number getResultsOffset(){
		return this.resultsOffset;
	}
	public void setResultsOffset(Number resultsOffset){
		this.resultsOffset = resultsOffset;
	}
 	public List<Sports> getSports(){
		return this.sports;
	}
	public void setSports(List sports){
		this.sports = sports;
	}
 	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
 	public String getTimestamp(){
		return this.timestamp;
	}
	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}
}
