package lambda;

import java.util.function.Predicate;

public class _Predicate {

	static Predicate<String> isPhoneNumberValid = phoneNumber -> phoneNumber.length() == 11;
	static Predicate<String> startsWithZero = phoneNumber -> phoneNumber.startsWith("0");
	static Predicate<String> isTrueBoolean = isBoolean -> new Boolean(isBoolean);

	public static void main(String[] args) {
		System.out.println(isPhoneNumberValid.test("03001123456"));
		System.out.println(isPhoneNumberValid.test("030012345"));
		System.out.println(isTrueBoolean.test("false"));
		System.out.println(isTrueBoolean.test("FALSE"));

		// Chaining predicate with AND
		System.out.println(isPhoneNumberValid.and(startsWithZero).test("03001123456"));

		// Chaining predicate with OR
		System.out.println(isPhoneNumberValid.or(startsWithZero).test("030011234"));
	}
}
