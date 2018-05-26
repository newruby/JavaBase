package com.ty.com.base.io;

/**
 * created by TY on 2018/5/26.
 */
/**  对FileReader中的close方法进行扩展
 *    1.继承 不推荐代码耦合度太高，不利于项目的扩展
 *    2.装饰者模式
 * @param
 * @return
 */
public class FileReader extends Reader {
    @Override
    public void close() {
        System.out.println("FileReader closed");
    }
}
