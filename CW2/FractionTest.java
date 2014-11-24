/**
 * Created by keith for the second coursework assignment.
 * Modified by Tadiwos Taddese
 */
public class FractionTest {
    public static void main(String[] args) {

        // test divide by zero - should print an error and exit
		try{
			new Fraction(1, 0);
		}
		catch (IllegalArgumentException e){
			System.out.println("Argument 'divisor' is 0");
		}
        // test multiply
	Fraction f = new Fraction(3,10);
	Fraction g = new Fraction(1,2);
	Fraction h = new Fraction(3,5);
	Fraction m = new Fraction("6/4");
	m.simplify();
	System.out.println(m);	
	System.out.println(m.negate());
	System.out.println(m.absValue());
	if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
        // test equals
	test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
	test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
	test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
	test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
	test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");

        // extend with extra tests
		Fraction i = f.divide(g);
		System.out.println(i);
    }

    static void test(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
    }
}
