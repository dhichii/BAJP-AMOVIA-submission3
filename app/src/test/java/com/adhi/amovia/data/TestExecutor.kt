package com.adhi.amovia.data

import java.util.concurrent.Executor

class TestExecutor : Executor {
    override fun execute(p0: Runnable) {
        p0.run()
    }
}