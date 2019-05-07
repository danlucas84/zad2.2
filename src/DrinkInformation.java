import java.sql.SQLOutput;

public class DrinkInformation {

    public static void main(String[] args) {


Drink drink1 = new Drink();
drink1.drinkName = "Screwdriver";
drink1.drinkPrice = 20;
drink1.IsAlcoholic = true;
drink1.ingredients = new Ingredients();
var ice = drink1.ingredients.ice = "lod";
var juice = drink1.ingredients.juice ="sok" ;
var vodka = drink1.ingredients.vodka = "vodka";

        System.out.println("nazwa: " + drink1.drinkName);
        System.out.println("cena: " + drink1.drinkPrice + " zl");
        System.out.println("Skladniki: ");

        System.out.print(ice);
            System.out.print("\t");
        System.out.print(juice);
            System.out.print("\t");
        System.out.print(vodka);
            System.out.println("\n");
        System.out.println("Czy jest alkoholowy: " + drink1.IsAlcoholic);




Drink drink2 = new Drink();

drink2.drinkName = "DrinkAlkoFree";
drink2.drinkPrice = 30;
drink2.IsAlcoholic = false;
drink2.ingredients = new Ingredients();

ice = drink2.ingredients.ice = "lod";
juice = drink2.ingredients.juice = "sok";
var lemonade = drink2.ingredients.lemonade = "lemoniada";

            System.out.println("nazwa: " + drink2.drinkName);
            System.out.println("cena: " + drink2.drinkPrice + " zl");
            System.out.println("Skladniki: ");

            System.out.print(ice);
            System.out.print("\t");
            System.out.print(juice);
            System.out.print("\t");
            System.out.print(lemonade);
            System.out.println("\n");
            System.out.println("Czy jest alkoholowy: " + drink2.IsAlcoholic);

    }


}
