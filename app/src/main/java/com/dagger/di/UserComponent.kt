package com.dagger.di

import com.dagger.main.MainActivity
import com.dagger.settings.SettingsActivity
import dagger.Subcomponent

// Definition of a Dagger subcomponent
@LoggedUserScope
@Subcomponent
interface UserComponent {

    // Factory to create instances of UserComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}