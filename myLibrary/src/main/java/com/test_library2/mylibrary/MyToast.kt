package com.test_library2.mylibrary

import android.content.Context
import android.widget.Toast

class MyToast {
    fun makeToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}