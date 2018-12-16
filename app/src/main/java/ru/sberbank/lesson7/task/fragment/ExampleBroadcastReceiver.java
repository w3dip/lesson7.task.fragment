package ru.sberbank.lesson7.task.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import static ru.sberbank.lesson7.task.fragment.ExampleIntentService.EXTRA_PARAM_VALUE;

public class ExampleBroadcastReceiver extends BroadcastReceiver {

    private EditViewCallback callback;

    public ExampleBroadcastReceiver(EditViewCallback callback) {
        this.callback = callback;
    }

    public ExampleBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        callback.onValueChanged(intent.getStringExtra(EXTRA_PARAM_VALUE));
    }
}
