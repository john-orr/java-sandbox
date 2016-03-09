package com.dev;

import java.util.Map;

/**
 * Created by john-orr on 09/03/16.
 */
public class Tour {

    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        double totalDistance = 0;
        double prevDistance = 0;
        for (String friend : arrFriends) {
            String town = getTown(ftwns, friend);
            if (town != null) {
                Double distance = h.get(town);
                if (distance != null) {
                    totalDistance += calcDist(prevDistance, distance);
                    prevDistance = distance;
                }
            }
        }
        totalDistance += prevDistance;
        return (int) Math.floor(totalDistance);
    }

    private static double calcDist(double distance1, double distance2) {
        return Math.sqrt(Math.pow(distance2, 2) - Math.pow(distance1, 2));
    }

    private static String getTown(String[][] townPairs, String friend) {
        for (String[] pair : townPairs) {
            if (friend.equals(pair[0]))
                return pair[1];
        }
        return null;
    }
}
