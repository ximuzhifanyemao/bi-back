package com.yupi.springbootinit.config;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class ThreadPoolExecutorConfig {
    @Bean
    public ThreadPoolExecutor threadPoolExecutor(){
        //创建一个线程工厂
        ThreadFactory threadFactory = new ThreadFactory(){

            private int count = 1;

            @Override
            public Thread newThread(@NotNull Runnable r){
                //创建一个新的线程
                Thread thread = new Thread(r);
                //给线程命名
                thread.setName("线程" + count);

                count++;
                return thread;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4,100, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),threadFactory);
        //返回创建得线程池
        return threadPoolExecutor;
    }
}
