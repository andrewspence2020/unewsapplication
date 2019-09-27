package com.example.unewsapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_newsselection_screen.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log
import kotlinx.android.synthetic.main.activity_newsselection_screen.*


class UNewsBtnSelection : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_newsselection_screen)


        ign_selection_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.ign.com/")
            startActivity(openURL)
        }
        fox_selection_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.foxnews.com/")
            startActivity(openURL)
        }
        mtv_selection_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.mtv.ca/")
            startActivity(openURL)
        }
        The_Globe_and_mail_selection_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.theglobeandmail.com/")
            startActivity(openURL)
        }
        espn_selection_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.espn.com/")
            startActivity(openURL)
        }
        tech_radar_selection_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.techradar.com/")
            startActivity(openURL)
        }
        citytv_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.citytv.com/")
            startActivity(openURL)
        }
        cp24_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.cp24.com/")
            startActivity(openURL)
        }

        toronto_star_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.thestar.com/")
            startActivity(openURL)
        }
        tech_times_btn.setOnClickListener {
            val openURL =Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.techtimes.com/")
            startActivity(openURL)
        }
        more_news_btn.setOnClickListener {
            val intent = Intent(this, UNewsBtnSelection1::class.java )
            startActivity(intent)
        }








    }
}