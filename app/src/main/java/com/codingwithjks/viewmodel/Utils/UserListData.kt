package com.codingwithjks.viewmodel.Utils

import com.codingwithjks.viewmodel.Model.User


object UserListData{

    fun setUserList():List<User>
    {
        var userList:ArrayList<User> = ArrayList()
        userList.add(User("jayant"))
        userList.add(User("sneha"))
        userList.add(User("aashish"))
        userList.add(User("aman"))
        userList.add(User("diksha"))
        userList.add(User("patel"))
        userList.add(User("naman"))
        userList.add(User("hitesh"))
        userList.add(User("nitin"))
        userList.add(User("priya"))
        return userList
    }
}
