package rafaelgsm.example.koin_playground.di

import org.koin.dsl.module
import rafaelgsm.example.koin_playground.Presenter
import rafaelgsm.example.koin_playground.repo.TextRepository
import rafaelgsm.example.koin_playground.repo.TextRepositoryImpl

val repositoryModule = module {

    //Singleton:
    single<TextRepository> { TextRepositoryImpl() }

    //Factory:
    factory { Presenter(get()) }
}