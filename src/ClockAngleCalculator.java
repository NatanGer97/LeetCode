import java.util.*;

public class ClockAngleCalculator {

    public static double solve(int hour, int minutes)
    {
        if (hour == 12) hour = 0;
        if (minutes == 60)
        {
            hour++;  minutes = 0;
            hour = hour > 12 ? hour -= 12 : hour;
        }
        double results = calcAngles(hour, minutes);

        return results;

    }

    private static double calcAngles(int hours, int minutes)
    {
        double anglePerMinute = 360 / 60.0;
        double anglePerHour = 360 / 12;
        double anglePerHourAsMinutes = 360 / (60 * 12.0);

        // find angle in relation to minutes hand
        double minutesAngle =  minutes * anglePerMinute;
        double hoursAngle = (hours * anglePerHour) + (minutes * anglePerHourAsMinutes);

        double angle = Math.abs(minutesAngle - hoursAngle);

        return angle;

    }

    public static void main(String[] args) {
        System.out.println(solve(5,40));
    }
}


