package edu.learning.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

	public String caculate(double num1, double num2, String operation) {
		double ans = 0;
		String result = "";
		switch(operation) {
			case "A" :
				ans = num1 + num2;
				result = num1 + " + " + num2 + " = " + ans;
				break;
			case "S" :
				ans = num1 - num2;
				result = num1 + " - " + num2 + " = " + ans;
				break;
			case "M" :
				ans = num1 * num2;
				result = num1 + " * " + num2 + " = " + ans;
				break;
			case "D" :
				ans = num1 / num2;
				result = num1 + " / " + num2 + " = " + ans;
				break;
		}
		return result;
	}
	
}
