package com.travijuu.numberpicker.library.Listener;

import android.util.Log;

import com.travijuu.numberpicker.library.Interface.LimitExceededListener;

/**
 * Created by travijuu on 26/05/16.
 */
public class DefaultLimitExceededListener implements LimitExceededListener {

    public void limitExceeded(int limit, int exceededValue) {

        String message = String.format("Value cannot be setted to %d because the limit is %d.", limit, exceededValue);
        Log.v(this.getClass().getSimpleName(), message);
    }
}
