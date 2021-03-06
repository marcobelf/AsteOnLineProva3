package it.unisannio.tsw.rosariogoglia.modelImpl;

import it.unisannio.tsw.rosariogoglia.model.Keyword;


public class KeywordImpl implements Keyword{

	
	public KeywordImpl (){
		super();
	}
	
	public KeywordImpl (String keyword){
		this.keyword = (keyword);
	}

	public Integer getIdKeyword() {
		return id;
	}

	public void setIdKeyword(Integer id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public boolean equals (Object keyword){
		return this.keyword.equals((String)keyword);
	}
	
	public String toString (){
		return this.keyword;
	}

	private Integer id;
	private String keyword;
	
	
}
