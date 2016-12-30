package beastandroiddev.beastchat.views.UserFriendViews;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import beastandroiddev.beastchat.R;
import beastandroiddev.beastchat.activites.BaseFragmentActivity;
import beastandroiddev.beastchat.entites.User;

public class UserFriendAdapter extends RecyclerView.Adapter {
    private BaseFragmentActivity mActivity;
    private List<User> mUsers;
    private LayoutInflater mInflator;
    private UserClickedListener mListener;

    public UserFriendAdapter(BaseFragmentActivity mActivity, UserClickedListener mListener) {
        this.mActivity = mActivity;
        this.mListener = mListener;
        mInflator = mActivity.getLayoutInflater();
        mUsers = new ArrayList<>();
    }


    public void setmUsers(List<User> users) {
        mUsers.clear();
        mUsers.addAll(users);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflator.inflate(R.layout.list_users_friends,parent,false);

        final UserFriendViewHolder userFriendViewHolder = new UserFriendViewHolder(view);
        userFriendViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = (User) userFriendViewHolder.itemView.getTag();
                mListener.OnUserClicked(user);
            }
        });

        return userFriendViewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((UserFriendViewHolder) holder).populate(mActivity,mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }


    public interface UserClickedListener{
        void OnUserClicked(User user);
    }
}
