package cn.rayest.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by Rayest on 2016/8/21 0021.
 * ������
 */

public class MyInterceptor implements Interceptor {

    public void destroy() {
        System.out.println("destroy()...");
    }

    public void init() {
        System.out.println("init()...");
    }

    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("�� Action ִ��֮ǰ");
        String result = invocation.invoke();
        System.out.println("result: " + result);
        System.out.println("�� Action ִ��֮��");
        return result;
    }
}
