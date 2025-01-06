package com.cacttus.navigationdrawergr_3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cacttus.navigationdrawergr_3.databinding.PostDetailBinding
import com.cacttus.navigationdrawergr_3.helpers.Helpers.getIntFromSharedPreferences
import com.cacttus.navigationdrawergr_3.helpers.Helpers.provideRetrofit
import com.cacttus.navigationdrawergr_3.model.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostDetailsFragment : Fragment() {
    private lateinit var binding: PostDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PostDetailBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var id = getIntFromSharedPreferences(requireContext(), "id")
        getPostById(id)
    }

    fun getPostById(id: Int) {
        provideRetrofit().getPostById(id).enqueue(object : Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                if (response.body() != null && response.isSuccessful) {
                    binding.id.text = response.body()!!.id.toString()
                    binding.userId.text = response.body()!!.userId.toString()
                    binding.title.text = response.body()!!.title
                    binding.body.text = response.body()!!.body
                }
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                Toast.makeText(requireContext(), t.message, Toast.LENGTH_SHORT).show()
            }

        })

    }


}