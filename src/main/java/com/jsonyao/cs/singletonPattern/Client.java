package com.jsonyao.cs.singletonPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * 单例模式
 * A. Relation:
 *      a. https://www.cnblogs.com/iceblow/p/7453467.html
 *      b. https://segmentfault.com/a/1190000010755849
 *      c. https://www.cnblogs.com/g177w/p/12511939.html
 */
public class Client {

    private static class Worker extends Thread {

        private Set<Object> instanceSet;

        public Worker(Set<Object> instanceSet) {
            this.instanceSet = instanceSet;
        }

        @Override
        public void run() {
            int code = Thread.currentThread().getId() % 2 == 0? 2 : 1;// 动态单例编码
            /**
             * 1、饿汉式
             *      A. 是否延迟实例化: 否, 启动时就加载
             *      B. 优点:
             *          a. 没有线程安全, 实现简单
             *      C. 缺点:
             *          a. 提前初始化会延长类加载器加载类的时间
             *          b. 如果不使用会浪费内存空间
             *          c. 不能传递参数进行构造
             */
            Object object = Singleton1.getInstance();

            /**
             * 2、懒汉式-线程不安全
             *      A. 是否延迟实例化: 是, 调用时才进行实例化
             *      B. 优点:
             *          a. 可以延迟实例化
             *          b. 可以传递参数构造
             *          c. 实现简单
             *      C. 缺点:
             *          a. 线程不安全
             */
//            Object object = Singleton2.getInstance(code);

            /**
             * 3、懒汉式-线程安全-锁方法实现
             *      A. 是否延迟实例化: 是, 调用时才进行实例化
             *      B. 优点:
             *          a. 可以延迟实例化
             *          b. 可以传递参数构造
             *          c. 实现简单
             *          d. 线程安全
             *      C. 缺点:
             *          a. 效率低下, 99%的情况
             */
//            Object object = Singleton3.getInstance(code);


            this.printResult(object);
        }

        private void printResult(Object object){
            // 添加单例对象
//            System.out.println(String.format("线程%s创建单例完毕 => %s",
//                    Thread.currentThread().getName(), object));

            // 判断是否为单例
            instanceSet.add(object);
            if(instanceSet.size() > 1){
                System.out.println("该方法创建的单例是非线程安全的!");
            }
        }

    }

    public static void main(String[] args) {
        // 尝试次数
        int tryCount = 10;

        // 多线程并发数量
        int threadCount = 10000;

        Long start = System.currentTimeMillis();

        for(int j = 0; j < tryCount; j++){
            System.out.println(String.format("开始第%d次尝试...", j+1));

            Set<Object> instanceSet = new HashSet<>();
            for(int i = 0; i < threadCount; i++){
                Worker worker = new Worker(instanceSet);
                worker.start();
            }

            System.out.println(String.format("第%d次尝试结束...", j+1));
            System.out.println();
        }

        Long end = System.currentTimeMillis();
        System.out.println();
        System.out.println(String.format("%d次尝试共花费%dms", tryCount, end-start));
    }

}
