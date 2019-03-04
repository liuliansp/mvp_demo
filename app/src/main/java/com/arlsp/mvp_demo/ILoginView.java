package com.arlsp.mvp_demo;

public interface ILoginView {
    void showProgress();
    void hideProgress();
    void setPasswordError();
    String getUsername();
    String getPassword();
    void loginSuccess();

}
