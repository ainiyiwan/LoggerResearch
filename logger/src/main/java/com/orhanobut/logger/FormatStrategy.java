package com.orhanobut.logger;

/**
 * 已阅
 */
public interface FormatStrategy {

  void log(int priority, String tag, String message);
}
