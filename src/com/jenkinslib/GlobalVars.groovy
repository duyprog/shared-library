package com.jenkinslib

class GlobalVars {
    static String foo = "bar"
    // In Pipeline static variable can be used：
    // 
    // import com.jenkinslib.GlobalVars
    // println GlobalVars.foo

    def hello(String name="bar") {
        echo "Hello, ${name}"
    }
}