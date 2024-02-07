package com.example.quickjournal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.quickjournal.screen.JournalApp
import com.example.quickjournal.ui.theme.QuickJournalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuickJournalTheme {
                JournalApp()
            }
        }
    }
}