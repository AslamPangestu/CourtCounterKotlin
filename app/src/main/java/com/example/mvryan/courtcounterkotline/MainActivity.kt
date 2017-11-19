package com.example.mvryan.courtcounterkotline

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*//mengambil semua yang ada di activity_main

/**
 * Created by mvryan on 18/11/17.
 */

//class nama_class :(extend) extend Class
class MainActivity : AppCompatActivity() {

    //membuat variabel dengan tipe data integer
    //var/val namaVariable : (tipe data) = value
    private var scoreTeamA: Int = 0
    private var scoreTeamB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {//fungsi onCreate yang dioveride dari AppCompactActivity
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//dia akan membuka layout dengan nama activity_main

        teamA()//panggil fungsinya
        teamB()//panggil fungsinya

        btn_reset.setOnClickListener({//mengeset fungsi button reset
            scoreTeamA = 0
            scoreTeamB = 0
            tv_score_a.text = "$scoreTeamA"
            tv_score_b.text = "$scoreTeamB"
        })

    }

    //fungsi dengan nama teamA
    private fun teamA() {
        btn_3_a.setOnClickListener({
            //tambahkan nilai
            scoreTeamA += 3
            //tampilkan ke text view
            tv_score_a.text = "$scoreTeamA"//$ untuk menyisipkan variabel
        })
        btn_1_a.setOnClickListener({
            scoreTeamA += 1
            tv_score_a.text = scoreTeamA.toString()//menconvert scoreTeamA ke string
        })
        btn_2_a.setOnClickListener({
            scoreTeamA += 2
            tv_score_a.text = "$scoreTeamA"
        })

    }

    //fungsi dengan nama teamA
    private fun teamB() {
        btn_3_b.setOnClickListener({
            //tambahkan nilai
            scoreTeamB += 3
            //tampilkan ke text view
            tv_score_b.text = "$scoreTeamB"//$ untuk menyisipkan variabel
        })
        btn_1_b.setOnClickListener({
            scoreTeamB += 1
            tv_score_b.text = scoreTeamB.toString()//menconvert scoreTeamA ke string
        })
        btn_2_b.setOnClickListener({
            scoreTeamB += 2
            tv_score_b.text = "$scoreTeamB"
        })

    }

}
