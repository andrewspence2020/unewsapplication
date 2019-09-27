package com.example.unewsapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_login)


        login_button_login.setOnClickListener {
            val email = email_edittext_login.text.toString()
            val password = password_edittext_login.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Please enter text in email/password", Toast.LENGTH_SHORT).show()
            }



            Log.d("Login","Attempt login email/pw: $email/***")
            FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password)
                .addOnCompleteListener{
                    if(!it.isSuccessful)return@addOnCompleteListener
                    val intent = Intent(this,UNewsBtnSelection::class.java)
                    startActivity(intent)


                }
                .addOnFailureListener()
                {
                    Toast.makeText(this, "Failed to create user: ${"Please put a valid Email and Password"}", Toast.LENGTH_SHORT).show()
                }
        }
        back_to_registration_text_view.setOnClickListener {
            finish()
        }


    }
}