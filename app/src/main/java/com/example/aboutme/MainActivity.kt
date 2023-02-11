package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_main)
    }

    fun addNickName(view: View) {
        val editText:EditText=findViewById(R.id.editText)
        val nickName:TextView=findViewById(R.id.textView)
        nickName.text=editText.text
        editText.visibility=View.GONE
        view.visibility=View.GONE
        nickName.visibility=View.VISIBLE
    }

    fun reset(view: View) {
        val editText:EditText=findViewById(R.id.editText)
        val nickName:TextView=findViewById(R.id.textView)
        val btn: Button=findViewById(R.id.done)
        btn.visibility=View.VISIBLE
        nickName.text=""
        nickName.visibility=View.GONE
        editText.setText("")
        editText.visibility=View.VISIBLE

    }

}