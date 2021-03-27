package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {
    void registerMentor(HomeworkObserver observer);
    void notifyMentor();

}
