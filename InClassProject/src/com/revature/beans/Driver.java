package com.revature.beans;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instruments sax = new Instruments();
		Teachers favoriteTeacher = new Teachers();
		sax.setTypeOfInstrument("Alto Saxophone");
		sax.setNumInstruments(4);
		favoriteTeacher.setNameOfTeacher("Mrs McDonald");
		favoriteTeacher.setSalaryTeacher(10_000);
		
		System.out.println(favoriteTeacher);
		System.out.println(sax.getTypeOfInstrument());
		System.out.println(sax.getNumInstruments());

	}

}
