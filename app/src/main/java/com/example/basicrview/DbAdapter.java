package com.example.basicrview;


import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import java.util.List;

 class DbAdapter extends RecyclerView.Adapter<DbAdapter.MyViewHolder> {

    private List<Dbvalue> dblist;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,age;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            age = (TextView) view.findViewById(R.id.age);

        }
    }


    public DbAdapter(List<Dbvalue> dblist) {
        this.dblist = dblist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.db_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Dbvalue movie = dblist.get(position);
        holder.name.setText(movie.getName());
        holder.age.setText(movie.getAge());

    }

    @Override
    public int getItemCount() {
        return dblist.size();
    }
}