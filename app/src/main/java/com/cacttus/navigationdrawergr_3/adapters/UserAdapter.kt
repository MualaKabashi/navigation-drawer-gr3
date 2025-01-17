package com.cacttus.navigationdrawergr_3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cacttus.navigationdrawergr_3.databinding.UserItemBinding
import com.cacttus.navigationdrawergr_3.model.User

class UserAdapter(var userList: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    class UserViewHolder(var binding: UserItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindUser(user: User) {
            binding.user = user
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var layout = LayoutInflater.from(parent.context)
        var binding = UserItemBinding.inflate(layout, parent, false)

        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindUser(userList[position])
    }
}