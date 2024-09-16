public class Hex{
  private int val;
  
  public Hex(int value){
    val = value;
  }
  
  public int valueOf(){
    return val;
  }
  
  public String toJSON(){
    return "0x" + Integer.toHexString(val).toUpperCase();
   }
  
  public String toString(){
    return "0x" + Integer.toHexString(val).toUpperCase();
  }
  
  public Hex plus(Hex other){
    return new Hex(val + other.valueOf());
  }
  
  public Hex minus(Hex other){
    return new Hex(val - other.valueOf());
  }
  
  public Hex plus(int number){
    return new Hex(val + number);
  }
  
  public Hex minus(int number ){
    return new Hex(val - number);
  }
  
  public static int parse(String string){
    if(string.contains("0x"))
      return Integer.decode(string);
    return Integer.decode("0x" + string);
  }
  
  public boolean equals(Object other){
    if(other == null)
      return false;
    
    if(other.getClass() != this.getClass())
      return false;
    
    final Hex obj = (Hex) other;
    if(this.valueOf() != obj.valueOf())
      return false;
    
    return true;
  }
}
