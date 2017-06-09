package com.example.alumno.intentexplicitosdesign;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;

/**
 * Created by alumno on 08/06/2017.
 */

public class MyListener implements View.OnClickListener {

    private Activity a;

    public MyListener(Activity a)
    {
        this.a = a;
    }
    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.floating)
        {
            Log.d("Hizo click","floating");
//INTENT IMPLICITOS
            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:42546541"));
            if(ActivityCompat.checkSelfPermission(a, Manifest.permission.CALL_PHONE)
                !=(PackageManager.PERMISSION_GRANTED))
            {
                //necesario para version 5 en adelante.
                //Pregunta si queremos o no dar el permiso
                ActivityCompat.requestPermissions(a,
                        new String[]{Manifest.permission.CALL_PHONE}
                    ,0);
                return;


            }

            a.startActivity(i);
        }
    }
}
