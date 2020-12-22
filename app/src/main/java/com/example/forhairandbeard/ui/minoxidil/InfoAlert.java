package com.example.forhairandbeard.ui.minoxidil;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.forhairandbeard.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class InfoAlert extends DialogFragment {


    private ImageView imageView;
    private TextView  textView;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();

        View view = inflater.inflate(R.layout.info_alert_dialog, null);

        imageView = view.findViewById(R.id.icon_alert);
        textView = view.findViewById(R.id.text_alert);

        textView.setText(R.string.minoxidil_pharagraph);
        imageView.setBackgroundResource(R.drawable.chemical_minox);

        builder.setTitle(R.string.menu_minoxidil)
                .setView(view)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
                });
        return builder.create();
    }
}
