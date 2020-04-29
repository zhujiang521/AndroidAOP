package com.zj.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.zj.singclick.SingleClick
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        btnTest.setOnClickListener(this)
    }

    @SingleClick
    override fun onClick(v: View) {
        Toast.makeText(this,"测试",Toast.LENGTH_SHORT).show()
        Log.e("测试时","cee")
        //startActivity<TestActivity>(this){}
    }
}
