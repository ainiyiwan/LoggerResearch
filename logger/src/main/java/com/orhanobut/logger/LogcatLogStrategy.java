package com.orhanobut.logger;

import android.util.Log;

/**
 * 已阅
 */
public class LogcatLogStrategy implements LogStrategy {

  @Override public void log(int priority, String tag, String message) {
    Log.println(priority, tag, message);
  }

}