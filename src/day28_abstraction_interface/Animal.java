package day28_abstraction_interface;

public abstract class Animal {
	public abstract String getName();
}

abstract class BigCat extends Animal {
	public String getName() {
		return "BigCat";
	}
	public abstract void roar();
}

//If abstract method from grand parent is inherited from parent class, no need to 
//inherit it from child class. If you want you can do it, it means you are overriding the method.
class Lion extends BigCat{
  public void roar() {
      System.out.println("Lions roar");
  }
}
