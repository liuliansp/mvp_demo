package com.arlsp.mvp_demo;

import android.os.Handler;

public class LoginPresenter {
    private ILoginView loginView;
    private UserModel mUser;
    public LoginPresenter(ILoginView loginView){
        this.loginView=loginView;
        initUser();
    }

    private void initUser() {
        mUser=new UserModel(loginView.getUsername(),loginView.getPassword());
    }
    public void login(String username,String password){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loginView.showProgress();
                int code=mUser.checkUserValidity(loginView.getUsername(),loginView.getPassword());
                if (code==-1){
                    loginView.setPasswordError();
                }else if(code==0){

                }
            }
        },2000);
    }
}
