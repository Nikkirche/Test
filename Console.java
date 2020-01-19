package com.company;

public class Console {
    Runner runner = new Runner();
    Data data = new Data();
    String checkCommand() {
        switch (runner.command) {
            case ("help"):
                System.out.println("help");
                System.out.println("exit");
                System.out.println("ls <path>");
                System.out.println("cat <path>");
                System.out.println("generate <filename>");
                System.out.println("log");
                data.addData(runner.command);
            case ("log"):Runner runner
                data.printData();
                data.addData(runner.command);
            case ("exit"):
                Thread.interrupted();
                return ("Console finished");
            default:
                System.out.println("Wrong Command");
                data.addData(runner.command);
        }
        return("You will never see That");
    }

}

