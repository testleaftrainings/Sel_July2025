package week1.day1;

public class LearnJavaOperators {

	public static void main(String[] args) {
		// Assignment operator (=)
		int number = 7;

		// Arithmetic operator
		int a = 7;
		int b = 2;

		// add (+)
		System.out.println(a + b);

		// sub (-)
		System.out.println(a - b);

		// mul (*)
		System.out.println(a * b);

		// div - Quotient, Remainder

		// Quotient (/)
		System.out.println(a / b);

		// Remainder (%)
		// System.out.println(a%b);

		System.out.println("---------------------------");

		int c = 7;
		int d = 8;
		// Comparison operator - compare 2 values
		// equalTo (==)
		System.out.println(c == d);

		// notEqualTo (!=)
		System.out.println(c != d);

		// lessThan (<)
		System.out.println(c < d);

		// lessThanOrEqualTo (<=)

		System.out.println(c <= d);

		// greaterThan (>)
		System.out.println(c > d);

		// greaterThanOrEqualTo (>=)
		System.out.println(c >= d);

		System.out.println("-------------------------");

		// Logical operator - Compare 2 conditions
		// And &&
		// Or ||

		int p = 10;
		int q = 20;
		System.out.println(p < q && p <= q);

		System.out.println(p < q || p > q);

		// Increment/Decrement

		int v = 7;

		// Increment - Increase the value by 1
		// postIncrement (v++)
		System.out.println(v++);
		System.out.println(v);

		// preIncrement (++v)
		System.out.println(++v);
		System.out.println(v);

		// postDecrement (v--)
		System.out.println(v--);
		System.out.println(v);

		// preDecrement (--v)
		System.out.println(--v);

	}

}
