import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {
    val startDate = LocalDate.of(2017, 5, 1)
    val endDate = LocalDate.of(2017, 5, 11)
    val daysBetween = startDate.numberOfDaysTo(endDate)
    println(daysBetween)
}
