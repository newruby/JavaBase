package com.ty.com.base.arrays;

/**
 * created by TY on 2018/5/13.
 */
/**
 *  需求说明：运行该软件必须提供用户名和密码
 * 格式：java ArrayTest2 username password
 * @param
 * @return
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("若要登录系统 必须这样输入");
            return;
        }

        String username = args[0];
        String password = args[1];
        //"admin".equals(username)保证不会空指针异常
        if("admin".equals(username) && "1234".equals(password)) {
            System.out.println("登陆成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
