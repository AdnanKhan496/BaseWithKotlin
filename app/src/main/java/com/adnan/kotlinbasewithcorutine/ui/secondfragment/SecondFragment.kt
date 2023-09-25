package com.adnan.kotlinbasewithcorutine.ui.secondfragment

import com.adnan.kotlinbasewithcorutine.BR
import com.adnan.kotlinbasewithcorutine.R
import com.adnan.kotlinbasewithcorutine.baseclasses.BaseFragment
import com.adnan.kotlinbasewithcorutine.databinding.LayoutSecondBinding
import com.adnan.kotlinbasewithcorutine.ui.firstfragment.FirstViewModel

class SecondFragment : BaseFragment<LayoutSecondBinding, SecondViewModel>() {

    override val layoutId: Int
        get() = R.layout.layout_second
    override val viewModel: Class<SecondViewModel>
        get() = SecondViewModel::class.java
    override val bindingVariable: Int
        get() = BR.viewModel
}