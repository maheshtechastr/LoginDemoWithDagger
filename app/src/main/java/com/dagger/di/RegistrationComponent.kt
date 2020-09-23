package com.dagger.di

import com.dagger.registration.RegistrationActivity
import com.dagger.registration.enterdetails.EnterDetailsFragment
import com.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface RegistrationComponent {
    // Factory to create instances of RegistrationComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}