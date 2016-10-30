package android.lyan.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Author LYJ
 * Created on 2016/10/30.
 * Time 09:27
 */

public class Hello {
    public static void toastString(String message, Context context){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
