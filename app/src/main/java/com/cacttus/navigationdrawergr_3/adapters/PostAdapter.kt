package com.cacttus.navigationdrawergr_3.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.cacttus.navigationdrawergr_3.R
import com.cacttus.navigationdrawergr_3.model.Post

class PostAdapter(var context: Context, var list: List<Post>) : BaseAdapter() {
    var layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
            as LayoutInflater

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var rowView = layoutInflater.inflate(R.layout.post_item, p2, false)

        var id = rowView.findViewById<TextView>(R.id.postId)
        var userId = rowView.findViewById<TextView>(R.id.userId)
        var title = rowView.findViewById<TextView>(R.id.title)
        var body = rowView.findViewById<TextView>(R.id.body)

        id.text = "Id:" + list[p0].id.toString()
        userId.text = "UserId:" + list[p0].userId.toString()
        title.text = "Title" + list[p0].title
        body.text = "Body: " + list[p0].body

        return rowView
    }
}