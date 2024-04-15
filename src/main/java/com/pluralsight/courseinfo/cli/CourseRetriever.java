package com.pluralsight.courseinfo.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CourseRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(CourseRetriever.class);

    public static void main(String[] args) {
        System.out.println("CourseRetriever started!");
        if (args.length == 0) {
            System.out.println("Please, provide an author name as first argument.");
            return; // terminate the program here
        }

        try {
            retrieveCourses(args[0]);
        } catch (Exception e) {
            System.out.println("Unexpected error");
            e.printStackTrace();
        }
    }

    private static void retrieveCourses(String authorId) {
        System.out.println("Retrieving courses for author " + authorId);
    }
}
