package com.nsrosell.apps.yousave.whatsApp.ui.imageslider;
import com.nsrosell.apps.yousave.whatsApp.data.model.ImageModel;
import com.nsrosell.apps.yousave.whatsApp.ui.base.MvpView;

import java.util.List;


public interface ImageSliderView extends MvpView {
    void displayLoadingAnimation(boolean status);
    void displayImageSlider(List<ImageModel> mediaItems, int imageToDisplayPosition);
}
