package com.maven.ktServer.demo

class TEst {


    fun main() {
        var add = fun(): () -> Int {
            var counter = 0
            return  {
                counter += 1
                counter
            }
        }
        add()
        add()
        add()
    }
}