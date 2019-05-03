package recommendation;


public abstract class StrategySearchTerm implements RecommendationStrategy {
	
	public void solve() {
		//leave for future work
	}
	
	public abstract String getSearchTerm(String recWeight);
}
