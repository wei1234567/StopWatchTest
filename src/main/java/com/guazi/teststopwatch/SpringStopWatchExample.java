package com.guazi.teststopwatch;


import org.springframework.util.StopWatch;


public class SpringStopWatchExample {

    /**
     * 统计输出总耗时
     *
     * @throws InterruptedException
     */
    private static void test1() throws InterruptedException {
        StopWatch sw = new StopWatch();
        sw.start();
        //long task simulation
        Thread.sleep(1000);
        sw.stop();
        System.out.println(sw.getTotalTimeMillis());
    }

    /**
     * 以优雅的格式打出所有任务的耗时以及占比
     *
     * @throws InterruptedException
     */
    private static void test2() throws InterruptedException {
        StopWatch sw = new StopWatch();

        sw.start("起床");
        Thread.sleep(1000);
        sw.stop();

        sw.start("洗漱");
        Thread.sleep(2000);
        sw.stop();

        sw.start("锁门");
        Thread.sleep(500);
        sw.stop();

        System.out.println(sw.prettyPrint());
        System.out.println(sw.getTotalTimeMillis());
        System.out.println(sw.getLastTaskName());
        System.out.println(sw.getLastTaskInfo());
        System.out.println(sw.getTaskCount());
    }

    public static void main(String[] args) throws InterruptedException {
        test1();
        test2();
    }
}
