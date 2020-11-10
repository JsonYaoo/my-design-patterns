package com.jsonyao.cs.singletonPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式
 * A. 单例模式创建方式:
 *         方式                   是否延迟加载              是否线程安全              是否推荐
 *      a. 饿汉式                 否                       是                       是
 *      b. 懒汉式                 是                       否                       否
 *      c. 懒汉式-锁实现           是                       否                       否
 *      d. 懒汉式-静态内部类实现    是                       是                       是
 *      e. 双重检查锁              是                       是                       是
 *      f. 枚举类                 是                       是                       是
 * B. 通过反射调用私有构造函数破坏单例:
 *         方式                   能否被破坏                能否优化到不能反射         能否优化到防止破坏
 *      a. 饿汉式                 true                     true                     true
 *      b. 懒汉式                 true                     false                    false
 *      c. 懒汉式-锁实现           true                     false                    false
 *      d. 懒汉式-静态内部类        true                    true                     true
 *      e. 双重检查锁              true                    false                    false
 *      f. 枚举类                  true                    true                     true
 *      => 由此可见, 只要是通过静态内部类实现的 & 饿汉式的可以防止反射破坏单例
 * C. 通过发序列方式破坏单例:
 *      a. 所有方式都会被反序列破坏单例, 但是都可以防止反序列破坏单例
 *      b. 单例对象添加private Object readResolve() throws ObjectStreamException方法, 直接返回单例对象即可防止破坏
 * D. Relation:
 *      a. https://www.cnblogs.com/iceblow/p/7453467.html
 *      b. https://segmentfault.com/a/1190000010755849
 *      c. https://www.cnblogs.com/java-bible/p/13883305.html
 *      d. https://www.jianshu.com/p/d35f244f3770
 *      e. https://www.hollischuang.com/archives/2498
 *      f. https://www.cnblogs.com/cjn123/p/12159536.html
 *      g. https://blog.csdn.net/u014653197/article/details/78114041
 */
public class Client {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        // 测试单例
//        testSingleton();

        // 测试反射是否能破坏单例
//        testDestoryByReflection();

