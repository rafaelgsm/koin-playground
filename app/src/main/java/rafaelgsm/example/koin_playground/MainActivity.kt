package rafaelgsm.example.koin_playground

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    //    private val _presenter: Presenter by inject()
    private val _viewModel: MyViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val text = _presenter.getText()
        val text = _viewModel.getText()

        Toast.makeText(
            this,
            text,
            Toast.LENGTH_SHORT
        ).show()
    }
}
