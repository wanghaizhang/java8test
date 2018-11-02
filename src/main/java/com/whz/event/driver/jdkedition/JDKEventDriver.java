package com.whz.event.driver.jdkedition;

/**
 * @author ASUS
 * @date 2018/11/2
 */
public class JDKEventDriver {
    public static void main(String[] args){
        UpdateOrderStatusSubject updateOrderStatusSubject=new UpdateOrderStatusSubject();

        TwoObserver twoObserver=new TwoObserver();
        OneObserver oneObserver=new OneObserver();

        updateOrderStatusSubject.addObserver(oneObserver);
        updateOrderStatusSubject.addObserver(twoObserver);


        updateOrderStatusSubject.updateStatus(3);
    }
}
