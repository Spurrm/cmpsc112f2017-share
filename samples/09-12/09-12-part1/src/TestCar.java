package com.oops;
public class TestCar extends Services{
  public Car serviceCar(Car c){
    c.doneService = true;
    return c;
  }
  public static void main(String[] args){
    Car incr = new Car();
    incr.model = "Ford-Focus";
    incr.color = "Blue";

    // you cannot instantiate abstract class...
    //Services serv = new Services();

    Services serv = new TestCar();
    Car outcr = serv.serviceCar(incr);
    System.out.println(outcr.model + " " + outcr.color + " " + outcr.doneService);
    serv.doNothing();

    //System.out.println(incr.model + " " + incr.color + " " + incr.doneService);


  }
}
