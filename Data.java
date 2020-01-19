package com.company;

import javax.management.StringValueExp;

/**
 * Created by student5 on 19.01.20.
 */
public class Data {
    StringBuilder stringBuilder = new StringBuilder();
    void addData(String command){
        stringBuilder.append(command);
    }
    void printData(){
        System.out.println(stringBuilder);
    }

}
