package com.dagger.di

import dagger.Module

// This module tells AppComponent which are its subComponents
@Module(
    subcomponents = [RegistrationComponent::class, LoginComponent::class,
        UserComponent::class]
)
class AppSubComponents