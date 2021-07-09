import java.util.ArrayList;

public class Menu {

    private ArrayList<Item> pizzas = new ArrayList<>();
    private ArrayList<Item> drinks = new ArrayList<>();

    public Menu(){
        populateMenu();
    }

    //return a specific pizzas
    public Item getPizzas(int index){
        return pizzas.get(index);
    }
    public Item getDrinks(int index){
        return drinks.get(index);
    }

    public String getAllPizzas(){
        String aMenu = "";

        for(int i = 0; i < pizzas.size();i++){
            Item pizza = pizzas.get(i);
            aMenu += pizza.toString()+"\n";
        }

        return aMenu;
    }

    public String getAllDrinks(){
        String aMenu = "";
        for(int i = 0; i < drinks.size();i++){
            Item drink = drinks.get(i);
            aMenu +=  drink.toString()+"\n";
        }
        return aMenu;
    }
    public void populateMenu(){

        //pizzas
        pizzas.add(new Item("1. Margherita\t\t",18));
        pizzas.add(new Item("2. Marinara\t\t\t",22 ));
        pizzas.add(new Item("3. Siciliana\t\t",19));
        pizzas.add(new Item("4. Romana\t\t\t",20));
        pizzas.add(new Item("5. Calzone\t\t\t",21));
        pizzas.add(new Item("6. Viennese\t\t\t",21));

        //drinks
        drinks.add(new Item("7. Coca Cola\t\t",3));
        drinks.add(new Item("8. Coca Cola Zero\t",3));
        drinks.add(new Item("9. Sprite\t\t\t",3));
        drinks.add(new Item("10. Cafe Latte\t\t",2));
    }

    //prints out the full menu in one String
    public String showMenu(){
        String menu = "";
        menu += getAllPizzas() +"\n"+getAllDrinks();
        return menu;
    }
}
