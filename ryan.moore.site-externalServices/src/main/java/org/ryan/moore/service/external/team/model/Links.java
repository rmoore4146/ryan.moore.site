
package org.ryan.moore.service.external.team.model;

public class Links{
   	private Api api;
   	private Mobile mobile;
   	private Web web;

 	public Api getApi(){
		return this.api;
	}
	public void setApi(Api api){
		this.api = api;
	}
 	public Mobile getMobile(){
		return this.mobile;
	}
	public void setMobile(Mobile mobile){
		this.mobile = mobile;
	}
 	public Web getWeb(){
		return this.web;
	}
	public void setWeb(Web web){
		this.web = web;
	}
}
