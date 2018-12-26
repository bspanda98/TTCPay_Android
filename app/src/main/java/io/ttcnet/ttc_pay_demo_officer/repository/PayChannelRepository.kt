package io.ttcnet.ttc_pay_demo_officer.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import io.ttcnet.ttc_pay_demo_officer.R
import io.ttcnet.ttc_pay_demo_officer.model.PayChannelModel

/**
 * Created by lwq on 2018/12/18.
 */
object PayChannelRepository {

    fun getAll():LiveData<ArrayList<PayChannelModel>>{
        var channels = ArrayList<PayChannelModel>()
        var res  = MutableLiveData<ArrayList<PayChannelModel>>()


        var channel1 = PayChannelModel()
        channel1.id = 1
        channel1.iconUncheckedResId = R.mipmap.pay_paypal_unchecked
        channel1.iconCheckedResId = R.mipmap.pay_paypal_checked
        channel1.name = "Paypal"
        channels.add(channel1)

        var channel2 = PayChannelModel()
        channel2.id = 2
        channel2.iconUncheckedResId = R.mipmap.pay_ttc_uncheced
        channel2.iconCheckedResId = R.mipmap.pay_ttc_checked
        channel2.name = "TTC Pay"
        channels.add(channel2)

//        var channel3 = PayChannelModel()
//        channel3.id = 3
//        channel3.iconUncheckedResId = R.mipmap.pay_apple_unchecked
//        channel3.name = "Apple Pay"
//        channels.add(channel3)

        var channel4 = PayChannelModel()
        channel4.id = 4
        channel4.iconUncheckedResId = R.mipmap.pay_mastercard_unchecked
        channel4.iconCheckedResId = R.mipmap.pay_mastercard_checked
        channel4.name = "Mastercard"
        channels.add(channel4)

        res.value = channels
        return res
    }
}