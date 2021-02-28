package com.example.jfisrat.eventmanagerapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class Pop_up_dialog extends AppCompatDialogFragment {
    private EditText codeEditText;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.join_pop_up,null);
        alertDialogBuilder.setView(view)
                           .setTitle("Enter the event")
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
        codeEditText=view.findViewById(R.id.code_editText_for_joinEvent);
        return alertDialogBuilder.create();
    }
}
