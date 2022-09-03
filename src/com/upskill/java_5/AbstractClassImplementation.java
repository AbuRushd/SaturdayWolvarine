package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

	@Override
	public void iDoor() {
		int door = 4;
		
	}

	@Override
	public int iWheel() {
		
		return 4;
	}

	@Override
	public String iEngine() {
		
		return "200HP";
	}

	@Override
	public void iSeat() {
		
		int seat = 5;
	}
	/* (Parent)				(Keyword)			(Child)
	 * class				extends				Class
	 * Abstract Class		extends				Class
	 * Interface			implements			Class
	 * Interface			extends				Interface
	 */
}
