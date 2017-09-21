package first;

public class TestClass2{

  public static void main(String[] args){
      System.out.println("I am the starting point....");
      //ParentClass parent = new ParentClass();
      //parent.methodInParent();

      ChildClass1 child1 = new ChildClass1();
      child1.methodInChild1();

      ChildClass2 child2 = new ChildClass2();
      child2.methodInChild2();

      child2.setChildID("Child02");
      System.out.println(child2.getChildID());




  }
}
