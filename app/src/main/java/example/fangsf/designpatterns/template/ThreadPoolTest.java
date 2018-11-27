package example.fangsf.designpatterns.template;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by apple on 2018/11/18
 * Useful: 线程池
 */
public class ThreadPoolTest {

    static ThreadPoolExecutor threadPoolExecutor;

    private static final BlockingQueue<Runnable> sPoolWorkQueue =
            new LinkedBlockingDeque<>(4);   //线程队列

    // LinkedBlockingDeque ->  with the given (fixed) capacity



    //BlockingQueue 是一个先进先出的队列
    // SynchronousQueue 线程安全的队列, 里面没有固定的缓存
    // PriorityBlockingQueue 无序的可以根据优先级进行排序,指定的对象需要实现comparable


    /**
     * 假如: PriorityBlockingQueue -> 需要加入缓存队列的runnable有20个,指定的缓存队列有4个, 核心数为4,最大线程数为10: 会报错
     * 线程队列是4个, 有20个runnable对象需要加入线程队列, 那么存在还有16个无法存放, 这个时候
     * 线程最大数是10个, 非核心线程是6个, 那么就还会再创建6个非核心线程, 那么4+6 = 10 , 就会有10个线程
     * 但是那样还是存在10个runnable无法执行, 所以会抛出异常
     */

    static {

        //Excetors线程封装好的工具类
//        Executors.newCachedThreadPool()

        threadPoolExecutor = new ThreadPoolExecutor(
                4,  //线程池核心数大小
                10,  // 最大线程数
                60, //线程的存活时间
                TimeUnit.SECONDS,  //线程存活时间的单位
                sPoolWorkQueue,
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        Thread thread = new Thread(r);
                        thread.setDaemon(false); // 设置不是守护线程
                        return thread;
                    }
                });


    }

    public static void main(String[] args) {


        // 这样做的方式, 太消耗性能, 建议采用线程池的方式
//        for (int i = 0; i < 30; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    // 假设这里是有多少图片,就开启线程去下载图片
//                    System.out.println("下载图片");
//                }
//            }).start();
//        }


        for (int i = 0; i < 20; i++) {

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("下载图片 " + Thread.currentThread().getName());
                }
            };


            threadPoolExecutor.execute(runnable);

        }


    }


}
