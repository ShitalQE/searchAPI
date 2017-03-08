import java.util.List;

import org.testng.annotations.Test;


public class searchitunes
{
	@Test
	public static void single_word_term()
	{
		searchapi search_api=new searchapi();
		String result= search_api.search("Jackson");
		if(!(result==null))
		{
			System.out.println(result);
		}
		else
		{
			System.out.println("No matching search Rsults");
		}
	}
	
	@Test
	public static void multiple_word_term()
	{
		searchapi search_api=new searchapi();
		String result= search_api.search("Enrique" + "Douglas");
		if(!(result==null))
		{
			System.out.println(result);
		}
		else
		{
			System.out.println("No matching search Rsults");
		}
	}
	
	@Test
	public static void test_empty()
	{
		searchapi search_api=new searchapi();
		String result= search_api.search("");
		if(!(result==null))
		{
			System.out.println(result);
		}
		else
		{
			System.out.println("No matching search Rsults");
		}
	}
	
	@Test
	public static void special_char()
	{
		searchapi search_api=new searchapi();
		String result= search_api.search("@");
		if(!(result==null))
		{
			System.out.println(result);
		}
		else
		{
			System.out.println("No matching search Rsults");
		}
	 			
	}
	
	@Test
	public static void special_char_in_term()
	{
		searchapi search_api=new searchapi();
		String result= search_api.search("r@seberg");
		if(!(result==null))
		{
			System.out.println(result);
		}
		else
		{
			System.out.println("No matching search Rsults");
		}
	 			
	}
	
	@Test
	public static void non_english_word()
	{
		searchapi search_api=new searchapi();
		String result= ((searchapi) search_api).search("ã�›");
		if(!(result==null))
		{
			System.out.println(result);
		}
		else
		{
			System.out.println("No matching search Rsults");
		}
	 			
	}


}
