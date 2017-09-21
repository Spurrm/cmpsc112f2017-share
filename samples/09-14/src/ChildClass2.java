package first;
public class ChildClass2 extends ParentClass1
//public class ChildClass extends ParentClass1, ParentClass2
// why this behavior is seen in this class.

{
  private String childID = "";
  public String getChildID(){
    return childID;
  }
  public void setChildID(String _childID){
    childID = _childID;
  }
  public void methodInChild2(){
    System.out.println("Insde child method....");
    System.out.println("I am okay and not calling parent....");

    //methodInParent1();
    //methodInParent2(); // establish edge between parent and child class
  }
}
