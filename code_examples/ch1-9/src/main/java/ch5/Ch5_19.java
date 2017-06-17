/* Compilable code examples can be found at https://github.com/thomasnield/packt_learning_rxjava */

package ch5;

import io.reactivex.Observable;

public class Ch5_19 {
    public static void main(String[] args) {
        Observable<Integer> cachedRollingTotals =
                Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                        .scan(0, (total, next) -> total + next)
                        .cache();
        cachedRollingTotals.subscribe(System.out::println);
    }
}