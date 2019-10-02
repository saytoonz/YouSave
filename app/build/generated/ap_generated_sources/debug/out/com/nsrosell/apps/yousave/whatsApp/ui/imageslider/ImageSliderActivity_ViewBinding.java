// Generated code from Butter Knife. Do not modify!
package com.nsrosell.apps.yousave.whatsApp.ui.imageslider;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.nsrosell.apps.yousave.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ImageSliderActivity_ViewBinding implements Unbinder {
  private ImageSliderActivity target;

  @UiThread
  public ImageSliderActivity_ViewBinding(ImageSliderActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ImageSliderActivity_ViewBinding(ImageSliderActivity target, View source) {
    this.target = target;

    target.viewPager = Utils.findRequiredViewAsType(source, R.id.view_pager, "field 'viewPager'", ViewPager.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ImageSliderActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.viewPager = null;
    target.toolbar = null;
  }
}
