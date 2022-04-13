package com.javaeunjeong.ex;

import java.util.ArrayList;

public class StudentInfo {
	
	private String name;
	private double weight;
	private double height;
	private BMICalculator bmiCalculator;//객체 의존
	private ArrayList<String> hobbys;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	public void getInfoPrint() {
		System.out.println("학생이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("취미 : " + hobbys);
		System.out.println("-- BMI 지수 정보 --");
		bmiCalculator.bmiCalculation(weight, height);
	}
	
	
	

}
