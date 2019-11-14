package rafaelgsm.example.koin_playground

import androidx.lifecycle.ViewModel
import rafaelgsm.example.koin_playground.repo.TextRepository

class MyViewModel(private val repo: TextRepository) : ViewModel() {

    fun getText() = repo.getText()

}