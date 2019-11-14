package rafaelgsm.example.koin_playground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import rafaelgsm.example.koin_playground.repo.TextRepositoryImpl

class MainActivity : AppCompatActivity() {

    private val _presenter by lazy { Presenter(TextRepositoryImpl()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = _presenter.getText()
    }
}
