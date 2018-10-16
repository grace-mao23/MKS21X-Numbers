public class RationalNumber extends RealNumber{

  private int numerator;
  private int denominator;

  public RationalNumber(int num, int den){
    super(1.0);
    numerator = num;
    denominator = den;
  }

  public double getValue(){
    return 0.0;
  }

  public int getNumerator(){
    return 0;
  }

  public int getDenominator(){
    return 0;
  }

  public RationalNumber reciprocal(){
    return null;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return false;
  }

  public int compareQ(RationalNumber q){
    return 0;
  }

  public String toString(){
    return "";
  }

}
