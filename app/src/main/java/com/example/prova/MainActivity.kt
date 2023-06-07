package com.example.prova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    <Button
    android:id="@+id/button0"
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_columnWeight="1"
    android:layout_rowWeight="1"
    android:text="0"
    android:textSize="24sp"/>
}