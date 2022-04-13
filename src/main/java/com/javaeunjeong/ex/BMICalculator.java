package com.javaeunjeong.ex;

public class BMICalculator {

	private double normal;//���� bmi ����
	private double lowweight;//��ü�� bmi ����
	private double overweight;//��ü�� bmi ����
	private double obesity;//�� bmi ����
	
	public void bmiCalculation (double weight, double height) {
		
		///BMI��������: ������ / (Ű*0.01)**2
		
		double bmi_result = weight/((height*0.01)*(height*0.01));
		
		System.out.println("����� BMI ������ : "+ bmi_result);
		
		if(bmi_result > obesity) {
			System.out.println("����� ���Դϴ�");
		}else if(bmi_result > overweight) {
			System.out.println("����� ��ü���Դϴ�");
		}else if(bmi_result > normal) {
			System.out.println("����� �����Դϴ�");
		}else if(bmi_result > lowweight) {
			System.out.println("����� ��ü���Դϴ�");
	}
		
}

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getLowweight() {
		return lowweight;
	}

	public void setLowweight(double lowweight) {
		this.lowweight = lowweight;
	}

	public double getOverweight() {
		return overweight;
	}

	public void setOverweight(double overweight) {
		this.overweight = overweight;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
}
