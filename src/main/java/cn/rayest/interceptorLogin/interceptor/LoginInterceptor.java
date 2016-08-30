package cn.rayest.interceptorLogin.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Rayest on 2016/8/21 0021.
 */
public class LoginInterceptor implements Interceptor {
    public void destroy() {
        System.out.println("destroy()...");
    }

    public void init() {
        System.out.println("init()...");
    }

    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("在 LoginInterceptor 之前执行");
        ActionContext actionContext = invocation.getInvocationContext();
        Map<String, Object> sessions = actionContext.getSession();
        Object currentUser = sessions.get("currentUser");
        String result = null;
        if (currentUser != null) {
            result = invocation.invoke();
        } else {
            HttpServletRequest request = (HttpServletRequest) invocation.getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
            request.setAttribute("error", "请先登录！");
            result = "error";
        }
        System.out.println("result: " + result);
        System.out.println("在 LoginInterceptor 之后执行");
        return result;
    }
}
