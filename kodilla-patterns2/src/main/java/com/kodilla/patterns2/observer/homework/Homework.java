package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class Homework implements HomeworkObservable {

    private final List<HomeworkObserver> observers = new ArrayList<>();
    private final List<String> messages = new ArrayList<>();
    private final String taskName;

    public Homework(String taskName) {
        this.taskName = taskName;
    }

    public void addHomework(String homework) {
        messages.add(homework);
        notifyMentor();
    }

    @Override
    public void registerMentor(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyMentor() {
        for (HomeworkObserver observer : observers) {
            observer.update(this);
        }
    }
}
