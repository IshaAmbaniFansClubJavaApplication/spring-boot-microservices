package spring.boot.microservices.springbootmicroservicmoviecatalogserviceapp.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import spring.boot.microservices.springbootmicroservicmoviecatalogserviceapp.model.CatalogItem;
import spring.boot.microservices.springbootmicroservicmoviecatalogserviceapp.model.Movie;
import spring.boot.microservices.springbootmicroservicmoviecatalogserviceapp.model.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatelogResource {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		RestTemplate restTemplate = new RestTemplate();
		//here main work in unmarsell consepts here
		//get all rated movie IDs // this is hard code here
		// this is second modifi vcation code 
		List<Rating> ratings = Arrays.asList(
				new Rating("1234", 4),
				new Rating("5678",3)
				);
		
		return ratings.stream()
				.map(rating -> {
				Movie movie=restTemplate.getForObject("http://localhost:8888/movies/"+rating.getMovieId(), Movie.class); //here working marslling concept
				return new CatalogItem(movie.getName(), "Desc", rating.getRating());
				
				}).collect(Collectors.toList());
		// http://localhost:8888/movies/1001
		/*
return ratings.stream().
				map(rating-> 
				new CatalogItem("TransForms", "test", 4)).collect(Collectors.toList());
		*/    	 
		     
		// for each movie ID , call movie info service and get details
		//put the, all togather
		//here each and every thing in hardcode only 
		
	/*	// this is first time we can writing the code 
	 * return Collections.singletonList(
				 new CatalogItem("TransForms", "test",4)
				 );
	*/	
	}
}
