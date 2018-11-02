package com.whz.event.driver.jdkedition;


import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

/**
 * 被观察者
 * @author ASUS
 * @date 2018/11/2
 */
@Slf4j
public class UpdateOrderStatusSubject extends Observable {


    /**
     * 事件监听者
     * @param newStatus
     */
    public void updateStatus(int newStatus) {
        // 业务逻辑操作
        log.info("更新新的状态为：" + newStatus);
        // 通知观察者
        this.setChanged();
        this.notifyObservers();
    }

}
