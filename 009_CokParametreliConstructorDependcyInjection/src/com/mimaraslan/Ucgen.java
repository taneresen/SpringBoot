package com.mimaraslan;

public class Ucgen {

	private String cesit;
	private int yukseklik;
	// ------------------------------

	public Ucgen(String cesit) {
		this.cesit = cesit;
		
	}

	public Ucgen(int yukseklik) {
		this.yukseklik = yukseklik;
	}

	public Ucgen(String cesit, int yukseklik) {
		this.cesit = cesit;
		this.yukseklik = yukseklik;
	}

	// ------------------------------
	public String getCesit() {
		return cesit;
	}

	public void setCesit(String cesit) {
		this.cesit = cesit;
	}

	public int getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}

	// ------------------------------
	public void ciz() {
		System.out.println(getYukseklik() + "birim yüksekliginde " + getCesit() +  "Ucgen Ciz.");
	}

}
