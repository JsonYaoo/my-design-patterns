package com.jsonyao.cs.singletonPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * 单例模式
 * A. Relation:
 *      a. https://www.cnblogs.com/iceblow/p/7453467.html
 *      b. https://segmentfault.com/a/1190000010755849
 *      c. https://www.cnblogs.com/java-bible/p/13883305.html
 *      d. https://www.jianshu.com/p/d35f244f3770
 *      e. https://www.hollischuang.com/archives/2498
 */
public class Client {

    public static void main(String[] args) {
        // 尝试次数
        int tryCount = 3;

        // 多线程并发数量
        int threadCount = 10;

        Long start = System.currentTimeMillis();

        for(int j = 0; j < tryCount; j++){
            System.out.println(String.format("开始第%d次尝试...", j+1));

            for(int i = 0; i < threadCount; i++){
                new Thread(){
                    @Override
                    public void run() {
                        int code = Thread.currentThread().getId() % 2 == 0? 2 : 1;// 动态单例编码

                        /**
                         * 1、饿汉式
                         *      A. 是否延迟实例化: 否, 启动时就加载
                         *      B. 优点:
                         *          a. 线程安全, 实现简单
                         *              => 利用类加载是线程安全的特性
                         *      C. 缺点:
                         *          a. 提前初始化会延长类加载器加载类的时间
                         *          b. 如果不使用会浪费内存空间
                         *          c. 不能传递参数进行构造
                         */
//                        Object object = Singleton1.getInstance();

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
//                      Object object = Singleton2.getInstance(code);

                        /**
                         * 3、懒汉式-线程安全-锁方法实现
                         *      A. 是否延迟实例化: 是, 调用时才进行实例化
                         *      B. 优点:
                         *          a. 可以延迟实例化
                         *          b. 可以传递参数构造
                         *          c. 实现简单
                         *          d. 线程安全
                         *              => 对getInstance()进行加锁
                         *      C. 缺点:
                         *          a. 必须加锁synchronized才能保证单例, 但加锁导致效率低下, 99%的情况不要同步
                         */
//                        Object object = Singleton3.getInstance(code);

                        /**
                         * 4、懒汉式-线程安全-静态内部类(推荐)
                         *      A. 是否延迟实例化: 是, 调用时才进行实例化
                         *          => 利用静态内部类只有在使用时才会加载的特性
                         *      B. 优点:
                         *          a. 可以延迟实例化
                         *          b. 线程安全
                         *              => 利用类加载是线程安全的特性
                         *      C. 缺点:
                         *          a. 不可以传递参数构造
                         */
//                        Object object = Singleton4.getInstance();

                        /**
                         * 5、双重检查锁(推荐)
                         *      A. 是否延迟实例化: 是, 调用时才进行实例化
                         *      B. 优点:
                         *          a. 可以延迟实例化
                         *          b. 可以传递参数构造
                         *          c. 线程安全
                             *          => 只对getInstance()部分代码进行加锁, 保证多线程性能
                         *              => 1、使用volatile保证线程可见, 第一次创建单例后, 其他线程能够立马知道
                         *                 2、使用volatile关键字后, 指令重排序被禁止, 所有的写操作都讲发生在操作之前, 保证线程访问的肯定是一个被初始化过的对象
                         *      C. 缺点:
                         *          a. 实现起来不够简单
                         *          b. 会被反射破坏单例
                         */
//                        Object object = Singleton5.getInstance(code);

                        /**
                         * 6、枚举(JDK 1.5后)(推荐)
                         *      A. 是否延迟实例化: 是, 调用时才进行实例化
                         *          => 利用静态内部类只有在使用时才会加载的特性
                         *      B. 优点:
                         *          a. 可以延迟实例化
                         *          b. 线程安全
                         *              => 枚举类创建天生是单例且线程安全的, 把singleton6单例对象放在枚举类构造函数里创建, 可以保证单例且线程安全
                         *          c. 不会被序列化锁破坏, 枚举类的反序列化后还是单例(枚举类的反序列化不是通过反射获取的)
                         *      C. 缺点:
                         *          a. 实现起来不够简单
                         *          b. 不可以传递参数构造
                         */
                        Object object = Singleton6.getInstance();

                        // 打印单例对象
                        System.out.println(String.format("线程%s创建单例完毕 => %s", Thread.currentThread().getName(), object));
                    }
                }.start();
            }

            System.out.println(String.format("第%d次尝试结束...", j+1));
            System.out.println();
        }

        Long end = System.currentTimeMillis();
        System.out.println();
        System.out.println(String.format("%d次尝试共花费%dms", tryCount, end-start));
    }

}
