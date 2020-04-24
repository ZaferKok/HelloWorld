package day21_passby_date_accessmodifiers;

public class PassByReference {

	public static void main(String[] args) {
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! interew sorusuymuş ama anlamadım !!!!!!!!!!!!!!!!!
		String str = "Ali";
         
         Xref al = new Xref();
         
         System.out.println(al.concat(str));
         System.out.println(str);
     }
 }
class Xref {
 
 public static String concat(String str) {
     str = str + "x";
     return str;

	}

}
