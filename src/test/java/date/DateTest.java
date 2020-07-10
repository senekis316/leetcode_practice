package date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.junit.Test;

public class DateTest {

    @Test
    public void timeStampTest() {

        Date date = new Date();
        Instant instant = date.toInstant();
        assertEquals(date.getTime(), instant.toEpochMilli());

        ZoneId shZoneId = ZoneId.of("Asia/Shanghai");
        ZoneId cgZoneId = ZoneId.of("America/Chicago");

        LocalDateTime shLocalDateTime =  LocalDateTime.ofInstant(instant, shZoneId);
        LocalDateTime cgLocalDateTime = LocalDateTime.ofInstant(instant, cgZoneId);
        assertEquals(shLocalDateTime.getSecond(), cgLocalDateTime.getSecond());
        assertEquals(Math.abs(shLocalDateTime.getHour() - cgLocalDateTime.getHour()), 13);

        ZonedDateTime shZonedDateTime = ZonedDateTime.of(shLocalDateTime, shZoneId);
        ZonedDateTime cgZonedDateTime = ZonedDateTime.of(cgLocalDateTime, cgZoneId);
        assertEquals(shLocalDateTime.getSecond(), cgZonedDateTime.getSecond());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String shDateTimeStr = dateTimeFormatter.format(shZonedDateTime);
        String cgDateTimeStr = dateTimeFormatter.format(cgZonedDateTime);
        assertFalse(shDateTimeStr.equals(cgDateTimeStr));

    }

}
