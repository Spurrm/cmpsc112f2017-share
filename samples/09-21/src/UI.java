package com.pizza.ordering;
import java.util.Scanner;
public class UI implements ChefListener{
  // this method is implemented from the ChefListener Interface
  public void pizzaCooked(Pizza pizza){
    System.out.println(pizza.getName() + " pizza has been cooked enjoy !");

  }
  public void prompt(){
    Pizza ct = new Pizza("cheese and tomato", 2, 5);
    Pizza bc = new Pizza("bbq chicken", 4, 2);
    Pizza pep = new Pizza("pepperoni", 3, 4);

    Pizza[] availablePizzas = new Pizza[]{ct, bc, pep};
    for (Pizza pizza: availablePizzas)
      System.out.println(pizza.getName());

    // get user iput
    System.out.println("Please choose the pizza from the menu below:");
    System.out.println("Press 0 for cheese and tomato");
    System.out.println("Press 1 for barbeque chicken");
    System.out.println("Press 2 for pepperoni");
    Scanner in = new Scanner(System.in);
    int choice = in.nextInt();
    Pizza selection = availablePizzas[choice];
    Chef chef = new Chef(selection, this);
    chef.start();
    // this is the keyword which would pass the object of UI class
  }

  public static void main(String[] args){
      UI ui = new UI();
      for (int i =0; i <5; i++)
        ui.prompt();
  }

}
