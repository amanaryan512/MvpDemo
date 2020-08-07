package com.example.mvpdemo;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mView;
    MainPresenter(MainContract.View view) {

        mView = view;
    }

    @Override
    public void buttonClick() {
        mView.newActivity();
    }
}
