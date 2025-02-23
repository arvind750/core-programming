import java.time.ZonedDateTime;
import java.time.ZoneId;

class DisplayTimeZone {
    public static void main(String[] args) {
        // Get the current time in UTC
        ZonedDateTime currentUTC = ZonedDateTime.now(ZoneId.of("UTC"));

        // convert to different timezone
        ZonedDateTime gmtTime = currentUTC.withZoneSameInstant(ZoneId.of("GMT"));
        ZonedDateTime istTime = currentUTC.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = currentUTC.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        // display the time in different zones
        System.out.println("Current Time in GMT: " + gmtTime);
        System.out.println("Current Time in IST: " + istTime);
        System.out.println("Current Time in PST: " + pstTime);
    }
}