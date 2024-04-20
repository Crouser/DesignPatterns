import Base.BaseCoffee;
import Base.Cappucino;
import Decorator.Milk;
import Decorator.Sugar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BaseCoffee coffee = new Milk(new Sugar(new Cappucino()));
        System.out.println(coffee.cost());
    }
}