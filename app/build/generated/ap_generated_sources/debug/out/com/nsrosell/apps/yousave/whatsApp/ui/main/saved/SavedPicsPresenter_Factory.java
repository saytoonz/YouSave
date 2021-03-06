// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.nsrosell.apps.yousave.whatsApp.ui.main.saved;

import com.nsrosell.apps.yousave.whatsApp.data.local.FileHelper;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

public final class SavedPicsPresenter_Factory implements Factory<SavedPicsPresenter> {
  private final MembersInjector<SavedPicsPresenter> savedPicsPresenterMembersInjector;

  private final Provider<FileHelper> fileHelperProvider;

  public SavedPicsPresenter_Factory(
      MembersInjector<SavedPicsPresenter> savedPicsPresenterMembersInjector,
      Provider<FileHelper> fileHelperProvider) {
    assert savedPicsPresenterMembersInjector != null;
    this.savedPicsPresenterMembersInjector = savedPicsPresenterMembersInjector;
    assert fileHelperProvider != null;
    this.fileHelperProvider = fileHelperProvider;
  }

  @Override
  public SavedPicsPresenter get() {
    return MembersInjectors.injectMembers(
        savedPicsPresenterMembersInjector, new SavedPicsPresenter(fileHelperProvider.get()));
  }

  public static Factory<SavedPicsPresenter> create(
      MembersInjector<SavedPicsPresenter> savedPicsPresenterMembersInjector,
      Provider<FileHelper> fileHelperProvider) {
    return new SavedPicsPresenter_Factory(savedPicsPresenterMembersInjector, fileHelperProvider);
  }
}
