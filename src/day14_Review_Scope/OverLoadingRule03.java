package day14_Review_Scope;

public class OverLoadingRule03 {

	public static void main(String[] args) {
        
        /* 3)Sequence of Data type of parameters.
               add(int, float)
               add(float, int)
        */
  }
  
  public static void overLoad03(int num, String str) {
      System.out.println("Switching parameters is okay for overloading");
  }
  
  public static void overLoad03(String str, int num) {
      System.out.println("Switching parameters is okay for overloading");
  }

}
