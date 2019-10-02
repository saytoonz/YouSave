package com.nsrosell.apps.yousave.whatsApp.injection.component;


import com.nsrosell.apps.yousave.whatsApp.data.local.FileHelper;
import com.nsrosell.apps.yousave.whatsApp.injection.module.AppModule;
import com.nsrosell.apps.yousave.whatsApp.ui.imageslider.ImageSliderActivity;
import com.nsrosell.apps.yousave.whatsApp.ui.imageslider.imagedetails.ImageDetailsFragment;
import com.nsrosell.apps.yousave.whatsApp.ui.main.MainActivity;
import com.nsrosell.apps.yousave.whatsApp.ui.main.recentscreen.RecentPicsFragment;
import com.nsrosell.apps.yousave.whatsApp.ui.main.saved.SavedPicsFragment;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
    void inject(RecentPicsFragment fragment);
    void inject(SavedPicsFragment fragment);
    void inject(ImageSliderActivity activity);
    void inject(ImageDetailsFragment fragment);
    FileHelper fileHelper();
}
