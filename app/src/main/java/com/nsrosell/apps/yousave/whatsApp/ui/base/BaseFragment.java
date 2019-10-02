package com.nsrosell.apps.yousave.whatsApp.ui.base;

import android.support.v4.app.Fragment;

import com.nsrosell.apps.yousave.TheApplication;


public class BaseFragment extends Fragment {

    public TheApplication getTheApplication() {
        return ((TheApplication) getActivity().getApplication());
    }

}