package com.example.jfisrat.eventmanagerapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Pop_up_for_sector extends AppCompatDialogFragment {

    private EditText headCodeEditText,volunteerCode,headName;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.pop_up_for_sector,null);
        alertDialogBuilder.setView(view)
                .setTitle("Select Sector Head.Then select code for head and volunteer")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        headCodeEditText=view.findViewById(R.id.code_editText_for_joinEvent);
        return alertDialogBuilder.create();
    }
}
