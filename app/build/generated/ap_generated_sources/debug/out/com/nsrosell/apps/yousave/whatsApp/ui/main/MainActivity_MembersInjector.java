// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.nsrosell.apps.yousave.whatsApp.ui.main;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainPresenter> presenterProvider;

  public MainActivity_MembersInjector(Provider<MainPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<MainPresenter> presenterProvider) {
    return new MainActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static void injectPresenter(
      MainActivity instance, Provider<MainPresenter> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}
