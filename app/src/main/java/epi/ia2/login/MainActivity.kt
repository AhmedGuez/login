package epi.ia2.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import epi.ia2.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}