package com.mytravel.supertravel.adapter;

import java.util.ArrayList;

import com.mytravel.supertravel.R;
import com.mytravel.supertravel.myview.UrlImageView;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DestinationAdapter extends BaseAdapter{
	
	private Context context;
	
	public DestinationAdapter(Context context)
	{
		this.context=context;
	}
	

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View itemView = LayoutInflater.from(context).inflate(R.layout.destination_list_item, null);
		UrlImageView a=(UrlImageView)itemView.findViewById(R.id.destination_image);
		a.setImageUrl("http://www.cug.edu.cn/new/image/001/010/200593171144592.jpg");
		return itemView;
	}

}
