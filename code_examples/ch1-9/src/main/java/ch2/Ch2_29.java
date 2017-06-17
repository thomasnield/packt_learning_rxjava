/* Compilable code examples can be found at https://github.com/thomasnield/packt_learning_rxjava */

package ch2;

import io.reactivex.Observable;

public class Ch2_29 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        source.first("Nil") //returns a Single
                .subscribe(System.out::println);
    }
}