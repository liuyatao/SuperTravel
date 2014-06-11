package com.mytravel.supertravel;

import com.mytravel.supertravel.adapter.DestinationAdapter;
import com.mytravel.supertravel.myview.XListView;
import com.mytravel.supertravel.myview.XListView.IXListViewListener;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DestinationFragment extends Fragment implements IXListViewListener{

	private XListView  mylist;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View root = inflater.inflate(R.layout.destinationfragment, container,
				false);
		mylist=(XListView)root.findViewById(R.id.destination_id);
		DestinationAdapter a=new DestinationAdapter(getActivity());
		mylist.setAdapter(a);
		return root;
	}

	@Override
	public void onRefresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoadMore() {
		// TODO Auto-generated method stub
		
	}

}
