package com.github.ashkansarlak.toastshower;

import android.content.Context;
import android.widget.Toast;

/**
 * @author Ashkan Sarlak
 */
public class ToastShower {
    public static void showAToast(Context context) {
        Toast.makeText(context
                , "ToastShower <<LIBRARY>> (very big deal) is showing this toast!"
                , Toast.LENGTH_LONG).show();
    }
}
