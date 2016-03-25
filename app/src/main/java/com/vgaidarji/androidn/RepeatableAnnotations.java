package com.vgaidarji.androidn;

import android.util.Log;

/**
 * Created by vgaidarji on 3/18/16.
 */
public class RepeatableAnnotations {

    @Schedules ({
        @Schedule(dayOfMonth = "first"),
        @Schedule(dayOfWeek = "Monday"),
        @Schedule(dayOfWeek = "Saturday", hour = 22)
    })
    private class MeetingPriorToJava8 {
    }

    @Schedule(dayOfMonth = "first")
    @Schedule(dayOfWeek = "Monday")
    @Schedule(dayOfWeek = "Saturday", hour = 22)
    private class Meeting {
    }

    public void printDeclaredSchedules() {
        Schedule[] schedules = Meeting.class.getAnnotationsByType(Schedule.class);
        for(Schedule s : schedules) {
            Log.d("RepeatableAnnotations",
                    String.format("Meeting will take place on %s day of the month, %s, %d:00",
                            s.dayOfMonth(), s.dayOfWeek(), s.hour()));
        }
    }
}
