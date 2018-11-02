package com.whz.event.driver.jdkedition;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * 第二个观察者
 * @author ASUS
 * @date 2018/11/2
 */
@Slf4j
public class TwoObserver implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        log.info("email update");
    }
}
