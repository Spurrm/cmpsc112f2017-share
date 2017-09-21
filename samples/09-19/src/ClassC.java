public class ClassC implements InterfaceA, InterfaceB{
  public void doSomething(){
    System.out.println("I am in class B");
  }
  public void getPolyBehavior(){
    System.out.println("I am the first kind...");
  }
  public void getPolyBehavior(int x){
    System.out.println("I am the second kind with categry:" + x);
  }
  public void overridePoly(){
    System.out.println("I am implemented in Class C");
  }



}
