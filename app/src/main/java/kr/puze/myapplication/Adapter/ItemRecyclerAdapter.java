package kr.puze.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import kr.puze.myapplication.Data.ItemData;
import kr.puze.myapplication.R;

public class ItemRecyclerAdapter extends RecyclerView.Adapter<ItemRecyclerAdapter.ItemViewHolder> {

    // adapter에 들어갈 list 입니다.
    private ArrayList<ItemData> listData = new ArrayList<>();
    private ViewGroup parent;

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.parent = parent;
        // LayoutInflater를 이용하여 전 단계에서 만들었던 item.xml을 inflate 시킵니다.
        // return 인자는 ViewHolder 입니다.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        // Item을 하나, 하나 보여주는(bind 되는) 함수입니다.

        holder.onBind(listData.get(position), parent);
    }

    @Override
    public int getItemCount() {
        // RecyclerView의 총 개수 입니다.
        return listData.size();
    }

    public void addItem(ItemData data) {
        // 외부에서 item을 추가시킬 함수입니다.
        listData.add(data);
    }

    // RecyclerView의 핵심인 ViewHolder 입니다.
    // 여기서 subView를 setting 해줍니다.
    class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textName;
        private TextView textDescription;

        ItemViewHolder(View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.text_name_item_recycler);
            textDescription = itemView.findViewById(R.id.text_description_item_recycler);
            imageView = itemView.findViewById(R.id.image_item_recycler);
        }

        void onBind(ItemData data, @NonNull ViewGroup parent) {
            textName.setText(data.getName());
            textDescription.setText(data.getDescription());
            Glide.with(parent.getContext())  // this
                    .load(data.getImage())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imageView);
//            Glide.with(parent.getContext()).load(data.getImage()).into(imageView);
//            imageView.setImageResource(data.getImage());
        }
    }
}