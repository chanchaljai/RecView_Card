package com.example.rec1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
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
    }
}