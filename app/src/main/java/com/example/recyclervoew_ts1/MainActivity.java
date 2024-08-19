package com.example.recyclervoew_ts1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import book.Book;
import category.Category;
import category.CategoryAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcv;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcv.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getData());
        rcv.setAdapter(categoryAdapter);

    }

    private List<Category> getData() {
        List<Category> list = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        books.add(new Book(R.drawable.ip,"Book 1"));
        books.add(new Book(R.drawable.ss,"Book 2"));
        books.add(new Book(R.drawable.rd,"Book 3"));
        books.add(new Book(R.drawable.op,"Book 4"));

        books.add(new Book(R.drawable.ip,"Book 1"));
        books.add(new Book(R.drawable.ss,"Book 2"));
        books.add(new Book(R.drawable.rd,"Book 3"));
        books.add(new Book(R.drawable.op,"Book 4"));

        list.add(new Category("Category 1",books));
        list.add(new Category("Category 2",books));
        list.add(new Category("Category 3",books));
        list.add(new Category("Category 4",books));


        return list;
    }
}