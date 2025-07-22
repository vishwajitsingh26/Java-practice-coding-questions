package org.practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;

public class DateRangeMap {

    // Method to create a map with formatted date as key and from/to timestamps as values
    public static Map<String, Map<String, Long>> getDateRangeMap(long fromTimestamp, long toTimestamp) {
        Map<String, Map<String, Long>> dateRangeMap = new HashMap<>();

        // Convert the input long timestamps to Date objects
        Date fromDate = new Date(fromTimestamp);
        Date toDate = new Date(toTimestamp);

        // Set up Calendar instances to manipulate the start and end of the dates
        Calendar fromCalendar = Calendar.getInstance();
        fromCalendar.setTime(fromDate);
        fromCalendar.set(Calendar.HOUR_OF_DAY, 0);   // Set to start of the day
        fromCalendar.set(Calendar.MINUTE, 0);
        fromCalendar.set(Calendar.SECOND, 0);
        fromCalendar.set(Calendar.MILLISECOND, 0);
        long startOfFromDay = fromCalendar.getTimeInMillis(); // Start of the `from` day

        Calendar toCalendar = Calendar.getInstance();
        toCalendar.setTime(toDate);
        toCalendar.set(Calendar.HOUR_OF_DAY, 23);  // Set to end of the day (23:59:59)
        toCalendar.set(Calendar.MINUTE, 59);
        toCalendar.set(Calendar.SECOND, 59);
        toCalendar.set(Calendar.MILLISECOND, 999);
        long endOfToDay = toCalendar.getTimeInMillis(); // End of the `to` day

        // SimpleDateFormat to format date as "dd MMM yyyy"
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");

        // Iterate through the date range and populate the map
        long currentTime = startOfFromDay;
        while (currentTime <= endOfToDay) {
            // Format the current date
            String formattedDate = dateFormat.format(new Date(currentTime));

            // Create the map for each date
            Map<String, Long> timestampMap = new HashMap<>();
            timestampMap.put("from", currentTime);

            // If we are on the last date (toDate), use the toTimestamp as "to"
            if (currentTime == endOfToDay) {
                timestampMap.put("to", endOfToDay);
            } else {
                timestampMap.put("to", currentTime + 86400000L - 1); // End of day timestamp
            }

            // Put the formatted date and its timestamps in the result map
            dateRangeMap.put(formattedDate, timestampMap);

            // Increment the current time by 1 day (24 hours in milliseconds)
            currentTime += 86400000L;
        }

        return dateRangeMap;
    }

    public static void main(String[] args) {
        // Example usage: input long timestamps (milliseconds)
        long fromTimestamp = 1732012610000L; // Example "from" timestamp
        long toTimestamp = 1732040999999L;   // Example "to" timestamp

        // Get the date range map
        Map<String, Map<String, Long>> result = getDateRangeMap(fromTimestamp, toTimestamp);

        // Print the result
        System.out.println(result);
    }
}

