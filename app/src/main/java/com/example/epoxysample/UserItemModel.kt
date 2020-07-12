package com.example.epoxysample

import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass(layout = R.layout.layout_item)
abstract class UserItemModel : EpoxyModelWithHolder<UserItemModel.Holder>() {

    @EpoxyAttribute lateinit var user: User

    override fun bind(holder: Holder) {
        with(user) {
            holder.name.text = name
            holder.email.text = email
            holder.age.text = age.toString()
        }
    }

    class Holder : BaseEpoxyHolder() {
        val name: TextView by bind(R.id.name)
        val email: TextView by bind(R.id.email)
        val age: TextView by bind(R.id.age)
    }
}
