package com.dagger.di

import dagger.Module

// This module tells AppComponent which are its subcomponents
@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class])
class AppSubComponents