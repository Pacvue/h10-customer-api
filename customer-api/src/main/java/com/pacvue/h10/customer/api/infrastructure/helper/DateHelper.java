package com.pacvue.h10.customer.api.infrastructure.helper;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DateHelper {

    public static Instant getTimeByMonthInterval(int intervalMonth, Instant unixTime) {
        return unixTime.minus(intervalMonth, ChronoUnit.MONTHS);
    }
}
