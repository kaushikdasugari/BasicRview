package com.example.basicrview;




        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.DefaultItemAnimator;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;



        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Dbvalue> dblist = new ArrayList<>();
    private RecyclerView recyclerView;
    private DbAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new DbAdapter(dblist);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareDblist();
    }

    private void prepareDblist() {
        Dbvalue user1 = new Dbvalue("ume1", "20" );
        dblist.add(user1);

        Dbvalue user2 = new Dbvalue("ume2", "21");
        dblist.add(user2);

        Dbvalue user3 = new Dbvalue("ume3", "22");
        dblist.add(user3);

        Dbvalue user4 = new Dbvalue("ume4", "23");
        dblist.add(user4);

        Dbvalue user5 = new Dbvalue("ume5", "24");
        dblist.add(user5);

        Dbvalue user6 = new Dbvalue("ume6", "25");
        dblist.add(user6);

        Dbvalue  user7 = new Dbvalue("ume7", "26");
        dblist.add(user7);

        Dbvalue user8 = new Dbvalue("ume8", "27");
        dblist.add(user8);

        Dbvalue user9 = new Dbvalue("ume9", "28");
        dblist.add(user9);

        Dbvalue user10 = new Dbvalue("ume10", "29");
        dblist.add(user10);


        mAdapter.notifyDataSetChanged();
    }
}