package com.example.pccomponentes

import android.os.Bundle
import android.util.Log

import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.RangeSlider

class MainActivity : AppCompatActivity() {

    lateinit var rsHdd:RangeSlider
    lateinit var rsRam:RangeSlider
    var valueHdd:Float = 0f
    var valueRam:Float = 0f

    var HDD_PRECIO:Float = 0.04f
    var RAM_PRECIO:Float = 2.625f

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

    lateinit var tvTotal:TextView
    lateinit var tvHdd:TextView
    lateinit var tvRam:TextView
    lateinit var tvGabinete:TextView
    lateinit var tvProcesador:TextView
    lateinit var tvGrafica:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        initComponet()
        onClick()

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

        tvTotal = findViewById(R.id.tvTotal)
        tvHdd = findViewById(R.id.tvHdd)
        tvRam = findViewById(R.id.tvRam)
        tvGabinete = findViewById(R.id.tvGabinete)
        tvProcesador = findViewById(R.id.tvProcesador)
        tvGrafica = findViewById(R.id.tvGrafica)
    }

    private fun onClick(){
        rsHdd.addOnChangeListener { slider, value, fromUser ->
            valueHdd = value
            //0.14
            Log.i("Cambio",valueHdd.toString())
            sumaTotal()
        }
        rsRam.addOnChangeListener { slider, value, fromUser ->
            valueRam = value
            //2.63
            Log.i("Cambio",valueRam.toString())
            sumaTotal()
        }
        btnGrafica01.setOnClickListener(){

        }
    }
    private fun sumaTotal(){
        tvTotal.text = ((valueHdd*HDD_PRECIO)+(valueRam*RAM_PRECIO)).toString()+"€"
        tvHdd.text = "HDD = "+(valueHdd*HDD_PRECIO).toString()+"€ ("+valueHdd.toInt()+"GB)"
        tvRam.text = "RAM = "+(valueRam*RAM_PRECIO).toString()+"€("+valueRam.toInt()+"GB)"

    }


}