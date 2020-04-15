package com.revature.beans;

public class Instruments {
	
	public String typeOfInstrument;
	public int numInstruments;

	
	public String getTypeOfInstrument() {
		return typeOfInstrument;
	}
	
	public void setTypeOfInstrument(String typeOfInstrument) {
		this.typeOfInstrument=typeOfInstrument;
	}
	
	public int getNumInstruments() {
		return numInstruments;
	}
	
	public void setNumInstruments(int numInstruments) {
		this.numInstruments=numInstruments;
	}


	@Override
	public String toString() {
		return "Instruments [typeOfInstrument=" + typeOfInstrument + ", numInstruments=" + numInstruments+"]";
	}


}
