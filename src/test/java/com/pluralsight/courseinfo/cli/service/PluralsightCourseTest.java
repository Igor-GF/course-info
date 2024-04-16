package com.pluralsight.courseinfo.cli.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PluralsightCourseTest {

    @Test
    void durationInMinutes() {
        PluralsightCourse course =
                new PluralsightCourse("id", "Test course", "00:05:37", "url", false);
        assertEquals(5, course.durationInMinutes());
    }

    @Test
    void durationInMinutesOverHour() {
        PluralsightCourse course =
                new PluralsightCourse("id", "Test course", "01:09:26.2616670", "url", false);
        assertEquals(69, course.durationInMinutes());
    }

    @Test
    void durationInMinutesZero() {
        PluralsightCourse course =
                new PluralsightCourse("id", "Test course", "00:00:00", "url", false);
        assertEquals(0, course.durationInMinutes());
    }
}