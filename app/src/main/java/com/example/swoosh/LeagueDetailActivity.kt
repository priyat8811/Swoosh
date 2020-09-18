package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league_detail.*

class LeagueDetailActivity : AppCompatActivity() {
    lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_detail)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        if(player.league != "") {
            println("passed intent ${player.league}")
        }
    }
    fun onFinishBtnClick(view: View){
        if(player.skill!="") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this,"please select skill type",Toast.LENGTH_SHORT).show()
        }
    }
    fun onBallerBtnClick(view: View){
        player.skill = "baller"
        beginnerToggleBtn.isChecked = false
    }
    fun onBeginnerBtnClick(view :View){
        player.skill = "Beginner"
        ballerTogleBtn.isChecked = false
    }
}