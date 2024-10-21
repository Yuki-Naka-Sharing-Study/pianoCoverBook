package com.example.piano_cover_book

import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rightNumberTextView = findViewById<TextView>(R.id.right_number_text_view)
        val rightNumberSeekbar = findViewById<SeekBar>(R.id.right_number_seekbar)

        val leftNumberTextView = findViewById<TextView>(R.id.left_number_text_view)
        val leftNumberSeekbar = findViewById<SeekBar>(R.id.left_number_seekbar)

        rightNumberTextView.text = "${rightNumberSeekbar.progress}"
        leftNumberTextView.text = "${leftNumberSeekbar.progress}"

        rightNumberSeekbar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    rightNumberTextView.text = "$p1"
                }
                override fun onStartTrackingTouch(p0: SeekBar?) {
                }
                override fun onStopTrackingTouch(p0: SeekBar?) {
                }
            }
        )

        leftNumberSeekbar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    leftNumberTextView.text = "$p1"
                }
                override fun onStartTrackingTouch(p0: SeekBar?) {
                }
                override fun onStopTrackingTouch(p0: SeekBar?) {
                }
            }
        )
    }
}