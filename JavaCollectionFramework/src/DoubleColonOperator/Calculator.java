package DoubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculator {
	public double square(double n)
	{
		return Math.pow(n, 2);
	}
	public double multiply(double a,double b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		Function<Double,Double> f=new Calculator() :: square;
		System.out.println(f.apply((double) 4));
		
		BiFunction<Double, Double, Double> b=new Calculator() :: multiply;
		System.out.println(b.apply(3.33, 4.00));
	}

}
