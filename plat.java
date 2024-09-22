package demoproject;

public class plat {
	public int pricepersqr;
	public int sqrfeet;
	public int floor;
	public int noroom;
	public plat(int _price,int _sqr,int _floors,int _room) {
		pricepersqr=_price;
		sqrfeet=_sqr;
		floor=_floors;
		noroom=_room;
	}
	public int cost() {
		return pricepersqr*sqrfeet;
	}
	public void printstate() {
		System.out.print("pricepersqr"+pricepersqr);
	}
}
