package com.ty.com.base.ObjectOriented.Class.InnerClass;

/**
 * created by TY on 2018/5/13.
 */
/**
 *匿名内部类
 * @param
 * @return
 */
public class OuterClass4 {
    //静态方法
    public static void t(CustomerSerivice c) {
        c.logout();
    }

    public static void main(String[] args) {
////创建接口实现类的方法调用logout调用t
//        t(new CustomerServiceImpl());
        t(new CustomerSerivice() {
            //创建匿名内部类的方法调用t
            //new CustomerSerivice() {} 匿名内部类
            @Override
            public void logout() {
                System.out.println("TY");
            }
        });

    }

}

interface CustomerSerivice {
    void logout();
}

////创建接口实现类的方法调用logout
//class CustomerServiceImpl implements CustomerSerivice {
//    @Override
//    public void logout() {
//        System.out.println("System LOGOUT");
//    }
//}
