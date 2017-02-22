package itunes_search;

import itunes_search.searchapi;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class searchTest {
	
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI = "https://itunes.apple.com";
	}
	
	@DataProvider(name="search_criteria")
	public Object[][] Data()
	{
		return new Object[][]
			{
			{new searchapi("Jack","US","Movie",25)},
			{new searchapi("Beyonce","US","All")},
			{new searchapi("Justin Timberlake")},
			{new searchapi("Taylor")},
			};
	}
	
	@Test(dataprovider="search_criteria")
	public void searchResult_term_get()
	{
	.given()
		.contentType(ContentType.JSON)
	.when()
		.get("/search?term=term&country=country&media=media&limit=limit")
	.then()
		.statusCode(200)
		.body("term", is(search.getTerm()))
		.body("country",is(search.getCountry()))
		.body("media",is(search.getMedia()))
		.body("limit",is(search.getLimit()))
		.body("searchResult",arraywithsize(search.getLimit()));
	}
	

	
	@Test(dataProvider="search_criteria")
	public void searchResult_term_post(searchapi search)
	{
	.given()
		.contentType(ContentType.JSON)
		.body(search)
	.when()
		.post("/search/{term}")
	.then()
		.statusCode(200)
		.body("term", is(search.getTerm()))
		.body("country",is(search.getCountry()))
		.body("media",is(search.getMedia()))
		.body("limit",is(search.getLimit()));
		.body("searchResult",arraywithsize(search.getLimit()));
	}
}
