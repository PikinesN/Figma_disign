package com.example.figma_design

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.VISIBLE
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)

        val LLcrash = findViewById<LinearLayout>(R.id.LLCrash)
        val LLsleep = findViewById<LinearLayout>(R.id.LLsleep)

        val LLgalaxy = findViewById<LinearLayout>(R.id.LLgalaxy)
        val LLgalaxynumber = findViewById<TextView>(R.id.LLgalaxy_number)
        val LLgalaxytext = findViewById<TextView>(R.id.LLgalaxy_text)
        val btcorret = findViewById<Button>(R.id.bt_correct)


        val LLiron = findViewById<LinearLayout>(R.id.LLiron)

        val LLgone = findViewById<ConstraintLayout>(R.id.LLGone)


        LLgalaxy.setOnClickListener {
            LLgone.visibility = View.VISIBLE
            LLgalaxy.background = resources.getDrawable(R.drawable.shape_rounded_containers_true)
            LLgalaxynumber.background = resources.getDrawable(R.drawable.shape_rounded_variants_true)
            LLgalaxynumber.setTextColor(Color.parseColor("#FFFFFF"))
            LLgalaxytext.setTextColor(Color.parseColor("#0EAD69"))
        }




        btcorret.setOnClickListener {
            val intent = intent
            finish()
            startActivity(intent)
        }

    }
}