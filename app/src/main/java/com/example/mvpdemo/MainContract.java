package com.example.mvpdemo;

public interface MainContract {
    interface View {
        void newActivity();
    }

    interface Presenter {
        void buttonClick();
    }
}
