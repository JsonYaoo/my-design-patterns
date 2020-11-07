package com.jsonyao.cs.sixPrinciples.openClosePrinciple;

/**
 * 开闭原则-案例分析
 */
public class OpenClosePrinciple {

    public static void test() {
        /**
         * 1、案例1
         *      A. 案例详情:
         *          a. 书本有书名、作者和价格三个属性, 获取每本书的实际价格
         */
//        IBook[] iBooks = new IBook[3];
//        iBooks[0] = new NovelBook("天龙八部", "金庸", 32d);
//        iBooks[1] = new NovelBook("巴黎圣母院", "雨果", 42d);
//        iBooks[2] = new NovelBook("悲惨世界", "雨果", 52d);
//
//        for(int i = 0; i < iBooks.length; i++){
//            System.out.println(String.format("书名%s, 作者%s, 实际价格为%f", iBooks[i].getName(), iBooks[i].getAuthor(), iBooks[i].getPrice()));
//        }

        /**
         * 2、案例2
         *      A. 案例详情:
         *          a. 书本有书名、作者和价格三个属性, 如今需求变更, 所有40元以上的书籍打九折出售, 然后需要获取每本书的实际价格
         *          b. 修改IBook接口: 在IBook接口上, 新增一个getOffPrice()方法, 专门用于进行打折处理
         *      B. 缺点:
         *          a. 实现该接口的类全部都需要修改, 最后获取实际价格的方法也需要修改为getOffPrice(), 花销比较大
         *          b. 同时IBook作为协议, 应该是稳定可靠的, 不应该经常变化, 否则作为契约的作用就失去了效能
         */
//        IBook2[] iBook2s = new IBook2[3];
//        iBook2s[0] = new NovelBook2("天龙八部", "金庸", 32d);
//        iBook2s[1] = new NovelBook2("巴黎圣母院", "雨果", 42d);
//        iBook2s[2] = new NovelBook2("悲惨世界", "雨果", 52d);
//
//        for(int i = 0; i < iBook2s.length; i++){
//            System.out.println(String.format("书名%s, 作者%s, 实际价格为%f", iBook2s[i].getName(), iBook2s[i].getAuthor(), iBook2s[i].getOffPrice()));
//        }

        /**
         * 3、案例3
         *      A. 案例详情:
         *          a. 书本有书名、作者和价格三个属性, 如今需求变更, 所有40元以上的书籍打九折出售, 然后需要获取每本书的实际价格
         *          b. 修改实现类: 直接修改NovelBook的getPrice方法
         *      B. 优点:
         *          a. 直接修改getPrice方法即可, 花销小, 策略生效全面, 不会出现还有故事书不生效打折策略的情况, 所以很多情况都是这样处理的
         *          b. 这样处理后果会出现, 只能获取折后价格, 丢失了本来的价格
         */
//        IBook[] iBooks = new IBook[3];
//        iBooks[0] = new NovelBook3("天龙八部", "金庸", 32d);
//        iBooks[1] = new NovelBook3("巴黎圣母院", "雨果", 42d);
//        iBooks[2] = new NovelBook3("悲惨世界", "雨果", 52d);
//
//        for(int i = 0; i < iBooks.length; i++){
//            System.out.println(String.format("书名%s, 作者%s, 实际价格为%f", iBooks[i].getName(), iBooks[i].getAuthor(), iBooks[i].getPrice()));
//        }

        /**
         * 4、案例4
         *      A. 案例详情:
         *          a. 书本有书名、作者和价格三个属性, 如今需求变更, 所有40元以上的书籍打九折出售, 然后需要获取每本书的实际价格
         *          b. 通过扩展实现变化, 增加一个子类OffNovelBook继承自NovelBook, 扩展getPrice方法
         *      B. 优点:
         *          a. 这样可以通过使用不同的实现类, 保证以前的逻辑不受影响的同时, 使得新的逻辑生效, 同时还实现了对故事书的精准控制, 更符合开闭原则
         *          b. 但是只是通过了新增子类的方式实现, 需要重新检查系统中到底哪些故事书需要生效, 哪些故事书不需要生效, 需要一定的时间开销
         */
        IBook[] iBooks = new IBook[3];
        iBooks[0] = new OffNovelBook("天龙八部", "金庸", 32d);
        iBooks[1] = new OffNovelBook("巴黎圣母院", "雨果", 42d);
        iBooks[2] = new OffNovelBook("悲惨世界", "雨果", 52d);

        for(int i = 0; i < iBooks.length; i++){
            System.out.println(String.format("书名%s, 作者%s, 实际价格为%f", iBooks[i].getName(), iBooks[i].getAuthor(), iBooks[i].getPrice()));
        }
    }

}
