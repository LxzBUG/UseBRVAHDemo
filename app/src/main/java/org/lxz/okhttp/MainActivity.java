package org.lxz.okhttp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.Button;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity implements BaseQuickAdapter.RequestLoadMoreListener{
    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView recyclerView;
    Gson gson;
    ThisAdapter adapter;
    int PageNum=2;
    Bean bean;
    Button ha;
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 0://下拉刷新
                    adapter.setNewData(bean.getResult());
                    swipeRefreshLayout.setRefreshing(false);
                    PageNum=2;
                    break;
                case 1://上拉加载
                    List<Bean.ResultBean> result = bean.getResult();
                    if (result.size()==0){
                        adapter.loadComplete();
                    }else {
                        adapter.addData(result);
                        PageNum++;
                    }

                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gson=new Gson();
        ha= (Button) findViewById(R.id.ha);
        swipeRefreshLayout= (SwipeRefreshLayout) findViewById(R.id.srf);
        recyclerView= (RecyclerView) findViewById(R.id.recy);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        swipeRefreshLayout.setOnRefreshListener(o);
        adapter=new ThisAdapter();
        adapter.openLoadAnimation();
        adapter.setOnLoadMoreListener(this);
        adapter.openLoadMore(20);
        recyclerView.setAdapter(adapter);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(true);
                o.onRefresh();
            }
        },100);
    }
    SwipeRefreshLayout.OnRefreshListener o=new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {


            OkHttpUtils.get().url("http://120.55.242.181:8080/esmall-admin/goods/goodsCommon/listForJson?pageNo=1")
                    .build()
                    .execute(new StringCallback() {
                        @Override
                        public void onError(Call call, Exception e, int id) {

                        }

                        @Override
                        public void onResponse(String response, int id) {
                            if (!TextUtils.isEmpty(response)){
                                bean=gson.fromJson(response.toString(),Bean.class);
                                handler.sendEmptyMessage(0);

                            }
                    }
                    });
        }
    };

    @Override
    public void onLoadMoreRequested() {
        OkHttpUtils.get().url("http://120.55.242.181:8080/esmall-admin/goods/goodsCommon/listForJson?pageNo="+(PageNum))
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if (!TextUtils.isEmpty(response)){
                            bean=gson.fromJson(response.toString(),Bean.class);
                            handler.sendEmptyMessage(1);
                        }
                    }
                });
    }
}
