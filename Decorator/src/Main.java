import Base.BasePizza;
import Base.Farmhouse;
import Base.Margherita;
import Base.VeggieDelight;
import Decorator.ExtraCheese;
import Decorator.Jalapeno;
import Decorator.Mushroom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        BasePizza pizza = new Jalapeno(new Mushroom(new ExtraCheese(new Farmhouse()))); // try combinations
        System.out.println(pizza.cost());


    }
}