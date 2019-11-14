package rafaelgsm.example.koin_playground.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import rafaelgsm.example.koin_playground.MyViewModel
import rafaelgsm.example.koin_playground.Presenter
import rafaelgsm.example.koin_playground.repo.TextRepository
import rafaelgsm.example.koin_playground.repo.TextRepositoryImpl

/**
 * We can "get()" the classes made available through "single<T>".
 */
val repositoryModule = module {

    //Singleton:
    single<TextRepository> { TextRepositoryImpl() }

    //Factory:
    factory { Presenter(get()) }

    //ViewModel:
    viewModel { MyViewModel(get()) }

}