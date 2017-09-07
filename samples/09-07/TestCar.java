package com.oops;
public class TestCar{
  public static void main(String[] args){
    Car incr = new Car();
    incr.model = "Ford-Focus";
    incr.color = "Blue";

    Services serv = new Services();
    Car outcr = serv.serviceCar(cr);
    System.out.println(outcr.model + " " + outcr.color + " " + outcr.doneService);
      System.out.println(incr.model + " " + incr.color + " " + incr.doneService);


  }
}
