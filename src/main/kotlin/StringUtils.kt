import java.math.BigDecimal
import java.math.RoundingMode
import java.text.NumberFormat
import java.util.*

open class StringUtils {

    companion object {
        fun toCurrency(float: Float, locale: Locale?): String = toCurrency(float.toDouble(), locale)

        fun toCurrency(bigDecimal: BigDecimal, locale: Locale?): String =
            toCurrency(bigDecimal.setScale(2, RoundingMode.HALF_UP).toDouble(), locale)

        fun toCurrency(double: Double, locale: Locale? = Locale("pt", "BR")): String {
            val currencyInstance = NumberFormat.getCurrencyInstance(locale)
            currencyInstance.roundingMode = RoundingMode.HALF_UP
            currencyInstance.minimumFractionDigits = 2
            currencyInstance.maximumFractionDigits = 2
            return currencyInstance.format(double).toString()
        }

    }
}