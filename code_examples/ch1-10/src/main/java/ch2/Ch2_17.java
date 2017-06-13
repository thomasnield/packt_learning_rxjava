package ch2;

import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

public class Ch2_17 {
    public static void main(String[] args) {

        Observable<String> source = 
Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

        Observable<GroupedObservable<Integer,String>> byLengths =
                source.groupBy(s -> s.length());
    }
}