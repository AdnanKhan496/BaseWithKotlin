package com.adnan.kotlinbasewithcorutine.data.remote.reporitory

import com.adnan.kotlinbasewithcorutine.data.local.db.AppDao
import com.adnan.kotlinbasewithcorutine.data.remote.ApiService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiService: ApiService,
    localDataSource: AppDao
) {


     fun getPosts()  = flow { emit(apiService.getPosts()) }

}