package com.nsrosell.apps.yousave.whatsApp.ui.main.saved;


import com.nsrosell.apps.yousave.whatsApp.data.model.ImageModel;
import com.nsrosell.apps.yousave.whatsApp.ui.base.MvpView;

import java.util.List;

public interface SavedPicsView extends MvpView {
    void displayLoadingAnimation(boolean status);
    void displaySavedImages(List<ImageModel> images);
    void displayNoImagesInfo();
    void displayImage(int position, ImageModel imageModel);
    void displayDeleteSuccessMsg();
    void displayDeleteConfirm(List<ImageModel> imageModels);
}
