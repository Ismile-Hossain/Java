package DoubleColonOperator;

import java.util.function.Function;

class BasicCalculator{
	double square(double n)
	{
		return Math.pow(n, 2);
	}
	double multiply(double a,double b)
	{
		return a*b;
	}
}

class AdvanceCalculator extends BasicCalculator
{
	double squareAdd(double a,double b)
	{
		Function<Double, Double> sq= super::square;
		return sq.apply(a) + sq.apply(b);
	}

}
public class LastTest {

	public static void main(String[] args) {
		AdvanceCalculator adv=new AdvanceCalculator();
		System.out.println(adv.squareAdd(3, 5));
	}

}
