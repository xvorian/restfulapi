package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;


public class _Functions {

	static int number = 5;
	
	// FUNCTIONS
	static Function<Integer, Integer> increment = number -> number+1;
	static Function<Integer, Integer> decrement = number -> number-1;
	static Function<Integer, Integer> square = number -> number*number;
	static Function<Integer, Integer> increaseAndMultiply = increment.andThen(square);
	
	//BIFUNCTIONS
	static BiFunction<Integer, Integer, Integer> increamentAndMultiply = (toIncrease, toMultiply) -> (toIncrease + 1)
			* toMultiply;

	public static void main(String[] args) {
		int afterIncrement = increment.apply(number);
		System.out.println(afterIncrement);
		int afterSquare = square.apply(afterIncrement);
		System.out.println(afterSquare);
		int afterDecrement = decrement.apply(afterSquare);
		System.out.println(afterDecrement);
		System.out.println(increaseAndMultiply.apply(10));
		System.out.println("------------ starting BIFUNCTIONS ---------------------");
		System.out.println(increamentAndMultiply.apply(3,4));
		
	}

}
