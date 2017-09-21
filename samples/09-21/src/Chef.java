package com.pizza.ordering;
public class Chef extends Thread{
  Pizza pizza;
  ChefListener listener;

  // constructor for Chef class
  public Chef(Pizza _pizza, ChefListener _listener){
    this.pizza = _pizza;
    this.listener = _listener;

  }
  @Override
  public void run(){
    // simulate cooking using thread.sleep
    try{
        Thread.sleep((long) (pizza.getCookingTime() * 1000));
        //System.out.println("Pizza is ready !!");
    }
    catch(InterruptedException e){
      e.printStackTrace();
    }
    listener.pizzaCooked(pizza);

  }

}
