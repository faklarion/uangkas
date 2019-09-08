package com.studio.faisal.uangkas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.studio.faisal.uangkas.fragment.Intro1;
import com.studio.faisal.uangkas.fragment.Intro2;
import com.studio.faisal.uangkas.fragment.Intro3;

public class IntroActivity extends AppIntro {

    Intro1 intro1 = new Intro1();
    Intro2 intro2 = new Intro2();
    Intro3 intro3 = new Intro3();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance("SELAMAT DATANG", "Saya siap menjadi Android Developer!", R.drawable.android,
        getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("UANGKAS v.2", "Belajar Membuat Aplikasi Manajemen Keuangan Dengan Android Studio, PHP & MySQL", R.drawable.calc,
                getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Lanjutkan", "Selamat Mencoba!",R.drawable.coder_uniska,
                getResources().getColor(R.color.colorPrimary)));
        setBarColor(getResources().getColor(R.color.colorPrimary));

        setSeparatorColor(getResources().getColor(R.color.circle_background))
        ;
        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(true);
        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
                setVibrate(true);
        setVibrateIntensity(30);
    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        finish();
    }
    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        finish();
    }
    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment,
                               @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
