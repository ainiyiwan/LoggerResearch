package com.orhanobut.logger;

/**
 * 已阅
 */
public interface LogStrategy {

  void log(int priority, String tag, String message);
}
