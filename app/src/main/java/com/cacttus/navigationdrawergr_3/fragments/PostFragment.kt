package com.cacttus.navigationdrawergr_3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cacttus.navigationdrawergr_3.adapters.PostAdapter
import com.cacttus.navigationdrawergr_3.databinding.PostFragmentBinding
import com.cacttus.navigationdrawergr_3.helpers.Helpers.provideRetrofit
import com.cacttus.navigationdrawergr_3.model.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostFragment : Fragment() {
    private lateinit var binding: PostFragmentBinding
    var list : List<Post> = listOf()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PostFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGetPosts.setOnClickListener {
            getPosts()
        }
    }


    fun getPosts(){
        provideRetrofit().getPosts().enqueue(object:Callback<List<Post>>{
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (response.isSuccessful && response.body() != null) {
                    list = response.body()!!
                    var postAdapter = PostAdapter(requireContext(), list)
                    binding.postList.adapter = postAdapter
                }
            }
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                Toast.makeText(requireContext(), t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }
}