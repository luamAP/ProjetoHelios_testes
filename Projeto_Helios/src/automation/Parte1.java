package automation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;

public class Parte1 {
    public static void main(String[] args) {
    	Calendar c0 = Calendar.getInstance();
        Date data0 = c0.getTime();
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data0));
        
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = data.format(dataFormato);
        System.out.println(formattedDate);
    }
}
