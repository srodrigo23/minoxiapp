package com.example.forhairandbeard.ui.biotin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BiotinViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BiotinViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}