        // 测试反射是否能破坏单例
        testDestoryByDeserializable();
    }

    /**
     * 测试单例
     */
    public static void testSingleton(){
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

    /**
     * 破坏单例模式
     *      A. 通过反射的方式直接调用私有构造器创建实例
     */
    public static void testDestoryByReflection() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object object1 = null;// 获取单例1
        Object object2 = null;// 获取单例2

        Class clazz = null;// 单例Class对象
        Object object3 = null;// 反射出来的目标对象3
        Object object4 = null;// 反射出来的目标对象4

        /**
         * 1、饿汉式
         *      A. 单例是否被破坏: true
         *      B. 能否优化到不能反射: true
         *      C. 能否优化到防止反射破坏单例: true
         */
//        clazz = Singleton1.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);// 开启所有访问权限
//
//        object1 = Singleton1.getInstance();
//        object2 = Singleton1.getInstance();
//        object3 = constructor.newInstance();// 第一次反射调用私有构造器
//        object4 = constructor.newInstance();// 第二次反射调用私有构造器

        /**
         * 2、懒汉式-线程不安全
         *      A. 单例是否被破坏: true
         *      B. 能否优化到不能反射: false
         *      C. 能否优化到防止反射破坏单例: false
         */
//        clazz = Singleton2.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);// 开启所有访问权限
//
//        object1 = Singleton2.getInstance(1);
//        object2 = Singleton2.getInstance(2);
//        object3 = constructor.newInstance();// 第一次反射调用私有构造器
//        object4 = constructor.newInstance();// 第二次反射调用私有构造器

        /**
         * 3、懒汉式-线程安全-锁方法实现
         *      A. 单例是否被破坏: true
         *      B. 能否优化到不能反射: false
         *      C. 能否优化到防止反射破坏单例: false
         */
//        clazz = Singleton3.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);// 开启所有访问权限
//
//        object1 = Singleton3.getInstance(1);
//        object2 = Singleton3.getInstance(2);
//        object3 = constructor.newInstance();// 第一次反射调用私有构造器
//        object4 = constructor.newInstance();// 第二次反射调用私有构造器

        /**
         * 4、懒汉式-线程安全-静态内部类
         *      A. 单例是否被破坏: true
         *      B. 能否优化到不能反射: true
         *      C. 能否优化到防止反射破坏单例: true
         */
//        clazz = Singleton4.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);// 开启所有访问权限
//
//        object1 = Singleton4.getInstance();
//        object2 = Singleton4.getInstance();
//        object3 = constructor.newInstance();// 第一次反射调用私有构造器
//        object4 = constructor.newInstance();// 第二次反射调用私有构造器

        /**
         * 5、双重检查锁
         *      A. 单例是否被破坏: true
         *      B. 能否优化到不能反射: false
         *      C. 能否优化到防止反射破坏单例: false
         */
//        clazz = Singleton5.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);// 开启所有访问权限
//
//        object1 = Singleton5.getInstance(1);
//        object2 = Singleton5.getInstance(2);
//        object3 = constructor.newInstance();// 第一次反射调用私有构造器
//        object4 = constructor.newInstance();// 第二次反射调用私有构造器

        /**
         * 6、枚举(JDK 1.5后)
         *      A. 单例是否被破坏: true
         *      B. 能否优化到不能反射: true
         *      C. 能否优化到防止反射破坏单例: true
         */
        clazz = Singleton6.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);// 开启所有访问权限

        object1 = Singleton6.getInstance();
        object2 = Singleton6.getInstance();
        object3 = constructor.newInstance();// 第一次反射调用私有构造器
        object4 = constructor.newInstance();// 第二次反射调用私有构造器

        // 打印对象
        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);
        System.out.println(object4);
    }

    /**
     * 破坏单例模式
     *      A. 通过反序列方式构造新的对象
     */
    public static void testDestoryByDeserializable() throws IOException, ClassNotFoundException {

        Object object = null;
        Object reObject = null;

        /**
         * 1、饿汉式
         *      A. 单例是否被破坏: true
         *      B. 能否优化到防止反序列化破坏单例: true
         *          => 添加Object readResolve()方法
         */
//        object = Singleton1.getInstance();

        /**
         * 2、懒汉式-线程不安全
         *      A. 单例是否被破坏: true
         *      B. 能否优化到防止反序列化破坏单例: true
         *          => 添加Object readResolve()方法
         */
//        object = Singleton2.getInstance(1);

        /**
         * 3、懒汉式-线程安全-锁方法实现
         *      A. 单例是否被破坏: true
         *      B. 能否优化到防止反序列化破坏单例: true
         *          => 添加Object readResolve()方法
         */
//        object = Singleton3.getInstance(1);

        /**
         * 4、懒汉式-线程安全-静态内部类
         *      A. 单例是否被破坏: true
         *      B. 能否优化到防止反序列化破坏单例: true
         *          => 添加Object readResolve()方法
         */
//        object = Singleton4.getInstance();

        /**
         * 5、双重检查锁
         *      A. 单例是否被破坏: true
         *      B. 能否优化到防止反序列化破坏单例: true
         *          => 添加Object readResolve()方法
         */
//        object = Singleton5.getInstance(1);

        /**
         * 6、枚举(JDK 1.5后)
         *      A. 单例是否被破坏: true
         *      B. 能否优化到防止反序列化破坏单例: true
         *          => 添加Object readResolve()方法
         */
        object = Singleton6.getInstance();

        // 设置输出管道
        String fileName = "object.out";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 把单例写入文件
        oos.writeObject(object);
        oos.close();
        fos.close();

        // 设置输出管道
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 从文件读入对象
        reObject = ois.readObject();
        ois.close();
        fis.close();

        // 打印单例对象
        System.out.println(object);
        System.out.println(reObject);
    }

}
