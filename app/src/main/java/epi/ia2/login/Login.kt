package epi.ia2.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import epi.ia2.login.databinding.ActivityLoginBinding
import epi.ia2.login.databinding.ActivityMainBinding

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)    }
}