package com.dagger.di

import android.content.Context
import com.dagger.main.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

// Definition of a Dagger component that adds info from the StorageModule to the graph
@Singleton
@Component(modules = [StorageModule::class, AppSubComponents::class])
interface AppComponent {
    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)

    // Expose RegistrationComponent factory from the graph
    fun registrationComponent(): RegistrationComponent.Factory

    fun loginComponent(): LoginComponent.Factory
}