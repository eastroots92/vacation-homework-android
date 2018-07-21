package com.openull.eastroots92.vacation_homework_android.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openull.eastroots92.vacation_homework_android.R;
import com.openull.eastroots92.vacation_homework_android.presenter.settingFragment.SettingPresenter;

import butterknife.ButterKnife;

public class SettingFragment extends Fragment {
  private SettingPresenter presenter;

  @Nullable
  @Override
  public View onCreateView(
    @NonNull LayoutInflater inflater,
    @Nullable ViewGroup container,
    @Nullable Bundle savedInstanceState
  ) {
    View view = inflater.inflate(R.layout.fragment_setting, container, false);
    loadDependencies(view);
    return view;
  }

  private void loadDependencies(View view) {
    presenter = new SettingPresenter(this);
    ButterKnife.bind(this, view);
  }

}
