package com.icefrozen.loan.system

import org.springframework.core.task.SimpleAsyncTaskExecutor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class SystemHealthDetectionController {

    @GetMapping("/active/status")
    fun activeStatus() {
        val executor = SimpleAsyncTaskExecutor()
        executor.execute {
            print("hello")
        }

        print("world")
        return
    }
}