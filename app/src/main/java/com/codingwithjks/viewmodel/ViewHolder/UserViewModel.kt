package com.codingwithjks.viewmodel.ViewHolder

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codingwithjks.viewmodel.Model.User
import com.codingwithjks.viewmodel.Utils.UserListData

class UserViewModel : ViewModel(){
    val userList:MutableLiveData<List<User>> = MutableLiveData()

    fun getUserList()
    {
        val user=UserListData.setUserList()
        userList.value=user
    }
}