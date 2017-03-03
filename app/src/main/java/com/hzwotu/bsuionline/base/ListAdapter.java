package com.hzwotu.bsuionline.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hzwotu.bsuionline.R;
import com.hzwotu.bsuionline.util.HttpClient;
import com.loopj.android.http.BinaryHttpResponseHandler;

import java.util.List;

import cz.msebera.android.httpclient.Header;

import static android.R.attr.data;

/**
 * Created by RaphetS on 2016/10/16.
 */

public class ListAdapter extends ArrayAdapter {

    private int resourceId;

    public ListAdapter(Context context, List<TestList> mDatas, int mLayoutId) {
        super(context, mLayoutId, mDatas);
        this.resourceId = mLayoutId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        TestList list = (TestList) getItem(position);
        LinearLayout userListItem = new LinearLayout(getContext());
        String inflater = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater vi = (LayoutInflater)getContext().getSystemService(inflater);
        vi.inflate(resourceId, userListItem, true);

        TextView name = (TextView)userListItem.findViewById(R.id.name);
        TextView url = (TextView)userListItem.findViewById(R.id.url);
        TextView img = (TextView) userListItem.findViewById(R.id.img);
        name.setText(list.getName(position));
        url.setText(list.getUrl(position));
        img.setText(list.getImg(position));
        return userListItem;
    }


}
