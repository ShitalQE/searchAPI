import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
//import org.apache.http.client.HttpClient.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;



public class searchapi 
{

	public String search (String param) 
	{
		
		HttpClient client  = new DefaultHttpClient();
		String url="https://itunes.apple.com/search";
		HttpGet get=new HttpGet(url+param);
		try {
			HttpResponse response =client.execute(get);
			HttpEntity entity = response.getEntity();
			return EntityUtils.toString(entity);
			}
		catch (ClientProtocolException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			
			e.printStackTrace();
		} 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			get.releaseConnection();
			
		}
		
		return null;
		
	}
}


