package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotifAlertObserver{
    Long number;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(Long number, StockObservable stockObservable) {
        this.number = number;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Alert sent to: "+ number);
    }
}
