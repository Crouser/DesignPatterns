package Observable;

import Observer.NotifAlertObserver;

public interface StockObservable {

    public void addObserver(NotifAlertObserver notifAlertObserver);

    public void removeObserver(NotifAlertObserver notifAlertObserver);

    public void notifySubscribers();

    public int getStockCount();

    public void setStockCount(int stocknumber);
}
