package rafaelgsm.example.koin_playground.repo

class TextRepositoryImpl : TextRepository {


    override fun getText(): String {
        return "Some text."
    }

}