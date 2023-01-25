package com.example.colosseum

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContent = this

    abstract fun setupEvents()
    abstract fun setValues()

}