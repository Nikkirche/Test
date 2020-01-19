package com.company;

import java.util.Scanner;

/**
 * Created by student5 on 19.01.20.
 */
public class Runner extends Thread {
    Scanner in = new Scanner(System.in);
    int RunnerTime=0;
    String command;
    Console console = new Console();

    public void run() {
        String command = in.next();
        System.out.println("Runner started");
        while (true) {
            try {
                console.checkCommand();
                Thread.sleep(200);
                command = in.next();
                RunnerTime++;
            } catch (InterruptedException e) {
                System.out.println("You will never see it");
            }
        }
    }

}