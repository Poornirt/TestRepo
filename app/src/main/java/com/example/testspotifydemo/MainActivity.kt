package com.example.testspotifydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spotifydemoapp.MainActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainActivity().getClientIdAndRedirectUri("c4c1ead413624fef9da6f4cac47f9d2f","https://com.example.spotifydemoapp/callback/")
    }
}
