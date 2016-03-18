package com.vgaidarji.androidn;

import java.lang.annotation.Repeatable;

@Repeatable(Schedules.class)
public @interface Schedule {
  String dayOfMonth() default "first";
  String dayOfWeek() default "Monday";
  int hour() default 12;
}