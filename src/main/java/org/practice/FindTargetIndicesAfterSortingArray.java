package org.practice;

import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-target-indices-after-sorting-array/description/
public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        String fileName = addTimestampToFileName("signature.svg");
        System.out.println(fileName);

    }


    public static String addTimestampToFileName(String fileName) {
        // Get the current timestamp
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = dateFormat.format(getCurrentTimeStamp());

        // Extract file extension (if any)
        int dotIndex = fileName.lastIndexOf('.');
        String baseName = (dotIndex == -1) ? fileName : fileName.substring(0, dotIndex);
        String extension = (dotIndex == -1) ? "" : fileName.substring(dotIndex);

        return baseName +
                "_" +
                timestamp +
                extension;
    }


    private static long getCurrentTimeStamp() {
        return OffsetDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
    }
}
