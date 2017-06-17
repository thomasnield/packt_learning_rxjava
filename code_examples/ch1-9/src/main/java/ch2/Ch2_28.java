/* Compilable code examples can be found at https://github.com/thomasnield/packt_learning_rxjava */

package ch2;

import io.reactivex.Single;

public class Ch2_28 {
    public static void main(String[] args) {
        Single.just("Hello")
                .map(String::length)
                .subscribe(System.out::println,
                        Throwable::printStackTrace);
    }
}