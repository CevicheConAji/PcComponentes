package com.example.pccomponentes

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.RangeSlider

class MainActivity : AppCompatActivity() {

    lateinit var rsHdd:RangeSlider
    lateinit var rsRam:RangeSlider

    lateinit var btnGabinete01:ImageButton
    lateinit var btnGabinete02:ImageButton

    lateinit var btnProcesador01:ImageButton
    lateinit var btnProcesador02:ImageButton
    lateinit var btnProcesador03:ImageButton
    lateinit var btnProcesador04:ImageButton

    lateinit var btnGrafica01:ImageButton
    lateinit var btnGrafica02:ImageButton
    lateinit var btnGrafica03:ImageButton
    lateinit var btnGrafica04:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        initComponet()



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun initComponet(){
        rsHdd = findViewById(R.id.rsHdd)
        rsRam = findViewById(R.id.rsRam)

        btnGabinete01 = findViewById(R.id.btnGabinte01)
        btnGabinete02 = findViewById(R.id.btnGabinte02)

        btnProcesador01 = findViewById(R.id.btnProcesador01)
        btnProcesador02 = findViewById(R.id.btnProcesador02)
        btnProcesador03 = findViewById(R.id.btnProcesador03)
        btnProcesador04 = findViewById(R.id.btnProcesador04)

        btnGrafica01 = findViewById(R.id.btnGrafica01)
        btnGrafica02 = findViewById(R.id.btnGrafica02)
        btnGrafica03 = findViewById(R.id.btnGrafica03)
        btnGrafica04 = findViewById(R.id.btnGrafica04)
    }

}