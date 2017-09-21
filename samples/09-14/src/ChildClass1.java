package first;
public class ChildClass1 extends ParentClass1
//public class ChildClass extends ParentClass1, ParentClass2
// why this behavior is seen in this class.

{

  public void methodInChild1(){
    System.out.println("Insde child method 01....");
    methodInParent1();
    //methodInParent2(); // establish edge between parent and child class
  }
}
