package com.hacknight.expensebot.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

public class FragmentAdapter extends FragmentPagerAdapter{

	public FragmentAdapter(FragmentActivity activity) {
		super(activity.getSupportFragmentManager());
	}
	
	public FragmentAdapter(FragmentManager fm){
		super(fm);
	}
	
	

//	@Override
//	public int getIconResId(int index) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		Fragment fragment = new ExpenseSummaryFragment();
		switch (position) {
		case 0:
			fragment = new ExpenseSummaryFragment();
			break;
		case 1:
			fragment = new ExpenseListFragment();
			break;
		}
		return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		String title = "";
		switch (position) {
		case 0:
			title = "SUMMARY";
			break;
		case 1:
			title = "LIST";
			break;
		}
		return title;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		// TODO Auto-generated method stub
		if (object != null) {
			return ((Fragment)object).getView() == view;
		} else {
			return false;
		}
	}
	
	

}