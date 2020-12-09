package com.example.forhairandbeard.ui.minoxidil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MinoxidilViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MinoxidilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}