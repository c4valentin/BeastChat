package beastandroiddev.beastchat.activites;

import android.support.v4.app.Fragment;

import beastandroiddev.beastchat.fragments.ProfileFragment;

public class ProfileActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return ProfileFragment.newInstance();
    }
}
