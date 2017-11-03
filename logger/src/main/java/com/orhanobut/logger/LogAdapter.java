package com.orhanobut.logger;

/**
 * 已阅
 */
public interface LogAdapter {

  boolean isLoggable(int priority, String tag);

  void log(int priority, String tag, String message);
}