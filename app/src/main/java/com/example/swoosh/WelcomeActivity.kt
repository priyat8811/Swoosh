package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)
        getStartedBtn.setOnClickListener() {
            val leagueIntent = Intent(
                this, LeagueActivity::class.java)
                        startActivity(leagueIntent);
        }
    }
}