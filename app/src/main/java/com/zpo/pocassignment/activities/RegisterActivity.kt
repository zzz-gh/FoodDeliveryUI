package com.zpo.pocassignment.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import com.zpo.pocassignment.adapters.RegisterFragmentAdapter
import com.zpo.pocassignment.fragments.EnterAmountFragment
import com.zpo.pocassignment.fragments.Register1
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

//        vpRegister.adapter = RegisterFragmentAdapter(this)
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.llRegisterAllView, Register1()).commit()
    }
}