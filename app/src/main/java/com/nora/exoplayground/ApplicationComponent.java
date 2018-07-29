package com.nora.exoplayground;

import android.app.Application;
import android.support.annotation.NonNull;

import com.nora.exoplayground.main.MainActivityModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        ApplicationModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class
})
interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @NonNull
        @BindsInstance
        Builder application(@NonNull Application application);

        @NonNull
        ApplicationComponent build();

    }

    void inject(@NonNull Application application);

}
