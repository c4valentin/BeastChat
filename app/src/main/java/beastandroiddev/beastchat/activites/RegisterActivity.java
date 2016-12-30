package beastandroiddev.beastchat.activites;

import android.support.v4.app.Fragment;

import beastandroiddev.beastchat.fragments.RegisterFragment;

public class RegisterActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return RegisterFragment.newInstance();
    }
}
