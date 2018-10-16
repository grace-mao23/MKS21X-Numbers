public class RealNumber{

  private double value;

  public RealNumber(double val){
    value = val;
  }

  public double add(RealNumber other){
    return other.getValue() + this.val;

  }

  public double multiply(RealNumber other){
    return this.val * other.getValue();
  }

  public double divide(RealNumber other){
    return 0;
  }

  public double subtract(RealNumber other){
    return 0.0;
  }


  public double getValue(){
    return value;
  }

  public String toString(){
    return "";
  }

  public int compareR(RealNumber r){
    return 0;
  }

}
