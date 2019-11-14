# koin-playground v2

## Setup:

gradle (app)

```gradle
dependencies {
    // Koin for Android
    implementation 'org.koin:koin-android:2.0.1'
}
```


### Sample without DI (v1)

1. Create a mock repository class

	-With an interface, so classes can depend on its abstraction (DI).

2. Create a presenter to consume the data

	-We inject the repository interface through the constructor.

	-This way the presenter has nothing to do with the construction of the repository.

	-Thus it does not depend on the repository implementation. 
	Instead, it depends on its abstraction (DI).

3. Test the presenter in an Activity

	-The highest module (In this case the Activity), is dependent on the Presenter() implementation, and the TextRepositoryImpl().

### With DI (v2)
4. Create the Koin module

	-Define what will be injected.

5. Start Koin

	-Setup what modules will be available.

6. Inject dependencies

	-Now the Presenter initialization os completely decoupled from the Activity.


