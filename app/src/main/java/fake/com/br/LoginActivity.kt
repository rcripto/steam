package fake.com.br

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColorTo(R.color.colorPrimary)
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun Window.setStatusBarColorTo(color: Int) {
        this.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        this.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        this.statusBarColor = ContextCompat.getColor(baseContext, color)
    }
}