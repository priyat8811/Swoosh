package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    private var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onNextBtnClicked(view: View) {
        if (player.league != "") {
            val leagueDetailIntent = Intent(this, LeagueDetailActivity::class.java)
            leagueDetailIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(leagueDetailIntent)
        } else {
            Toast.makeText(this, "please select league type", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View) {
        womensToggleBtn.isChecked = false
        coedToggleBn.isChecked = false
        player.league = "Mens"
    }

    fun onWomensClicked(view: View) {
        mensToggleBtn.isChecked = false
        coedToggleBn.isChecked = false
        player.league = "Womens"
    }

    fun onCoedClicked(view: View) {
        womensToggleBtn.isChecked = false
        mensToggleBtn.isChecked = false
        player.league = "Coed"
    }
}