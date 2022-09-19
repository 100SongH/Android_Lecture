package com.example.c11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        var name = TextView(this).apply {
//            typeface = Typeface.DEFAULT_BOLD
//            text = "SESAC"
//        }
//
//        var image = ImageView(this).also {
//            it.setImageDrawable(ContextCompat.getDrawable (
//                    this, R.drawable.logo_1
//                    ))
//        }
//
//        var title = TextView(this).apply {
//            typeface = Typeface.DEFAULT_BOLD
//            text = "JetPack 과 Kotlin 을 활용한 Android App 개발"
//        }
//
//        val layout = LinearLayout(this).apply {
//            orientation = LinearLayout.VERTICAL
//            gravity = Gravity.CENTER
//            addView(name, WRAP_CONTENT, WRAP_CONTENT)
//            addView(image, WRAP_CONTENT, WRAP_CONTENT)
//            addView(title, WRAP_CONTENT, WRAP_CONTENT)
//        }
//
//        setContentView(layout)


        setContentView(R.layout.activity_main)
    }
}