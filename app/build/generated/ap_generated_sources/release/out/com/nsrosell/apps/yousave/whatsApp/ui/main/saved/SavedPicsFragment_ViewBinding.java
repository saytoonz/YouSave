// Generated code from Butter Knife. Do not modify!
package com.nsrosell.apps.yousave.whatsApp.ui.main.saved;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.nsrosell.apps.yousave.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SavedPicsFragment_ViewBinding implements Unbinder {
  private SavedPicsFragment target;

  @UiThread
  public SavedPicsFragment_ViewBinding(SavedPicsFragment target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.images_recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progress_bar, "field 'progressBar'", ProgressBar.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    target.noMediaMsgTextView = Utils.findRequiredViewAsType(source, R.id.msg_no_media_text_view, "field 'noMediaMsgTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SavedPicsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.progressBar = null;
    target.swipeRefreshLayout = null;
    target.noMediaMsgTextView = null;
  }
}
