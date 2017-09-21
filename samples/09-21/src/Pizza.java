package com.pizza.ordering;

public class Pizza{
  private String name;
  private double price;
  private double cookingTime;

  // constructor
  // constructor should have the exact same name as the class
  public Pizza(String strName, double dblPrice, double dblCookingTime){

    this.name = strName;
    this.price = dblPrice;
    this.cookingTime = dblCookingTime;
  }
  // accessor and mutators....
  public String getName(){
    return name;
  }
  public void setName(String strName){
    this.name = strName;
  }

  public double getPrice(){
    return price;
  }
  public void setPrice(double dblPrice){
    this.price = dblPrice;
  }

  public double getCookingTime(){
    return cookingTime;
  }
  public void setCookingTime(double dblCookingTime){
    this.cookingTime = dblCookingTime;
  }

}
