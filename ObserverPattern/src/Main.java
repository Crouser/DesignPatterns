import Observable.IPhoneObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotifAlertObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StockObservable stockObservable = new IPhoneObservableImpl();
        NotifAlertObserver emailObserver = new EmailAlertObserverImpl("talha@mail.com", stockObservable);
        NotifAlertObserver mobileObserver = new MobileAlertObserverImpl(6388409474L, stockObservable);

        stockObservable.addObserver(emailObserver);
        stockObservable.addObserver(mobileObserver);

        stockObservable.setStockCount(10);

        stockObservable.removeObserver(emailObserver);

        stockObservable.setStockCount(-10);
        stockObservable.setStockCount(1);


    }
}