package purse;

import java.util.ArrayList;


public class Purse {
	public Purse() {
		coins = new ArrayList<Coin>();
		total = 0;
	}

	public void add(Coin aCoin) {
		coins.add(aCoin);
		total += aCoin.getValue();
	}
	
	public boolean remove(Coin aCoin) {
		if(coins.size() == 0)
			return false;
		for(Coin c: coins)
			if(c.equals2(aCoin)) {
				coins.remove(c);
				total -= c.getValue();
				return true;
			}
		return false;
	}
	
	public boolean find(Coin aCoin) {
		for (Coin c: coins) {
			if (c.equals(aCoin))
				return true;
		}
		return false;
	}
	
	public int count(Coin aCoin) {
		int matches = 0;
		for (Coin c: coins) {
			if (c.equals(aCoin))
				matches++;
		}
		return matches;
	}
	
	public Coin getMaximum() {
		if(coins.size() == 0)
			return null;
		Coin max = coins.get(0);
		for (Coin c: coins) {
			if (c.daiValore() > max.daiValore())
				max = c;
		}
		return max;
	}
	
	public Coin getMinimum()
	{
		if (coins.size() == 0)
			return null;
		Coin min = coins.get(0);
		for (Coin c: coins) {
			if (c.daiValore() < min.daiValore())
				min = c;
		}
		return min;
	}
	
	public boolean hasCoin(Coin aCoin) {
		for (Coin c: coins)
			if(c.equals2(aCoin))
				return true;
		return false;
			
	}

	public double getTotal() {
		return total;
	}

	private ArrayList<Coin> coins;
	private double total;
}
