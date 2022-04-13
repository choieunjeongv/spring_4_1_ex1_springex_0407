package com.javaeunjeong.ex;

public class BMICalculator {

	private double normal;//정상 bmi 지수
	private double lowweight;//저체중 bmi 지수
	private double overweight;//과체중 bmi 지수
	private double obesity;//비만 bmi 지수
	
	public void bmiCalculation (double weight, double height) {
		
		///BMI지수계산식: 몸무게 / (키*0.01)**2
		
		double bmi_result = weight/((height*0.01)*(height*0.01));
		
		System.out.println("당신의 BMI 지수는 : "+ bmi_result);
		
		if(bmi_result > obesity) {
			System.out.println("당신은 비만입니다");
		}else if(bmi_result > overweight) {
			System.out.println("당신은 과체중입니다");
		}else if(bmi_result > normal) {
			System.out.println("당신은 정상입니다");
		}else if(bmi_result > lowweight) {
			System.out.println("당신은 저체중입니다");
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
