package com.example.jetpack_compose_assignment_1


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import com.example.jetpack_compose_assignment_1.ui.screens.CourseListScreen
import com.example.jetpack_compose_assignment_1.data.sampleCourses







class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    CourseListScreen(courseList = sampleCourses())
                }
            }
        }
    }
}

