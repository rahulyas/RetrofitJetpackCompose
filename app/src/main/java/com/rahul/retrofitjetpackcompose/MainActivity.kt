package com.rahul.retrofitjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.rahul.retrofitjetpackcompose.presentation.PostViewModel
import com.rahul.retrofitjetpackcompose.ui.screen.ListWithCards
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                val viewModel: PostViewModel by viewModels()
                val list by viewModel.posts.collectAsStateWithLifecycle()
                ListWithCards(list)
            }
        }
    }
}