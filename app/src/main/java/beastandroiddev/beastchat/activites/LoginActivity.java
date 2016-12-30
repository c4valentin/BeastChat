package beastandroiddev.beastchat.activites;


import android.support.v4.app.Fragment;

import beastandroiddev.beastchat.fragments.LoginFragment;

public class LoginActivity extends BaseFragmentActivity {

    @Override
    Fragment createFragment() {
        return LoginFragment.newInstance();
    }
}
