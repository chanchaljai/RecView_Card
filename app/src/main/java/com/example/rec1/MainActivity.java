package com.example.rec1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerContactAdapter adapter;
    FloatingActionButton btnOpenDialog;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOpenDialog = findViewById(R.id.btnOpenDialog);
        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_lay);


                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtNumber = dialog.findViewById(R.id.edtNumber);
                Button btnAction = dialog.findViewById(R.id.btnAction);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name="",number="";
                        if(!edtName.getText().toString().equals("")){
                            name = edtName.getText().toString();
                        }else{
                            Toast.makeText(MainActivity.this, "Please Enter Contact Name!", Toast.LENGTH_SHORT).show();
                        }
                        if(!edtNumber.getText().toString().equals("")){
                            number= edtNumber.getText().toString();
                        }else{
                            Toast.makeText(MainActivity.this, "Please Enter Contact Number!", Toast.LENGTH_SHORT).show();
                        }
                        arrContacts.add(new ContactModel(name,number));
                        recyclerView.scrollToPosition(arrContacts.size()-1);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.a,"A", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.b,"B", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.c,"C", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.a,"A", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.b,"B", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.c,"C", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.a,"A", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.b,"B", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.c,"C", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.a,"A", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.b,"B", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.c,"C", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.a,"A", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.b,"B", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.c,"C", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.a,"A", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.b,"B", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.c,"C", "9999999999"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }


}