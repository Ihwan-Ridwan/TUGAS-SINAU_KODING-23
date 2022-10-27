import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BukuInterface {
    public static Date stringToDate(String date) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String dateToString(Date date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.format(date);
        } catch (Exception e) {
            return null;
        }
    }
}