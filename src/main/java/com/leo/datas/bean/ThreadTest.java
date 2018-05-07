/*
package com.leo.datas.bean;

import com.leo.datas.Utils.Jason2Sql;
import com.leo.datas.Utils.TestApi;
import com.leo.datas.dao.PersonDao;
import com.leo.datas.domain.Person;
import com.leo.datas.service.PersonService;
import com.leo.datas.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CountDownLatch;

@Component
public class ThreadTest {

    @Autowired
    private PersonDao personDao;


    public synchronized void handleList(List<?> data, int threadNum) throws InterruptedException {
        int length = data.size();
        int tl = length % threadNum == 0 ? length / threadNum : (length / threadNum + 1);
        // 多少协作
        CountDownLatch latch = new CountDownLatch(100);
        long a = System.currentTimeMillis();
        for (int i = 0; i < threadNum; i++) {
            int end = (i + 1) * tl;
            if ((i * tl) <= length) {

                RunnableThread thread = new RunnableThread("线程[" + (i + 1) + "] ", data, i * tl, end > length ? length : end, latch);
                Thread runable = new Thread(thread);
                runable.start();
            }
        }
        latch.await();// 等待所有工人完成工作
        System.out.println("结束*****************************");
        long b = System.currentTimeMillis();
        System.out.println("时间:" + (b - a) + "毫秒***********************");
    }


    // 继承Thread
    class HandleThread extends Thread {
        private String threadName;
        private List<?> data;
        private int start;
        private int end;
        private CountDownLatch latch;

        public HandleThread(String threadName, List<String> data, int start, int end, CountDownLatch latch) {
            this.threadName = threadName;
            this.data = data;
            this.start = start;
            this.end = end;
            this.latch = latch;
        }

        @Override
        public void run() {
            // TODO 这里处理数据
            List<?> l = data.subList(start, end);
            System.out.println(threadName + "--" + data.size() + "--" + start + "--" + end + "--");
            for (int i = 0; i < l.size(); i++) {
                // 单个线程中的数据
                System.out.println(l.get(i));
            }
            latch.countDown();// 工人完成工作，计数器减一
        }
    }

    // 实现Runnable
    class RunnableThread implements Runnable {
        private String threadName;
        private List<?> data;
        private int start;
        private int end;
        private CountDownLatch latch;

        public RunnableThread(String threadName, List<?> data, int start, int end, CountDownLatch latch) {
            this.threadName = threadName;
            this.data = data;
            this.start = start;
            this.end = end;
            this.latch = latch;
        }

        @Override
        public void run() {
            // TODO 这里处理数据
            List<GonganRquestPara> l = (List<GonganRquestPara>) data.subList(start, end);
            System.out.println(threadName + "--" + data.size() + "--" + start + "--" + end + "--");
            System.out.println(l.size());
            //l.stream().map(p->p.toString()).forEach(System.out::println);
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).isDone() == false) {
                    String getData = "";

                    try {
                        getData = new TestApi().doPostGetCount(l.get(i));
                        int total = Jason2Sql.getTotal(getData);
                        String pageSize = l.get(i).getPageSize();
                        for (int j = 1; j < (total / Integer.parseInt(pageSize)) + 1; j++) {
                            l.get(i).setPageN(String.valueOf(j));
                            String content = new TestApi().doPostGetCount(l.get(i));
                            List<Person> people = Jason2Sql.buildInsertSqlFromJSON(content);
                            people.stream().map(p->p.toString()).forEach(System.out::println);
                            try {
                                personDao.toString();
                                personDao.saveAll(people);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        */
/*    for (int k = 0;k<people.size();k++){

                                personService.save(people.get(k));

                            }
*//*


                        }


                    } catch (Exception e) {
                        getData = new TestApi().doPostGetCount(l.get(i));
                        int total = Jason2Sql.getTotal(getData);
                        String pageSize = l.get(i).getPageSize();
                        for (int j = 1; j < (total / Integer.parseInt(pageSize)) + 1; j++) {
                            l.get(i).setPageN(String.valueOf(j));
                            String content = new TestApi().doPostGetCount(l.get(i));
                            List<Person> people = Jason2Sql.buildInsertSqlFromJSON(content);

                            personDao.toString();
                            personDao.saveAll(people);
                        }
                    } finally {
                        l.get(i).setDone(true);


                        System.out.println((l.get(i)).toString());

                    }
                }
            }

            latch.countDown();// 工人完成工作，计数器减一
        }
    }

   */
/* public static void main(String[] args) throws InterruptedException {
        ThreadTest test = new ThreadTest();

        // 准备数据
        LinkedList<String> data = new LinkedList<String>();
        for (int i = 0; i < 100; i++) {
            data.add("item" + "  " + i);
        }
        test.handleList(data, 100);
        // System.out.println(ArrayUtils.toString(data));

    }*//*

}*/
