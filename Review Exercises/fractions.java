public class Fraction implements Comparable<Fraction>
{
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }    
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }    
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }
    
    // Your work here!
    
    public long getTop(){
      return top;
    }
    
    public long getBot(){
      return bottom;
    }

    public String toString(){
      return top + "/" + bottom;
    }
    
    public long gcd(long a, long b){
      if(a == 0)
        return b;
      return gcd(b % a, a);
    }

    //Add two fractions
    public Fraction add(Fraction f2) {    
      long num = top * f2.getBot() + f2.getTop() * bottom;
      long denom = bottom * f2.getBot();
      long d = gcd(num, denom);
      return new Fraction(num / d, denom / d);
    }
    
    //...and make this class string representable
}
