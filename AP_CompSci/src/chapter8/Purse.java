package chapter8;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class Purse implements Comparable {
	
	private ArrayList<Coin> coins = new ArrayList<>();
	private double value;
	private int numCoins;
	
	public Purse() {
		
	}
	public void addCoin(Coin c) {
		value+= c.getValue();
		numCoins++;
		coins.add(c);
	}
	public double getValue() {
		return value;
	}
	public int getNumCoins() {
		return numCoins;
	}
	public void setNumCoins(int numCoins) {
		this.numCoins = numCoins;
	}
	public double getAvrg() {
		return value/numCoins;
	}
	public int compareTo(Object obj) {
		double otherNum = ((Purse)obj).getValue();
		if (value < otherNum) {
			return -1;
		} else if (value > otherNum) {
			return 1;
		} else {
			return 0;
		}
	}
}
