package org.devops

//颜色输出
def PrintMes(value,color){
    //定义字典
    colors = ['red'    : "\033[1;31m>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<\033[0m",
              'yellow' : "\033[1;33m>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<\033[0m",
              'blue'   : "\033[1;34m>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<\033[0m",
              'green'  : "\033[1;32m>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<<<\033[0m" ]
    //调用
    ansiColor('xterm') {
        println(colors[color])
    }
}
