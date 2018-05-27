package com.hari.rgmcampus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var sp:Spinner=findViewById(R.id.sp)
        sp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                if (position > 0) {
                    Toast.makeText(this@RegisterActivity, sp.selectedItem.toString(), Toast.LENGTH_LONG).show()
                }

            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }
}
