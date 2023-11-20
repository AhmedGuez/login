package epi.ia2.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import epi.ia2.login.databinding.ActivityLoginBinding
import epi.ia2.login.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityRegisterBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_register)


    }


}
