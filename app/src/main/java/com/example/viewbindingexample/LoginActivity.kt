package com.example.viewbindingexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.viewbindingexample.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.btnLogin.setOnClickListener {
            val userName = binding.username.text.toString()
            val userPass = binding.password.text.toString()

            if (userName.isNotEmpty() && userPass.isNotEmpty()){
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                binding.username.error = "username harus di isi"
                binding.password.error = "password harus di isi"
            }
        }
    }
}