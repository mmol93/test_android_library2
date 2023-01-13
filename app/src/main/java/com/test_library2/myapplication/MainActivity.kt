package com.test_library2.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test_library2.mylibrary.MyToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyToast().makeToast(this, "this message is from myLibrary")
    }
}