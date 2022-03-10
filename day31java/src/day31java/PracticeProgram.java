package day31java;

    class Base {
		  final public void show() {
		    System.out.println("Base:show() called");
		  }
    }
		    class Derived extends Base {
		         public void show1() {
				     System.out.println("Derived:show() called");
				   }
		    }
public class PracticeProgram {

			    public static void main(String[] args) {
			      Base b = new Derived();
			      b.show();
			    }
}

		