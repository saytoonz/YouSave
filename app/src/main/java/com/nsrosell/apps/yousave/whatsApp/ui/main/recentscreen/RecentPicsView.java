package com.nsrosell.apps.yousave.whatsApp.ui.main.recentscreen;


import com.nsrosell.apps.yousave.whatsApp.data.model.ImageModel;
import com.nsrosell.apps.yousave.whatsApp.ui.base.MvpView;

import java.util.List;

/**
 * Created by shaz on 6/3/17.
 */

public interface RecentPicsView extends MvpView {
    void displayLoadingAnimation(boolean status);
    void displayRecentImages(List<ImageModel> images);
    void displayNoImagesInfo();
    void displayImageSavedMsg();
    void displayImage(int position, ImageModel imageModel);
    void displayDeleteSuccessMsg();
    void displayDeleteConfirmPrompt(ImageModel imageModel, int itemPosition);
}
