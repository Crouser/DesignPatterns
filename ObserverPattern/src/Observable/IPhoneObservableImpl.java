package Observable;

import Observer.NotifAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable {

    List<NotifAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void addObserver(NotifAlertObserver notifAlertObserver) {
        observerList.add(notifAlertObserver);
    }

    @Override
    public void removeObserver(NotifAlertObserver notifAlertObserver) {
        observerList.remove(notifAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for( NotifAlertObserver observer: observerList) {
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int stocknumber) {
        if(stockCount == 0) {
            notifySubscribers();
        }
        stockCount += stocknumber;
    }
}
