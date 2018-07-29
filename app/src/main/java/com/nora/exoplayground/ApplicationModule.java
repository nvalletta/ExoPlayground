package com.nora.exoplayground;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.nora.exoplayground.main.MainActivitySubComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {
        MainActivitySubComponent.class
})
class ApplicationModule {

    @Provides
    Context provideApplicationContext(@NonNull Application application) {
        return application;
    }

}
