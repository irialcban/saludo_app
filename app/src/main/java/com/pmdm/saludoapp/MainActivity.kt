package com.pmdm.saludoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello: AppCompatButton = findViewById(R.id.btnHello)
        val etName: AppCompatEditText = findViewById(R.id.etName)

        btnHello.setOnClickListener {
            //Log.i("Test","Botón pulsado")
            val name = etName.text.toString()
            
            //if(name.isNotEmpty()) {
            //    Snackbar.make(btnHello,"Hola $name!",Snackbar.LENGTH_SHORT).setAnchorView(btnHello).setAction("CLOSE"){ finishAffinity()}.show()
            //}else {
            //    Toast.makeText(this,"Hola $name!",Toast.LENGTH_LONG).show()
            val intentGA = Intent(this,GreetingActivity::class.java)
            intentGA.putExtra("EXTRA_NAME",name)
            startActivity(intentGA)
        }
    }
}
