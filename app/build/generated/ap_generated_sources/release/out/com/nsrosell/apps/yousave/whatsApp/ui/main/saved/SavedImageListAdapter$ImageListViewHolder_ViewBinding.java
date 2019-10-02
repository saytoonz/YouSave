// Generated code from Butter Knife. Do not modify!
package com.nsrosell.apps.yousave.whatsApp.ui.main.saved;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.nsrosell.apps.yousave.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SavedImageListAdapter$ImageListViewHolder_ViewBinding implements Unbinder {
  private SavedImageListAdapter.ImageListViewHolder target;

  @UiThread
  public SavedImageListAdapter$ImageListViewHolder_ViewBinding(SavedImageListAdapter.ImageListViewHolder target,
      View source) {
    this.target = target;

    target.thumbnailImageView = Utils.findRequiredViewAsType(source, R.id.image_thumbnail, "field 'thumbnailImageView'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progress_bar, "field 'progressBar'", ProgressBar.class);
    target.playImageView = Utils.findRequiredViewAsType(source, R.id.play_image_view, "field 'playImageView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SavedImageListAdapter.ImageListViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.thumbnailImageView = null;
    target.progressBar = null;
    target.playImageView = null;
  }
}
