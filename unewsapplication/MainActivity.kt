package com.example.unewsapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var mShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Handle event click on the btnCall button
        btnCall.setOnClickListener {
            //get the input phone number from editText
            val phoneNumber = etPhoneNumber.text

            //But we have to create a Intetnt first
            val intent = Intent(Intent.ACTION_DIAL).apply {
                //pass the home number to the Intent
                data = Uri.parse("tel:$phoneNumber")
            }
            if(intent.resolveActivity(packageManager)!= null){
                startActivity(intent)
            }
        }


        mShare = findViewById(R.id.share_btn)
        mShare.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_SEND)
            myIntent.type = "type/palin"
            val shareBody = "You are body"
            val shareSub = "You subject here"
            myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody)
            myIntent.putExtra(Intent.EXTRA_TEXT, shareSub)
            startActivity(Intent.createChooser(myIntent,"Wanna Share this App?"))
        }


        send_a_email_btn.setOnClickListener {
            val intent = Intent(this, Email::class.java )
            startActivity(intent)
        }


        register_button_register.setOnClickListener {
            performRegister()
        }

        already_have_a_account_text_view.setOnClickListener {
            Log.d("MainActivity","Try to show login Activity")

            //launch the login activity somehow
            val intent = Intent(this, LoginActivity::class.java )
            startActivity(intent)
        }


    }



    private fun performRegister()
    {
        val  email = email_edittext_register.text.toString()
        val  password = password_edittext_register.text.toString()

        if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Please enter text in email/password", Toast.LENGTH_SHORT).show()
            return
        }



        Log.d("MainActivity","Email is: " + email)
        Log.d("MainActivity", "Password: $password")
        //this is my register button
        //Firebase Authentication to create a user with email and password
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener{
                if(!it.isSuccessful)return@addOnCompleteListener
                Toast.makeText(this, "You have logged in successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,UNewsBtnSelection::class.java)
                startActivity(intent)
            }   //else if successful

            //Log.d("Main","Successfully created user with uid: ${it.result!!.user.uid}")
            .addOnFailureListener{
                Toast.makeText(this, "Failed to Login User: ${it.message}", Toast.LENGTH_SHORT).show()
            }

    }


}

