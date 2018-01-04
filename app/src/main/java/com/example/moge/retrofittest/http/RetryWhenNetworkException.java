package com.example.moge.retrofittest.http;

import android.accounts.NetworkErrorException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

/**
 * Created by moge on 2018/1/4.
 */

public class RetryWhenNetworkException implements Function<Observable<? extends Throwable>, Observable<?>> {

    private int mRetryCount;


    @Override
    public Observable<?> apply(Observable<? extends Throwable> observable) throws Exception {
        return observable.flatMap(new Function<Throwable, Observable<?>>() {
            @Override
            public Observable<?> apply(@NonNull Throwable throwable) throws Exception {
                if ((throwable instanceof NetworkErrorException
                        || throwable instanceof ConnectException
                        || throwable instanceof SocketTimeoutException
                        || throwable instanceof TimeoutException) && mRetryCount < 3) {
                    mRetryCount++;
                    return Observable.timer(2000, TimeUnit.MILLISECONDS);
                }
                return Observable.error(throwable);
            }
        });
    }
}
