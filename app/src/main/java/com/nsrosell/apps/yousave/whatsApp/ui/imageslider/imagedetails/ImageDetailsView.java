package com.nsrosell.apps.yousave.whatsApp.ui.imageslider.imagedetails;


import com.nsrosell.apps.yousave.whatsApp.ui.base.MvpView;

/**
 * Created by shaz on 14/2/17.
 */

public interface ImageDetailsView extends MvpView {
    void displayLoadingAnimation(boolean status);
    void displayImageSavedMsg();
    void displayDeleteSuccessMsg();
}
