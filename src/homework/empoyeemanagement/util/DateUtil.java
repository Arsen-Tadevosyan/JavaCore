package homework.empoyeemanagement.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");

    public static Date StringToDate(String dateStr) throws ParseException {
        return SDF.parse(dateStr);
    }

    public static String dateToString(Date date) {
        return SDF.format(date);
    }

}
