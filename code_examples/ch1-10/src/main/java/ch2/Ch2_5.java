package ch2;

import io.reactivex.Observable;

public class Ch2_5 {
      public static void main(String[] args) {

        Observable<String> source =
          Observable.just("Alpha", "Beta", "Gamma", "Delta", 
"Epsilon");

        source.flatMap(s -> Observable.fromArray(s.split("")))
          .subscribe(System.out::println);
      }
}