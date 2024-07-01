package com.example.retrofit2example.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.retrofit2example.model.Company

class MainViewModel(private val repository: MainRepository):ViewModel (){
private val companyList = repository.getCompanyList()

    fun getCompanyData():LiveData<List<Company>> {
        return companyList
    }
}