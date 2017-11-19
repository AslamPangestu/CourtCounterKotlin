package com.example.mvryan.courtcounterkotline

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*//mengambil semua yang ada di activity_main

/**
 * Created by mvryan on 18/11/17.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//dia akan membuka layout dengan nama activity_main

        btn_reset.setOnClickListener({

        })
    }

}
