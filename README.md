# koin-playground

## Setup:

gradle (app)

```gradle
dependencies {
    // Koin for Android
    implementation 'org.koin:koin-android:2.0.1'

    //With ViewModel
    implementation 'org.koin:koin-android-viewmodel:2.0.1'
}
```


### Sample without DI [V1](https://github.com/rafaelgsm/koin-playground/tree/v1)

1. Create a mock repository class

2. Create a presenter to consume the data

3. Test the presenter in an Activity

### With DI [V2](https://github.com/rafaelgsm/koin-playground/tree/v2)
4. Create the Koin module

5. Start Koin

6. Inject dependencies

### ViewModel

7. Create a ViewModel implementation (Instead of the presenter)

8. Add the viewmodel to the modules

## Resources

https://insert-koin.io/

https://github.com/InsertKoinIO/koin

