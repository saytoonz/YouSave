package com.nsrosell.apps.yousave.whatsApp.ui.main;


import com.nsrosell.apps.yousave.whatsApp.ui.base.MvpView;

public interface MainView extends MvpView {
    void displayWelcomeMessage(String msg);
    void displayLoadingAnimation(boolean status);
    void displayRecentAndSavedPics();
}
