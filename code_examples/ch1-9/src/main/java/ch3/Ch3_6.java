/* Compilable code examples can be found at https://github.com/thomasnield/packt_learning_rxjava */

package ch3;

import io.reactivex.Observable;

public class Ch3_6 {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .skipWhile(i -> i <= 95)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}