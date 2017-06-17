package packtpub.com.rxjavaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private final Observable<String> timer;
    private final AtomicInteger lastValue = new AtomicInteger(0);
    private Disposable disposable;
    MainActivity() {
        timer = Observable.interval(1, TimeUnit.SECONDS)
                .map(i -> 1)
                .startWith(Observable.fromCallable(lastValue::get))
                .scan((current,next) -> current + next)
                .doOnNext(lastValue::set)
                .map(i -> Integer.toString(i))
                .observeOn(AndroidSchedulers.mainThread());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onPause() {
        super.onPause();
        disposable.dispose();
    }
    @Override
    protected void onResume() {
        super.onResume();
        TextView tv = (TextView) findViewById(R.id.timer_field);
        disposable = timer.subscribe(s -> tv.setText(s));
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (disposable != null)
            disposable.dispose();
    }
}
