package com.example.forhairandbeard.ui.minoxidil;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.forhairandbeard.R;

public class MinoxidilFragment extends Fragment {

    private MinoxidilViewModel minoxidilViewModel;
    private Button whatIsButton;
    private InfoAlert infoAlert;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        minoxidilViewModel = new ViewModelProvider(this).get(MinoxidilViewModel.class);

        View root = inflater.inflate(R.layout.fragment_minoxidil, container, false);

        whatIsButton = root.findViewById(R.id.what_is);
        infoAlert = new InfoAlert();

        whatIsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                infoAlert.onCreateDialog(null);
                infoAlert.show(getParentFragmentManager(), "test");
            }
        });
//        final TextView textView = root.findViewById(R.id.text_test);
//        minoxidilViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>()
//        {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        return root;
    }
}