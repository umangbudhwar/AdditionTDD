package com.umangbudhwar.tdd;

public class Addition {

	//method to add multiple numbers
	public int add(int ...numbers) {
		int sum = 0;
		for(int n: numbers)
		{
			sum += n;
		}
		return sum;		
	}

}
