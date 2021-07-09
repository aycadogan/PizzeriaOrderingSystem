import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //get a menu
        Menu menu = new Menu();

        //prints a list of all menu
        System.out.println("====== PIZZERIA ========");
        System.out.println(menu.showMenu());
        System.out.println("========================");

        //place an order
        order();
    }

    public static void order(){
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        char decision;

        double total = 0;

        do{
            int choose;
            System.out.println("To order, enter the item's number:");
            choose = input.nextInt();

            switch (choose){
                case 1:
                    System.out.println(menu.getPizzas(0));
                    System.out.println("How many pizza would you like to buy?");
                    int quantityPizza1 = input.nextInt();
                    total = total + (quantityPizza1)*(menu.getPizzas(0).getPrice());
                    break;
                case 2:
                    System.out.println(menu.getPizzas(1));
                    System.out.println("How many pizza would you like to buy?");
                    int quantityPizza2 = input.nextInt();
                    total = total + (quantityPizza2)*(menu.getPizzas(1).getPrice());
                    break;
                case 3:
                    System.out.println(menu.getPizzas(2));
                    System.out.println("How many pizza would you like to buy?");
                    int quantityPizza3 = input.nextInt();
                    total = total + (quantityPizza3)*(menu.getPizzas(2).getPrice());
                    break;
                case 4:
                    System.out.println(menu.getPizzas(3));
                    System.out.println("How many pizza would you like to buy?");
                    int quantityPizza4 = input.nextInt();
                    total = total + (quantityPizza4)*(menu.getPizzas(3).getPrice());
                    break;
                case 5:
                    System.out.println(menu.getPizzas(4));
                    System.out.println("How many pizza would you like to buy?");
                    int quantityPizza5 = input.nextInt();
                    total = total + (quantityPizza5)*(menu.getPizzas(4).getPrice());
                    break;
                case 6:
                    System.out.println(menu.getPizzas(5));
                    System.out.println("How many pizza would you like to buy?");
                    int quantityPizza6 = input.nextInt();
                    total = total + (quantityPizza6)*(menu.getPizzas(5).getPrice());
                    break;
                case 7:
                    System.out.println(menu.getDrinks(0));
                    System.out.println("How many drink would you like to buy?");
                    int quantityDrink1 = input.nextInt();
                    total = total + (quantityDrink1)*(menu.getDrinks(0).getPrice());
                    break;
                case 8:
                    System.out.println(menu.getDrinks(1));
                    System.out.println("How many drink would you like to buy?");
                    int quantityDrink2 = input.nextInt();
                    total = total + (quantityDrink2)*(menu.getDrinks(1).getPrice());
                    break;
                case 9:
                    System.out.println(menu.getDrinks(2));
                    System.out.println("How many drink would you like to buy?");
                    int quantityDrink3 = input.nextInt();
                    total = total + (quantityDrink3)*(menu.getDrinks(2).getPrice());
                    break;
                case 10:
                    System.out.println(menu.getDrinks(3));
                    System.out.println("How many drink would you like to buy?");
                    int quantityDrink4 = input.nextInt();
                    total = total + (quantityDrink4)*(menu.getDrinks(3).getPrice());
                    break;
            }
            System.out.println("Would you like to buy something more?");
            System.out.println("Press 1 for Yes and 2 for No");
            decision= input.next().charAt(0);
        }while(decision != 'n' && decision != 'N');
            System.out.println("Total price is "+"$"+ total);
            System.out.println("Enjoy your meal!");
    }

}
