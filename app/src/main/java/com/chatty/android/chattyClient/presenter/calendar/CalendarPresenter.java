package com.chatty.android.chattyClient.presenter.calendar;

import com.chatty.android.chattyClient.externalModules.StateManager.StateManager;
import com.chatty.android.chattyClient.model.State;
import com.chatty.android.chattyClient.module.StateManagerWrapper;
import com.chatty.android.chattyClient.view.calendar.CalendarActivity;

import java.util.HashMap;

public class CalendarPresenter {
  private CalendarActivity view;

  public CalendarPresenter(CalendarActivity view) {
    this.view = view;
  }

  public void construct() {
    StateManagerWrapper.subscribe(this::stateListener);
    view.render();
  }

  private Object stateListener(State state) {
//    StateManager.printMap(state);
    return null;
  }
}
