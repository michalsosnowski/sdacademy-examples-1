package pl.sdacademy.swing.homework;


import javafx.animation.Animation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sdacademy.swing.FizzBuzz;

public class FizzBuzzTest {
	@Test
	void fizzBuzzTest(){
		//given
		int number =1;
		//when
		String msg = FizzBuzz.msg(number);
		//then
		Assertions.assertThat(msg).isEqualTo("1");

	}
	@Test
	void fizzDivByThree(){
		//given
		int number=9;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("Fizz");

	}
	@Test
	void fizzDivByFive(){
		//given
		int number=5;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("Buzz");

	}
	@Test
	void fizzDivByFiveteen(){
		//given
		int number=15;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("FizzBuzz");

	}@Test
	void fizzDivByTen(){
		//given
		int number=10;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("Buzz");

	}
	@Test
	void primeNumber(){
		//given
		int number=1;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("Whizz");

	}@Test
	void secondPrimeNumber(){
		//given
		int number=3;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("FizzWhizz");

	}
@Test
	void thirdPrimeNumber(){
		//given
		int number=5;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("BuzzWhizz");

	}@Test
	void fourthPrimeNumber(){
		//given
		int number=7;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("Whizz");

	}
@Test
	void fivthPrimeNumber(){
		//given
		int number=11;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("Whizz");

	}@Test
	void sixthPrimeNumber(){
		//given
		int number=13;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("Whizz");

	}

}
