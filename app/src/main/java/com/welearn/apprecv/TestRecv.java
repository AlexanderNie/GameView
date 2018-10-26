package com.welearn.apprecv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by nie.zheng on 26/10/2018.
 */

public class TestRecv extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Receive some msg" , Toast.LENGTH_LONG);
    }
}
