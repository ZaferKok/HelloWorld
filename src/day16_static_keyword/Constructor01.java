package day16_static_keyword;

public class Constructor01 {
	
        // What is the output 
        int x = 3;
        int y = 5;
        
        Constructor01(){
            this.x = 10;
            System.out.println(x+y);  
        }
        
        Constructor01(int i){
            this();
            this.y = i; 
            System.out.println(x+y);  
        }
        
        public static void main(String[] args) {    
        	
            Constructor01 obj2 = new Constructor01(7);
            Constructor01 obj1 = new Constructor01();
            
        }
}

