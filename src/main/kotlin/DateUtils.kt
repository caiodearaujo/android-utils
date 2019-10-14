import java.text.SimpleDateFormat
import java.util.*

class DateUtils {
    companion object {
        fun toString(date: Date, pattern: String = "dd/MM/yyyy", locale: Locale = Locale("pt", "BR"))
                : String = SimpleDateFormat(pattern, locale).format(date)

        fun toDate(date: String, pattern: String = "dd/MM/yyyy", locale: Locale = Locale("pt", "BR"))
                : Date = SimpleDateFormat(pattern, locale).parse(date)
    }
}