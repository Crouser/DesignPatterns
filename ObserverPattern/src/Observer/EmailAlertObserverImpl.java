package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotifAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email sent to: "+ emailId);
    }
}
