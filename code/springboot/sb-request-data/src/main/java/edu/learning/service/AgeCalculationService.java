package edu.learning.service;

import org.springframework.stereotype.Service;

@Service
public class AgeCalculationService {
	public int getAge(int birthYear) {
		int currentYear = 2023;
		int age = currentYear - birthYear;
		return age;
	}
}
