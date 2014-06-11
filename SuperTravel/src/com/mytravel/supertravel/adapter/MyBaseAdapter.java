package com.mytravel.supertravel.adapter;

import java.util.ArrayList;

import com.mytravel.supertravel.R;
import com.mytravel.supertravel.myview.UrlImageView;

import android.content.Context;
import android.graphics.LinearGradient;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class MyBaseAdapter extends BaseAdapter {
	ArrayList<Topicinfor> data;
	Context context;
	String tag;
	boolean is = false;

	public MyBaseAdapter(Context context, ArrayList<Topicinfor> data, String tag) {
		this.data = data;
		this.context = context;
		this.tag = tag;
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		View itemView = null;
		is=data.get(arg0).getisimage();
		if (is) {
			itemView = LayoutInflater.from(context).inflate(
					R.layout.stroll_list_item, null);
			TextView text=(TextView)itemView.findViewById(R.id.descri_tv); 
			text.setText(data.get(arg0).gettext());
			TextView name=(TextView)itemView.findViewById(R.id.qq_qa_name);  
			name.setText(data.get(arg0).getname());
			TextView time=(TextView)itemView.findViewById(R.id.topic_time); 
			time.setText(data.get(arg0).gettime());
			TextView addr=(TextView)itemView.findViewById(R.id.addresstext); 
			addr.setText(data.get(arg0).getaddr());
			UrlImageView image=(UrlImageView)itemView.findViewById(R.id.image_inte);
			image.setImageUrl(data.get(arg0).getimage());
		}
		else {
			itemView = LayoutInflater.from(context).inflate(
					R.layout.stroll_list_item2, null);
			
			TextView text=(TextView)itemView.findViewById(R.id.descri_tv); 
			text.setText(data.get(arg0).gettext());
			TextView name=(TextView)itemView.findViewById(R.id.qq_q_name);  
			name.setText(data.get(arg0).getname());
			TextView time=(TextView)itemView.findViewById(R.id.topic_time); 
			time.setText(data.get(arg0).gettime());
			TextView addr=(TextView)itemView.findViewById(R.id.addresst); 
			addr.setText(data.get(arg0).getaddr());
		}
		
		return itemView;
	}
}
