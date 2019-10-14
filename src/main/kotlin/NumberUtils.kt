import java.math.BigDecimal
import java.math.RoundingMode
import java.util.logging.Logger

class NumberUtils {
    companion object {

        /**
         * Convert to BigDecimal and dont throws Exception, just return a ZERO when exception was throws
         */
        fun toBigDecimal(text: String, scale: Int = 2, roundingMode: RoundingMode? = RoundingMode.HALF_DOWN): BigDecimal =
            try {
                text.toBigDecimal().setScale(scale, roundingMode)
            } catch (e: Exception) {
                Logger.getGlobal().severe(e.message)
                BigDecimal.ZERO
            }

    }
}