package com.revature.music;
import com.revature.beans.Instruments;
import com.revature.beans.Teachers;
public class Stock {
	public static void main(String[] args) {
		Instruments h= new Instruments();
		System.out.println(h);
		h.setTypeOfInstrument("Guitar");
		h.setNumInstruments(36);
		System.out.println(h.getTypeOfInstrument()+" "+h.getNumInstruments());
		
		Teachers t= new Teachers();
		System.out.println(t);
		t.setNameOfTeacher("JJ");
		t.setSalaryTeacher(36000);
		System.out.println(t.getNameOfTeacher()+" "+t.getSalaryTeacher());
	}

}
