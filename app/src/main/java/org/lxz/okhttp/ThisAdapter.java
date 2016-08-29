package org.lxz.okhttp;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by liuxiaozhong on 2016/8/26.
 */
public class ThisAdapter extends BaseQuickAdapter<Bean.ResultBean> {


    public ThisAdapter() {
        super(R.layout.item,null);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, Bean.ResultBean resultBean) {
            baseViewHolder.setText(R.id.goods_name,resultBean.getGoodsName());
            baseViewHolder.setText(R.id.gc_name,resultBean.getGcName());
    }
}
