package util;

import java.util.ArrayList;
import java.util.List;

import entity.Job;
import recommendation.RecSearchLocation;
import recommendation.RecSearchTerm;
import recommendation.StrategySearchLocation;
import recommendation.StrategySearchTerm;

public class RecommendUtil {
	public static List<Job> recommend(String recWeight, String useLocation) {
		List<Job> list = new ArrayList<Job>();
		StrategySearchLocation ssl = new RecSearchLocation();
		StrategySearchTerm sst = new RecSearchTerm();
		String searchTerm = sst.getSearchTerm(recWeight);
		List<String> locations  = new ArrayList<String>();
		if (Boolean.valueOf(useLocation)) {
			locations = ssl.getSearchLocations(recWeight);
		}
		//call Indeed Job Search API to get Job Title, Job Snippet, Job Detail, Job ID, Location, Company name
		for(String location : locations) {
			//append the results to the list and remove duplicate record
		}
		return list;
	}
}
