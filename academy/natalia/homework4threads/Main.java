package com.academy.natalia.homework4threads;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

    public class Main {


        public static void main(String[] args) throws InterruptedException {
            ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
            arrayDeque.add(1);
            arrayDeque.add(2);
            arrayDeque.add(3);
            arrayDeque.add(4);
            arrayDeque.add(5);

            Worker worker = new Worker(arrayDeque);
            worker.main();
        }
    }

    class Worker{
        private ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        public Worker(ArrayDeque<Integer> arrayDeque) {
            this.arrayDeque = arrayDeque;
        }

        public synchronized void getArrayDeque(Thread thread1) {

            for (int i = 0; arrayDeque.size()!=0; i++) {
                System.out.println(arrayDeque.poll());
            }
        }

        public void main() throws InterruptedException {
            Thread thread1 = new Thread(new Thread() {

                @Override
                public void run() {
                    System.out.println("Operator 1 started the call ");
                    getArrayDeque(this);
                    System.out.println("Operator 1 ended the call ");
                }
            });

            Thread thread2 = new Thread(new Thread() {
                @Override
                public void run() {
                    System.out.println("Operator 2 started the call ");
                    getArrayDeque(this);
                    System.out.println("Operator 2 ended the call ");
                }
            });

            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();

            System.out.println(arrayDeque);
        }
    }

