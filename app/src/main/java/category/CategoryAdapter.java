package category;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclervoew_ts1.R;

import java.util.List;

import book.Book;
import book.BookAdapter;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private Context context;
    private List<Category> list;

    public CategoryAdapter(Context context) {
        this.context = context;

    }
    public void setData(List<Category> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Category category = list.get(position);
        if(category == null){
            return;
        }

        holder.tvNameCategory.setText(category.getNameCategory());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false);
        holder.rcvBook.setLayoutManager(linearLayoutManager);
        List< Book> books = category.getBooks();
        BookAdapter bookAdapter = new BookAdapter();
        bookAdapter.setData(books);
        holder.rcvBook.setAdapter(bookAdapter);

    }

    @Override
    public int getItemCount() {
        if(list != null){
            return list.size();
        }
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNameCategory;
        private RecyclerView rcvBook;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameCategory = itemView.findViewById(R.id.tv_name_category);
            rcvBook = itemView.findViewById(R.id.rcv_book);
        }
    }
}
