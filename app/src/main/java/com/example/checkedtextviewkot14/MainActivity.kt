package com.example.checkedtextviewkot14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var checkedTextView: CheckedTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkedTextView=findViewById(R.id.cv)
        checkedTextView.setOnClickListener {
            checkedTextView.toggle()
            if (checkedTextView.isChecked) {
                Toast.makeText(this@MainActivity, "checked", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this@MainActivity, "unchecked", Toast.LENGTH_LONG).show()
            }
        }
    }
}