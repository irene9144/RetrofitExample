package com.example.retrofit2example.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coroutineexample2.adapter.CompanyAdapter
import com.example.retrofit2example.R
import com.example.retrofit2example.adapter.UserAdapter
import com.example.retrofit2example.api.RetrofitInstance
import com.example.retrofit2example.databinding.ActivityMainBinding
import com.example.retrofit2example.viewmodel.MainRepository
import com.example.retrofit2example.viewmodel.MainViewModel
import com.example.retrofit2example.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels {
        MainViewModelFactory(MainRepository(RetrofitInstance.getApiService()))
    }
    private lateinit var adapter: CompanyAdapter
    private lateinit var userAdapter: UserAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

//        viewModel.companyList.observe(this, Observer {companyList ->
//            Log.e("smkwon","companyList -- > $companyList")
//            binding.recyclerView.adapter = CompanyAdapter(companyList)
//
//        })
        viewModel.userList.observe(this, Observer {userList ->
            Log.e("smkwon","companyList -- > $userList")
            binding.recyclerView.adapter = UserAdapter(userList)

        })

    }
}