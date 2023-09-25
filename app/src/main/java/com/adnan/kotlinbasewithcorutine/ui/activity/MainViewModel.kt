package com.adnan.kotlinbasewithcorutine.ui.activity

import com.adnan.kotlinbasewithcorutine.baseclasses.BaseViewModel
import com.adnan.kotlinbasewithcorutine.data.remote.reporitory.MainRepository
import com.adnan.kotlinbasewithcorutine.utils.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : BaseViewModel()
