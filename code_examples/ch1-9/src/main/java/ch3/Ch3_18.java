/* Compilable code examples can be found at https://github.com/thomasnield/packt_learning_rxjava */

package ch3;

import io.reactivex.Observable;

import java.util.Comparator;

public class Ch3_18 {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .sorted(Comparator.reverseOrder())
                .subscribe(System.out::println);
    }
}