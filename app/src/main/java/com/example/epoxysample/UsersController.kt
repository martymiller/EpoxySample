package com.example.epoxysample

import com.airbnb.epoxy.TypedEpoxyController

class UsersController : TypedEpoxyController<List<User>>() {

    override fun buildModels(users: List<User>) {
        users.forEach { user ->
            userItem {
                id(user.name)
                user(user)
            }
        }
    }
}
