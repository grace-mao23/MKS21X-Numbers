public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else {
      numerator = nume;
      denominator = deno;
    }
    if (deno < 0) {
      numerator *= -1;
      denominator *= -1;
    }
    if (nume != 0) {
      this.reduce();
    }
  }

  public double getValue(){
    return (double)numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(this.getDenominator(), this.getNumerator());
  }

  public boolean equals(RationalNumber other){
    this.reduce();
    other.reduce();
    return this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator();
  }

  public String toString(){
    if (numerator == 0) {
      return "0";
    }
    if (denominator == 1) {
      return ""+numerator;
    }
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    int a1 = Math.abs(a);
    int b1 = Math.abs(b);
    if (b == 0) {
      return Math.max(a1,b1);
    } else {
      return gcd(Math.min(a1,b1),Math.max(a1,b1) % Math.min(a1,b1));
    }
  }

  private void reduce(){
    int firstN = this.getNumerator();
    numerator = this.getNumerator() / gcd(firstN, this.getDenominator());
    denominator = this.getDenominator() / gcd(firstN, this.getDenominator());
  }

  /******************Operations Return a new RationalNumber!!!!****************/

  public RationalNumber multiply(RationalNumber other){
    int numOf = this.getNumerator() * other.getNumerator();
    int denoOf = this.getDenominator() * other.getDenominator();
    RationalNumber answer = new RationalNumber(numOf,denoOf);
    return answer;
  }

  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other){
    int newD = this.getDenominator() * other.getDenominator();
    return new RationalNumber(this.getNumerator() * other.getDenominator()
                              + this.getDenominator() * other.getNumerator(),
                              newD);
  }

  public RationalNumber subtract(RationalNumber other){
    int newD = this.getDenominator() * other.getDenominator();
    return new RationalNumber(this.getNumerator() * other.getDenominator()
                              - this.getDenominator() * other.getNumerator(),
                              newD);
  }
}
