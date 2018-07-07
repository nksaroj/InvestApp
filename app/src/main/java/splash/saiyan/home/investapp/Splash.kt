package splash.saiyan.home.investapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startMainActivity(getIntent());

    }

    private fun startMainActivity(intent: Intent?) {

        val nextIntent = Intent(this, MainActivity::class.java)
        nextIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)

        if (intent != null) {
            nextIntent.action = intent.action
            if (intent.extras != null) {
                nextIntent.putExtras(intent.extras!!)
            }
        }

        startActivity(nextIntent)
        finish()
    }
}
