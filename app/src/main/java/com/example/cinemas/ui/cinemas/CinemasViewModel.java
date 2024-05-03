package com.example.cinemas.ui.cinemas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CinemasViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CinemasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}