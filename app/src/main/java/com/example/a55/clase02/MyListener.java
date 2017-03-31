package com.example.a55.clase02;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;

/**
 * Created by A55 on 31/03/2017.
 */

public class MyListener implements View.OnClickListener {

    public MyListener() {
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn1:
                Log.d("CLICK", "SE HIZO CLICK EN BTN1");
                break;

            case R.id.btn2:
                Log.d("CLICK", "SE HIZO CLICK EN BTN2");
                break;
        }

        /*if (v.getId() == R.id.btn1) {
            Log.d("CLICK", "SE HIZO CLICK EN BTN1");
        } else {
            Log.d("CLICK", "SE HIZO CLICK EN BTN2");
        }*/
    }
}
