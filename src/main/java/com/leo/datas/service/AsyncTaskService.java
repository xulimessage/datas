package com.leo.datas.service;

import org.springframework.scheduling.annotation.Async;

public class AsyncTaskService {
    @Async
    public void excuteAsyncTaskTest(String name) {
        for (int i = 0; i < 100; i++) {
            System.out.println("正在执行异步任务" + name + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
