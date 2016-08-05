package greedy.calculator;

public class OutputEntry {
	
	String coinType;
	int numberOfCoins;
	
	public OutputEntry(String coinType, int numberOfCoins) {
		this.coinType = coinType;
		this.numberOfCoins = numberOfCoins;
	}
	
	@Override
	public String toString() {
		String entry = coinType + ": " + numberOfCoins;
		return entry;
	}
	
	public String getCoinType() {
		return coinType;
	}
	
	public int getNumberOfCoins() {
		return numberOfCoins;
	}

}
