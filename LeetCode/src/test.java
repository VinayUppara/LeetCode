class Animal {    
   public static void move(){
      System.out.println("Animal can move");
   }
   
   public final void sleep() {
	   System.out.println("Animal can sleep");
   }
}

class Dog extends Animal {

   public static void move(int i) {
      System.out.println("Dog can move");
   }
   
   public void sleep(int i) {
	   System.out.println("Dog can sleep");
   }
}

public class test {

   public static final void main(String args[]) {
      Animal a = new Animal(); // Animal reference and object
      Dog b = new Dog(); // Animal reference but Dog object
      
    

		/*
		 * a.move();//output: Animals can move
		 * 
		 * b.move();//output:Dogs can walk and run
		 * 
		 * a.sleep();
		 * 
		 * b.sleep();
		 */
      
      a.move();
      
      a.sleep();
   }
}