package com.dicoding.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtwidth: EditText
    private lateinit var edtheight: EditText
    private lateinit var editLenght: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtwidth = findViewById(R.id.edt_width)
        edtheight = findViewById(R.id.edt_height)
        editLenght = findViewById(R.id.edit_length)
        btnCalculate =findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)
        btnCalculate.setOnClickListener(this)



    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.btn_calculate) {
            val inputLength = editLenght.text.toString().trim()
            val inputWidth = edtwidth.text.toString().trim()
            val inputHeight = edtheight.text.toString().trim()
            var isEmpetyFields = false
            if (inputLength.isEmpty()){
                isEmpetyFields = true
                editLenght.error = "Angka Tidak Boleh Kosong"
            }

            if (inputWidth.isEmpty()){
                isEmpetyFields= true
                edtwidth.error = "Angkanya Tidak Boleh Kosong"
            }

            if (inputHeight.isEmpty()){
                isEmpetyFields= true
                edtheight.error= "Angka Tidak Boleh Kosong"
            }

            if(!isEmpetyFields){
                val volume = inputLength.toDouble() *inputWidth.toDouble() *inputHeight.toDouble()
                tvResult.text =volume.toString()
            }

        }


    }


}
