public class ClassD extends ClassC{

  public void overridePoly(){
    System.out.println("I am implemented in Class D");
  }

  public static void main(String[] args){
    ClassC objC = new ClassC();
    objC.doSomething();
    objC.getPolyBehavior();
    objC.getPolyBehavior(1);
    objC.getPolyBehavior(2);
    objC.overridePoly();
    
    //ClassD objD = new ClassD();
    //objD.overridePoly();

    //objC.doSomethingInB();
  }


}
