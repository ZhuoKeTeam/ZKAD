package com.zkteam.ad

class ZKADManager {

    companion object {
        // 双重校验锁式（Double Check)
        val instance: ZKADManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            ZKADManager()
        }
    }

    /**
     * 初始化相关东西
     */
    fun init() {

    }
}