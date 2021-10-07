package com.developersbreach.androidbootcamp

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IndiaActivity: AppCompatActivity() {

    // private lateinit var popularTextView: TextView
    // private lateinit var albumTextView: TextView

    private var isTextHighLighted: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_india)

        val popularTextView: TextView = findViewById(R.id.popular_tab_text)
        val albumTextView: TextView = findViewById(R.id.albums_tab_text)
        val booleanTrackedValue: TextView = findViewById(R.id.track_boolean_value)

        popularTextView.setOnClickListener {
            handleHighlights(popularTextView, albumTextView, booleanTrackedValue)
        }
    }

    fun handleHighlights(
        popularTextView: TextView,
        albumTextView: TextView,
        booleanTrackedValue: TextView
    ) {

        if (isTextHighLighted) {
            // When is is true
            popularTextView.setTextColor(resources.getColor(R.color.un_highlighted_text_color, null))
            popularTextView.setTypeface(null, Typeface.NORMAL)

            albumTextView.setTextColor(resources.getColor(R.color.white, null))
            albumTextView.setTypeface(null, Typeface.BOLD)

            isTextHighLighted = false

        } else {
            // When is is false
            popularTextView.setTextColor(resources.getColor(R.color.white, null))
            popularTextView.setTypeface(null, Typeface.BOLD)

            albumTextView.setTextColor(resources.getColor(R.color.un_highlighted_text_color, null))
            albumTextView.setTypeface(null, Typeface.NORMAL)

            isTextHighLighted = true
        }

        booleanTrackedValue.text = isTextHighLighted.toString()
    }
}