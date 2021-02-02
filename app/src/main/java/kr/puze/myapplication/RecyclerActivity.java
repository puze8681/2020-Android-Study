package kr.puze.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kr.puze.myapplication.Adapter.ItemRecyclerAdapter;
import kr.puze.myapplication.Data.ItemData;

public class RecyclerActivity extends AppCompatActivity {

    // recyclerview 의 item 들의 간격
    // image 를 불러올 수 있다
    // vertical scroll
    // 다른 모양의 헤더를 만든다

    // Adapter 의 선언
    private ItemRecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private TextView buttonRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        // xml 에서의 recyclerView 를 Activity 와 연결
        recyclerView = findViewById(R.id.recycler_recycler);
        buttonRecycler = findViewById(R.id.button_recycler);
        // recyclerView 에게 layoutManager 할당
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        // 선언했던 adapter 를 초기화
        adapter = new ItemRecyclerAdapter();
        // recyclerView 에 adapter 할당
        recyclerView.setAdapter(adapter);
        getData();
        buttonRecycler.setOnClickListener(view -> {
            adapter.addItem(new ItemData("https://i.pinimg.com/originals/05/1f/f3/051ff3fb781ff83c9b0f8a32f9922fa6.png", "new name", "new desc"));
            adapter.notifyDataSetChanged();
        });
    }

    private void getData(){
        // adapter 에 item (데이터) 추가
        for(int i = 0; i <= 9; i++) adapter.addItem(new ItemData("https://i.pinimg.com/originals/05/1f/f3/051ff3fb781ff83c9b0f8a32f9922fa6.png", "이름" + i, "소개" + i));
        // adapter 재시동
        adapter.notifyDataSetChanged();
    }
}