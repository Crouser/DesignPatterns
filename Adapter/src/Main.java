import Adaptee.WeightInPounds;
import Adaptee.WeightInPoundsImpl;
import Adapter.AdapterConcreteClass;
import Adapter.AdapterInterface;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AdapterInterface adapterInterface = new AdapterConcreteClass(new WeightInPoundsImpl());
        System.out.println(adapterInterface.getWeightInKg());

    }
}