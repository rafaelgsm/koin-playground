package rafaelgsm.example.koin_playground

import rafaelgsm.example.koin_playground.repo.TextRepository

/**
 * We are not going further as providing an interface for this presenter,
 * for the sake of simplicity.
 */
class Presenter(private val repo: TextRepository) {

    fun getText() = repo.getText()

}