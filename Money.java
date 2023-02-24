/*
 *Money.java
 *24/2/23
 *@author O.McG
 */

 public class Money{
	//declare data memebers
	//input data
	private double amount;
	//coin types
	private int twoEuro;
	private int oneEuro;
	private int fiftyCent;
	private int twentyCent;
	private int tenCent;
	private int fiveCent;
	private int twoCent;
	private int oneCent;
	//data types for compute method
	private double rem1;
	private double rem2;
	private double rem3;
	private double rem4;
	private double rem5;
	private double rem6;
	private double rem7;

	//constructors
	public Money(){
		twoEuro = 0;
		oneEuro = 0;
		fiftyCent = 0;
		twentyCent = 0;
		tenCent = 0;
		fiveCent = 0;
		twoCent = 0;
		oneCent = 0;
		//constructors for rem
		rem1 = 0.0;
		rem2 = 0.0;
		rem3 = 0.0;
		rem4 = 0.0;
		rem5 = 0.0;
		rem6 = 0.0;
		rem7 = 0.0;
	}
	//setters
	public void setAmount(double amount){
		this.amount = amount;
	}

	//compute method
	public void computeCoins(){
		twoEuro = amount/2.0;
		rem1 = amount%2;

		oneEuro = rem1/1.0;
		rem2 = rem1%1;

		fiftyCent = rem2/0.5;
		rem3 = rem2/0.5;

		twentyCent = rem3/0.2;
		rem4 = rem3/0.2;

		tenCent = rem4/0.1;
		rem5 = rem4/0.1;

		fiveCent = rem5/0.05;
		rem6 = rem5/0.05;

		twoCent = rem6/0.02;
		rem7 = rem6/0.02;

		oneCent = rem7/0.01;
	}
	//getters
	public int getTwoEuro(){
		return twoEuro;
	}
	public int getOneEuro(){
		return oneEuro;
	}
	public int getFiftyCent(){
		return fiftyCent;
	}
	public int getTwentyCent(){
		return twentyCent;
	}
	public int getTenCent(){
		return tenCent;
	}
	public int getFiveCent(){
		return fiveCent;
	}
	public int getTwoCent(){
		return twoCent;
	}
	public int getOneCent(){
		return oneCent;
	}
}






