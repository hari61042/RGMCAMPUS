package com.hari.rgmcampus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View

class MainActivity : AppCompatActivity() {
    var login:CardView?=null
    var signup:CardView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login= findViewById(R.id.login)
        signup=findViewById(R.id.signup)

        signup?.setOnClickListener(View.OnClickListener {
            var i = Intent(this,RegisterActivity::class.java)
            startActivity(i)

        })
    }
}
