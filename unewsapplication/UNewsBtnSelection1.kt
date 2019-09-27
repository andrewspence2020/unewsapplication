package com.example.unewsapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_newsselection_screen.*
import kotlinx.android.synthetic.main.activity_newsselection_screen1.*

class UNewsBtnSelection1 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newsselection_screen1)

        worldstar_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.worldstarhiphop.com/")
            startActivity(openURL)
        }
        vladtv_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.vladtv.com/")
            startActivity(openURL)
        }
        ufc_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.ufc.com/")
            startActivity(openURL)
        }
        bbc_news_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.bbc.com/")
            startActivity(openURL)
        }

        //////////////////////////////////////////
        ap_news_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://apnews.com/")
            startActivity(openURL)
        }
        economist_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.economist.com/")
            startActivity(openURL)
        }
        Npr_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.npr.org/")
            startActivity(openURL)
        }
        usa_today_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.usatoday.com/")
            startActivity(openURL)
        }


        googlemap_btn.setOnClickListener {
            // Create a Uri from an intent string. Use the result to create an Intent.
            val gmmIntentUri = Uri.parse("geo:latitude,longitude?q=query\n" +
                    "geo:0,0?q=my+street+address\n" +
                    "geo:0,0?q=latitude,longitude(label)")

// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
// Make the Intent explicit by setting the Google Maps package
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
// Attempt to start an activity that can handle the Intent
                startActivity(mapIntent)
            }
        }


    }
}