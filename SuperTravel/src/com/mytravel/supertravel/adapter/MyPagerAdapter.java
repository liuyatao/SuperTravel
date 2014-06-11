package com.mytravel.supertravel.adapter;

import java.util.ArrayList;

import com.mytravel.supertravel.R;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MyPagerAdapter extends PagerAdapter {

	Context context;

	public MyPagerAdapter(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0 == arg1;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {

	}

	@Override
	public Object instantiateItem(View container, int position) {
		View view = null;
		Log.v("Test", position + "\tPositon");
		switch (position) {

		case 0:
			String []names={"����","֩����","������","*121*","abc","hao123","����","����","hao360","baidu"};
			String times[]={" 06-06 12:08"," 06-02 08:26"," 06-02 07:38"," 06-01 23:12"," 05-28 12:30"," 05-25 13:09"," 05-23 18:09"," 05-23 15:23"," 05-18 12:12"," 05-12 05:38"};
			String []addrs={"�й����ʴ�ѧ���人��","�й����ʴ�ѧ���人��","�й����ʴ�ѧ���人��","³ĥ·��ȹ㳡","�й����ʴ�ѧ���人��","³ĥ·��ȹ㳡","�й����ʴ�ѧ���人��","���пƼ���ѧ","³ĥ·��ȹ㳡","�й����ʴ�ѧ���人��"};
			String []texts={"����ܿ��ģ�������","���Ȱ���������������","�������Ƭ����������","����ܲ����ĺܲ����ģ�������������������","���ǵش󣡣���","�����İ�����������������������","�ش���ã�����","�������û����Ƭ��û�����û��","�⻹�ǵش�","�⻹�ǵδ�δ�δ�δ�"};
			String []path={"http://www.cug.edu.cn/new/image/001/010/20059317324793.jpg","http://www.cug.edu.cn/new/image/001/010/200593173842794.jpg","http://www.cug.edu.cn/new/image/001/010/200593172933225.jpg","http://www.cug.edu.cn/new/image/001/010/200593184048577.jpg","http://www.cug.edu.cn/new/image/001/010/200593201040508.jpg","http://www.cug.edu.cn/new/image/001/010/200593194433148.jpg","http://www.cug.edu.cn/new/image/001/010/200593195537613.jpg","http://www.cug.edu.cn/new/image/001/010/2005931799255.jpg","http://www.cug.edu.cn/new/image/001/010/200593171144592.jpg","http://www.cug.edu.cn/new/image/001/010/20059317623431.jpg"};
			boolean [] iss={false,false,true,false,true,false,true,false,true,true};

			ArrayList<Topicinfor> data = new ArrayList<Topicinfor>();
			for (int i = 1; i < 10; i++)
			{
				Topicinfor temp=new Topicinfor(names[i],times[i],addrs[i],texts[i],path[i],iss[i]);
				data.add(temp);
			}
			view = LayoutInflater.from(context)
					.inflate(R.layout.hot_pager, null);
			ListView listView = (ListView) view.findViewById(R.id.hot_listview);
			listView.setAdapter(new MyBaseAdapter(context, data, "remen"));
			break;
		case 1:
			ArrayList<Topicinfor> data1 = new ArrayList<Topicinfor>();
			String []namess={"����","֩����","������","*121*","abc","hao123","����","����","hao360","baidu"};
			String timess[]={" 06-06 12:08"," 06-02 08:26"," 06-02 07:38"," 06-01 23:12"," 05-28 12:30"," 05-25 13:09"," 05-23 18:09"," 05-23 15:23"," 05-18 12:12"," 05-12 05:38"};
			String []addrss={"�й����ʴ�ѧ���人��","�й����ʴ�ѧ���人��","�й����ʴ�ѧ���人��","³ĥ·��ȹ㳡","�й����ʴ�ѧ���人��","³ĥ·��ȹ㳡","�й����ʴ�ѧ���人��","���пƼ���ѧ","³ĥ·��ȹ㳡","�й����ʴ�ѧ���人��"};
			String []textss={"����ܿ��ģ�������","���Ȱ���������������","�������Ƭ����������","����ܲ����ĺܲ����ģ�������������������","���ǵش󣡣���","�����İ�����������������������","�ش���ã�����","�������û����Ƭ��û�����û��","�⻹�ǵش�","�⻹�ǵδ�δ�δ�δ�"};
			String []paths={"http://www.cug.edu.cn/new/image/001/010/20059317324793.jpg","http://www.cug.edu.cn/new/image/001/010/200593173842794.jpg","http://www.cug.edu.cn/new/image/001/010/200593172933225.jpg","http://www.cug.edu.cn/new/image/001/010/200593184048577.jpg","http://www.cug.edu.cn/new/image/001/010/200593201040508.jpg","http://www.cug.edu.cn/new/image/001/010/200593194433148.jpg","http://www.cug.edu.cn/new/image/001/010/200593195537613.jpg","http://www.cug.edu.cn/new/image/001/010/2005931799255.jpg","http://www.cug.edu.cn/new/image/001/010/200593171144592.jpg","http://www.cug.edu.cn/new/image/001/010/20059317623431.jpg"};
			boolean [] isss={true,true,true,false,true,false,true,false,true,true};

			for (int i = 1; i < 10; i++)
			{
				Topicinfor temps=new Topicinfor(namess[9-i],timess[i],addrss[9-i],textss[i],paths[i],isss[i]);
				data1.add(temps);
			}
			view = LayoutInflater.from(context)
					.inflate(R.layout.nearby_pager, null);
			ListView listView1 = (ListView) view.findViewById(R.id.nearby_listview);
			listView1.setAdapter(new MyBaseAdapter(context, data1,
					"fujin"));
			break;
		}
		((ViewPager) container).addView(view);
		return view;
	}

}
