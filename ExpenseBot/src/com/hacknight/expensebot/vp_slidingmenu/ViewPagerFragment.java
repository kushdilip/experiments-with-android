package com.hacknight.expensebot.vp_slidingmenu;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hacknight.expensebot.R;

public class ViewPagerFragment extends SlidingFragment implements OnPageChangeListener {

//	private int mColorRes = -1;

	public ViewPagerFragment() {
		//this(R.color.white);
	}

//	public ViewPagerFragment(int colorRes) {
////		mColorRes = colorRes;
//		setRetainInstance(true);
//	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//if (savedInstanceState != null)
		//	mColorRes = savedInstanceState.getInt("mColorRes");
//		int color = getResources().getColor(mColorRes);
		
		// construct the RelativeLayout
//		RelativeLayout v = new RelativeLayout(getActivity());
//		v.setBackgroundColor(color);
//		
		ViewPager vp = new ViewPager(getActivity());
		vp.setId("VP".hashCode());
		vp.setAdapter(new ColorPagerAdapter(getActivity().getSupportFragmentManager()));
		View v = vp;
		
		vp.setOnPageChangeListener(this);
		vp.setCurrentItem(0);
		
		return v;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		setUserVisibleHint(true);
//		outState.putInt("mColorRes", mColorRes);
	}
	
public class ColorPagerAdapter extends FragmentPagerAdapter {
		
		private ArrayList<Fragment> mFragments;
		
		private final int[] COLORS = new int[] {
				R.color.red,
				R.color.green,
				R.color.blue,
				R.color.white,
				R.color.black
		};

		public ColorPagerAdapter(FragmentManager fm) {
			super(fm);
			mFragments = new ArrayList<Fragment>();
			for (int color : COLORS) {
				mFragments.add(new ColorFragment(color));
			}
		}
		
		@Override
		public Fragment getItem(int position) {
			return mFragments.get(position);
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mFragments.size();
		}
	}


	@Override
	public void onPageScrollStateChanged(int position) {
		switch (position) {
		case 0:
			//getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
			break;
		default:
//			 getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
			break;
		}
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {}

	@Override
	public void onPageSelected(int arg0) {}
}
