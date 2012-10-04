
package org.ryan.moore.service.external.fantasynews.model;

import java.util.List;

public class Headlines{
   	private List audio;
   	private String byline;
   	private List categories;
   	private String description;
   	private String headline;
   	private Number id;
   	private List images;
   	private List keywords;
   	private String lastModified;
   	private String linkText;
   	private Links links;
   	private String mobileStory;
   	private boolean premium;
   	private String published;
   	private List related;
   	private String source;
   	private String story;
   	private String title;
   	private String type;
   	private List video;

 	public List getAudio(){
		return this.audio;
	}
	public void setAudio(List audio){
		this.audio = audio;
	}
 	public String getByline(){
		return this.byline;
	}
	public void setByline(String byline){
		this.byline = byline;
	}
 	public List getCategories(){
		return this.categories;
	}
	public void setCategories(List categories){
		this.categories = categories;
	}
 	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
 	public String getHeadline(){
		return this.headline;
	}
	public void setHeadline(String headline){
		this.headline = headline;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public List getImages(){
		return this.images;
	}
	public void setImages(List images){
		this.images = images;
	}
 	public List getKeywords(){
		return this.keywords;
	}
	public void setKeywords(List keywords){
		this.keywords = keywords;
	}
 	public String getLastModified(){
		return this.lastModified;
	}
	public void setLastModified(String lastModified){
		this.lastModified = lastModified;
	}
 	public String getLinkText(){
		return this.linkText;
	}
	public void setLinkText(String linkText){
		this.linkText = linkText;
	}
 	public Links getLinks(){
		return this.links;
	}
	public void setLinks(Links links){
		this.links = links;
	}
 	public String getMobileStory(){
		return this.mobileStory;
	}
	public void setMobileStory(String mobileStory){
		this.mobileStory = mobileStory;
	}
 	public boolean getPremium(){
		return this.premium;
	}
	public void setPremium(boolean premium){
		this.premium = premium;
	}
 	public String getPublished(){
		return this.published;
	}
	public void setPublished(String published){
		this.published = published;
	}
 	public List getRelated(){
		return this.related;
	}
	public void setRelated(List related){
		this.related = related;
	}
 	public String getSource(){
		return this.source;
	}
	public void setSource(String source){
		this.source = source;
	}
 	public String getStory(){
		return this.story;
	}
	public void setStory(String story){
		this.story = story;
	}
 	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
 	public List getVideo(){
		return this.video;
	}
	public void setVideo(List video){
		this.video = video;
	}
}
