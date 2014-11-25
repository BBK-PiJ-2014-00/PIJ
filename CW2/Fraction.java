/**
 * Created by keith for the second coursework assignment.
 * Modified by Tadiwos Taddese
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) throws IllegalArgumentException {
        if (denom == 0) {
            System.out.println("Invalid fraction with denominator 0"); 
	    // this should use exceptions
			throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        
        setNumerator(num);
        setDenominator(denom);
    }
	
	 public Fraction(String strFraction) throws IllegalArgumentException {
		int num, denom;
		if(strFraction.contains("/")){
			String[] str = strFraction.split("/");
			num = Integer.parseInt(str[0]);
			denom = Integer.parseInt(str[1]);
		}
		else{
			num = Integer.parseInt(strFraction);
			denom = 1;
		}
		
		if (denom == 0) {
            System.out.println("Invalid fraction with denominator 0"); 
	    // this should use exceptions
			throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        
        setNumerator(num);
        setDenominator(denom);
    }
	

    @Override
    public String toString() {
        return "" + getNumerator() + '/' + getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int num) {
        denominator = num;
    }
	
	

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (getDenominator() != fraction.getDenominator()) return false;
        if (getNumerator() != fraction.getNumerator()) return false;

        return true;
    }

     @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }
	
	
	public Fraction absValue(){
		int num = Math.abs(this.getNumerator());
        int denom = Math.abs(this.getDenominator());
        Fraction returnValue = new Fraction(num, denom);
		returnValue.simplify();
		return returnValue;
	}
	
	public Fraction negate(){
		int num = 0 - this.getNumerator();
        int denom = this.getDenominator();
		Fraction returnValue = new Fraction(num, denom);
		returnValue.simplify();
		return returnValue;
	}
	
    public Fraction multiply(Fraction other) {
        int num = this.getNumerator() * other.getNumerator();
        int denom = this.getDenominator() * other.getDenominator();
        Fraction returnValue = new Fraction(num, denom);
		returnValue.simplify();
		return returnValue;
    }
	
	public Fraction divide(Fraction other) {

        int num = this.getNumerator() * other.getDenominator();
        int denom = this.getDenominator() * other.getNumerator();
        Fraction returnValue = new Fraction(num, denom);
		returnValue.simplify();
		return returnValue;
    }
	
	public Fraction subtract(Fraction other){
		int denom = this.getDenominator() * other.getDenominator();
        int num = ((this.getNumerator() * other.getDenominator()) - (other.getNumerator() * this.getDenominator()));
		Fraction returnValue = new Fraction(num, denom);
		returnValue.simplify();
		return returnValue;
	}
	
	public void simplify(){
		int startPoint = this.getNumerator() >= this.getDenominator() ? this.getNumerator()/2 : this.getDenominator()/2;
		for (int i = startPoint; i >= 1; i--){
			if(this.getNumerator() % i == 0 && this.getDenominator() % i == 0){
				this.setNumerator(this.getNumerator()/i);
				this.setDenominator(this.getDenominator()/i);
			}
		}
	}
	
	public Fraction addition(Fraction other) {
		int denom = this.getDenominator() * other.getDenominator();
        int num = ((this.getNumerator() * other.getDenominator()) + (other.getNumerator() * this.getDenominator()));
		Fraction returnValue = new Fraction(num, denom);
		returnValue.simplify();
		return returnValue;
    }

    private int myGcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
