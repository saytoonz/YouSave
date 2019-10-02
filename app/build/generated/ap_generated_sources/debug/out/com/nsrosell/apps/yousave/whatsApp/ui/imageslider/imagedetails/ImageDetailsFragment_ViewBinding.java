// Generated code from Butter Knife. Do not modify!
package com.nsrosell.apps.yousave.whatsApp.ui.imageslider.imagedetails;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.nsrosell.apps.yousave.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ImageDetailsFragment_ViewBinding implements Unbinder {
  private ImageDetailsFragment target;

  @UiThread
  public ImageDetailsFragment_ViewBinding(ImageDetailsFragment target, View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.image_view, "field 'imageView'", ImageView.class);
    target.playImageView = Utils.findRequiredViewAsType(source, R.id.play_image_view, "field 'playImageView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ImageDetailsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.playImageView = null;
  }
}
