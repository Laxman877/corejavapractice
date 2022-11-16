package com.example.InfrastructureStatistics.model;

public class Bridges {
	private int bridgeNumber;
	private String bridgeCity;
	private String bridgeLength;
	private String bridgeWidth;
	public Bridges(int bridgeNumber, String bridgeCity, String bridgeLength, String bridgeWidth) {
		super();
		this.bridgeNumber = bridgeNumber;
		this.bridgeCity = bridgeCity;
		this.bridgeLength = bridgeLength;
		this.bridgeWidth = bridgeWidth;
	}
	public int getBridgeNumber() {
		return bridgeNumber;
	}
	public void setBridgeNumber(int bridgeNumber) {
		this.bridgeNumber = bridgeNumber;
	}
	public String getBridgeCity() {
		return bridgeCity;
	}
	public void setBridgeCity(String bridgeCity) {
		this.bridgeCity = bridgeCity;
	}
	public String getBridgeLength() {
		return bridgeLength;
	}
	public void setBridgeLength(String bridgeLength) {
		this.bridgeLength = bridgeLength;
	}
	public String getBridgeWidth() {
		return bridgeWidth;
	}
	public void setBridgeWidth(String bridgeWidth) {
		this.bridgeWidth = bridgeWidth;
	}
	@Override
	public String toString() {
		return "Bridges [bridgeNumber=" + bridgeNumber + ", bridgeCity=" + bridgeCity + ", bridgeLength=" + bridgeLength
				+ ", bridgeWidth=" + bridgeWidth + "]";
	}
	
}
