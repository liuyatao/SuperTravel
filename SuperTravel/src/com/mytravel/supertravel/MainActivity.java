package com.mytravel.supertravel;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity {

	/**
	 * 用于展示逛逛的Fragment
	 */
	private StrollFragment strollfragment = null;

	/**
	 * 用于展示目的地的Fragment
	 */
	private DestinationFragment destinationfragment = null;

	/**
	 * 用于展示日记的Fragment
	 */
	private DiaryFragment diaryfragment = null;

	/**
	 * 用于展示个人主页的Fragment
	 */
	private MySpaceFragment myspacefragment = null;

	/**
	 * 逛逛按钮
	 */
	private RadioButton stroll_button;
	/**
	 * 目的地按钮
	 */
	private RadioButton destination_buttom;
	/**
	 * 日记按钮
	 */
	private RadioButton diary_button;
	/**
	 * 个人主页按钮
	 */
	private RadioButton myspace_button;
	/**
	 * Radiobutton组控件
	 */
	private RadioGroup bottom_menu;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initView();
	}

	/**
	 * 在这里获取到每个需要用到的控件的实例，并给它们设置好必要的点击事件。
	 */
	private void initView() {
		stroll_button = (RadioButton) this.findViewById(R.id.stroll_button);
		destination_buttom = (RadioButton) this
				.findViewById(R.id.destion_button);
		diary_button = (RadioButton) this.findViewById(R.id.diary_button);
		myspace_button = (RadioButton) this.findViewById(R.id.myspace_button);
		bottom_menu = (RadioGroup) this.findViewById(R.id.bottom_menu);

		stroll_button.setChecked(true);


		setTabSelection(0);
		OnCheckedChangeListener mylistener = new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if (checkedId == stroll_button.getId()) {
					setTabSelection(0);

				} else if (checkedId == destination_buttom.getId()) {
					setTabSelection(1);

				} else if (checkedId == diary_button.getId()) {
					setTabSelection(2);

				} else if (checkedId == myspace_button.getId()) {
					setTabSelection(3);
				}

			}
		};
		bottom_menu.setOnCheckedChangeListener(mylistener);

	}

	/**
	 * 根据传入的index参数来设置选中的tab页。
	 * 
	 * @param index
	 *            每个tab页对应的下标。0表示消息，1表示联系人，2表示动态，3表示设置。
	 */
	private void setTabSelection(int index) {
		// 开启一个Fragment事务
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		// 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
		hideFragments(transaction);
		switch (index) {
		case 0:
			// 当点击了消息tab时，改变状态
			if (strollfragment == null) {
				// 如果strollfragment为空，则创建一个并添加到界面上
				strollfragment = new StrollFragment();
				transaction.add(R.id.main_contain, strollfragment);
			} else {
				// 如果strollfragment不为空，则直接将它显示出来
				transaction.show(strollfragment);
			}
			break;
		case 1:
			// 当点击了消息tab时，改变状态
			if (destinationfragment == null) {
				// 如果destinationfragment为空，则创建一个并添加到界面上
				destinationfragment = new DestinationFragment();
				transaction.add(R.id.main_contain, destinationfragment);
			} else {
				// 如果destinationfragment不为空，则直接将它显示出来
				transaction.show(destinationfragment);
			}
			break;
		case 2:
			// 当点击了消息tab时，改变状态
			if (diaryfragment == null) {
				// 如果diaryfragment为空，则创建一个并添加到界面上
				diaryfragment = new DiaryFragment();
				transaction.add(R.id.main_contain, diaryfragment);
			} else {
				// 如果diaryfragment不为空，则直接将它显示出来
				transaction.show(diaryfragment);
			}
			break;
		case 3:
			// 当点击了消息tab时，改变状态
			if (myspacefragment == null) {
				// 如果myspacefragment为空，则创建一个并添加到界面上
				myspacefragment = new MySpaceFragment();
				transaction.add(R.id.main_contain, myspacefragment);
			} else {
				// 如果myspacefragment不为空，则直接将它显示出来
				transaction.show(myspacefragment);
			}
			break;
		}
		transaction.commit();
	}

	/**
	 * 将所有的Fragment都置为隐藏状态。
	 * 
	 * @param transaction
	 *            用于对Fragment执行操作的事务
	 */
	private void hideFragments(FragmentTransaction transaction) {
		if (strollfragment != null) {
			transaction.hide(strollfragment);
		}
		if (destinationfragment != null) {
			transaction.hide(destinationfragment);
		}
		if (diaryfragment != null) {
			transaction.hide(diaryfragment);
		}
		if (myspacefragment != null) {
			transaction.hide(myspacefragment);
		}
	}

}
