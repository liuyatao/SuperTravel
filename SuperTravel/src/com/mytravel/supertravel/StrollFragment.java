package com.mytravel.supertravel;

import com.mytravel.supertravel.adapter.MyPagerAdapter;
import com.mytravel.supertravel.myview.XListView.IXListViewListener;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class StrollFragment extends Fragment implements IXListViewListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View root = inflater.inflate(R.layout.strollfragment, container, false);

		final RadioGroup rGroup = (RadioGroup) root.findViewById(R.id.radioGroup);

		final ViewPager vPager = (ViewPager) root.findViewById(R.id.viewPager);
		
		MyPagerAdapter a = new MyPagerAdapter(getActivity());
		vPager.setAdapter(a);
		rGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				int item = 0;
				switch (checkedId) {
				case R.id.hot:// »»√≈
					item = 0;
					break;
				case R.id.nearby:// ∏ΩΩ¸
					item = 1;
					break;
				}
				vPager.setCurrentItem(item);
			}
		});
		vPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				int checkedId = R.id.hot;
				switch (arg0) {
				case 0:
					checkedId = R.id.hot;

					break;
				case 1:
					checkedId = R.id.nearby;
					break;
				}
				rGroup.check(checkedId);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});

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
