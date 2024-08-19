package book;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclervoew_ts1.R;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private List<Book> list;



    public void setData(List<Book> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_book,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Book book = list.get(position);
        if(book == null){
            return;
        }
        holder.imgBook.setImageResource(book.getResouceId());
        holder.tvTitle.setText(book.getTitle());
    }

    @Override
    public int getItemCount() {
        if(list != null){
            return list.size();
        }
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgBook;
        private TextView tvTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgBook = itemView.findViewById(R.id.img_book);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}


