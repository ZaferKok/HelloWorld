package lambda2020;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda10 {

	public static void main(String[] args) {

		// Supplier Functional Interface

		// Supplier<Integer>: It does not accept any input, but returns something
		// Integer is output

		// Get a random number and print it on the console
		Random randomNumber = new Random();
		Supplier<Integer> randomSupplier = () -> randomNumber.nextInt(10); // it will return random integers from 0 to
																			// 10
		System.out.println(randomSupplier.get());

		// UnaryOperator Functional Interface
		// UnaryOperator<Integer>: It accepts one input, returns 1 result
		// UnaryOperator is extending to Function Interface therefore it uses just one parameter

		// Create an object by using UnaryOperator to multiply an integer by 5, then
		// print it on the console
		UnaryOperator<Integer> unary = t -> t * 5;
		System.out.println(unary.apply(10)); // 50

	}

}
