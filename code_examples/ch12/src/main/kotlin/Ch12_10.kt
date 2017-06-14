import io.reactivex.Observable

fun main(args: Array<String>) {
    Observable.just("Alpha", "Beta", "Gama", "Delta", "Epsilon")
            .map { s: String -> s.length }
            .scan(0) { total, next -> total + next }
            .subscribe {
                println("Rolling sum of String lengths is $it")
            }
}