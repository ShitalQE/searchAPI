package itunes_search;

public class searchapi {

	private String term;
	private String country;
	private String media;
	private int limit;
	
	public searchapi(String term)
	{
		this.setTerm(term);
	}
	public searchapi(String term, String country)
	{
		this.setTerm(term);
		this.setCountry(country);
	
	}
	public searchapi(String term, String country, String media)
	{
		this.setTerm(term);
		this.setCountry(country);
		this.setMedia(media);
	
	}
	public searchapi(String term, String country, String media, int limit)
	{
		this.setTerm(term);
		this.setCountry(country);
		this.setMedia(media);
		this.setLimit(limit);
	
	}
	public String getTerm()
	{
		return term;
	}
	
	public void setTerm( String term)
	{
		this.term=term;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public void setCountry( String country)
	{
		this.country=country;
	}
	
	public String getMedia()
	{
		return media;
	}
	
	public void setMedia( String media)
	{
		this.media=media;
	}
	
	public int getLimit()
	{
		return limit;
	}
	
	public void setLimit( int limit)
	{
		this.limit=limit;
	}
}
