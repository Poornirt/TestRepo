package com.example.demolibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void ToastMessage(Context pContext,String pMessage){
        Toast.makeText(pContext, pMessage, Toast.LENGTH_SHORT).show();
    }
}
