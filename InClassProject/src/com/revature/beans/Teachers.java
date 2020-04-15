package com.revature.beans;

public class Teachers {
	public String nameOfTeacher;
	public int salaryTeacher;

	
	public String getNameOfTeacher() {
		return nameOfTeacher;
	}
	
	public void setNameOfTeacher(String nameOfTeacher) {
		this.nameOfTeacher=nameOfTeacher;
	}
	
	public int getSalaryTeacher() {
		return salaryTeacher;
	}
	
	public void setSalaryTeacher(int salaryTeacher) {
		this.salaryTeacher=salaryTeacher;
	}


	@Override
	public String toString() {
		return "Teachers [nameOfTeacher=" + nameOfTeacher + ", salaryTeacher="+ salaryTeacher + "]";
	}
}
