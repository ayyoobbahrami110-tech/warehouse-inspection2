package com.example.warehouse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitBtn = findViewById<Button>(R.id.submitBtn)
        val name = findViewById<EditText>(R.id.name)
        val code = findViewById<EditText>(R.id.code)
        val city = findViewById<EditText>(R.id.city)

        submitBtn.setOnClickListener {
            Toast.makeText(this, "اطلاعات ذخیره شد: ${name.text}", Toast.LENGTH_SHORT).show()
        }
    }
}
