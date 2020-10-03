package com.val.riazanski;

import java.util.ArrayList;

class Model implements Observable {
    //fields
    private final ArrayList<Observer> observers; // список слушателей
    private String op = "-"; // операция
    private String num1 = "1"; // первое число
    private String num2 = "2"; // второе число
    private String result = "1-2"; // результат

    // constructors
    Model() {
        observers = new ArrayList<>();
    }

    // регистрация слушателя
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // уведомление слушателей
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.notification(message);
        }
    }

    //set operation
    void setOp(String s) {
        op = s;
        notifyObservers("op");
    }

    //set number 1
    void setNum1(String s) {
        num1 = s;
    }

    //set number 2
    void setNum2(String s) {
        num2 = s;
    }

    //calculate result
    void go() {
        result = num1 + op + num2;
        notifyObservers("go");
    }

    //get result
    String getResult() {
        return result;
    }

    String getOp() {
        return op;
    }
}

