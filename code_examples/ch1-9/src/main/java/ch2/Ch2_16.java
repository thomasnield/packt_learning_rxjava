/* Compilable code examples can be found at https://github.com/thomasnield/packt_learning_rxjava */

package ch2;

import io.reactivex.Observable;

public class Ch2_16 {
    public static void main(String[] args) {
        Observable.range(5, 10)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}