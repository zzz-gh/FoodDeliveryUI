package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    companion object{
        fun homeActivityIntent(context: Context): Intent {
            return Intent(context,HomeActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        llFourBox.setOnClickListener {
            startActivity(ExploreActivity.exploreIntent(this))
        }
        btnSearch.setOnClickListener {
            startActivity(SearchActivity.searchIntent(this))
        }

        ivProfile.setOnClickListener {
            startActivity(ProfileActivity.profileActivityIntent(this))
        }
    }
}