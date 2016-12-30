package beastandroiddev.beastchat.activites;

import android.support.v4.app.Fragment;

import beastandroiddev.beastchat.fragments.FriendFragment;

public class FriendActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return FriendFragment.newInstance();
    }
}
