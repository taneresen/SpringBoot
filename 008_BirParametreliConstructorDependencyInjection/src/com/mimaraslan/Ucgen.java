package com.mimaraslan;

public class Ucgen {
	
	private String cesit;
	//------------------------------
	
	public Ucgen(String cesit) {
		this.cesit = cesit;
		System.out.println(getCesit() +"Ucgen Ciz.");
	}
	//------------------------------
	public String getCesit() {
		return cesit;
	}

	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	//------------------------------
	public void ciz() {
		System.out.println(getCesit() +"Ucgen Ciz.");
	}

}
