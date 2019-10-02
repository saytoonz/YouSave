// Generated code from Butter Knife. Do not modify!
package com.nsrosell.apps.yousave.whatsApp.ui.main.recentscreen;

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

public class RecentImageListAdapter$ImageListViewHolder_ViewBinding implements Unbinder {
  private RecentImageListAdapter.ImageListViewHolder target;

  @UiThread
  public RecentImageListAdapter$ImageListViewHolder_ViewBinding(RecentImageListAdapter.ImageListViewHolder target,
      View source) {
    this.target = target;

    target.thumbnailImageView = Utils.findRequiredViewAsType(source, R.id.image_thumbnail, "field 'thumbnailImageView'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progress_bar, "field 'progressBar'", ProgressBar.class);
    target.saveImageView = Utils.findRequiredViewAsType(source, R.id.save_image_view, "field 'saveImageView'", ImageView.class);
    target.deleteImageView = Utils.findRequiredViewAsType(source, R.id.delete_image_view, "field 'deleteImageView'", ImageView.class);
    target.progressBarForSave = Utils.findRequiredViewAsType(source, R.id.progress_bar_for_save, "field 'progressBarForSave'", ProgressBar.class);
    target.playImageView = Utils.findRequiredViewAsType(source, R.id.play_image_view, "field 'playImageView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RecentImageListAdapter.ImageListViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.thumbnailImageView = null;
    target.progressBar = null;
    target.saveImageView = null;
    target.deleteImageView = null;
    target.progressBarForSave = null;
    target.playImageView = null;
  }
}
