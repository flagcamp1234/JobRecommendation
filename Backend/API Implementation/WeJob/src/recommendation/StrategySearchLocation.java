package recommendation;

import java.util.List;

public abstract class StrategySearchLocation implements RecommendationStrategy {
	public void solve() {
		//leave for future work
	}
	
	public abstract List<String> getSearchLocations(String recWeight);
}
