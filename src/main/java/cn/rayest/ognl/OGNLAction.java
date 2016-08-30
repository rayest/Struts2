package cn.rayest.ognl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rayest on 2016/8/21 0021.
 * ognl: 值栈
 */
public class OGNLAction extends ActionSupport {

    // 引用 JavaBean 对象
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    // 引用 JavaBean 集合
    private List<People> peopleList;

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    // 引用 JavaBean 的 map 类型数据
    private Map<String, Lover> lovers;

    public Map<String, Lover> getLovers() {
        return lovers;
    }

    public void setLovers(Map<String, Lover> lovers) {
        this.lovers = lovers;
    }

    public String execute() throws Exception {

        // 获取 actionContext 对象，并通过该对象获取：值栈、session、application 对象
        ActionContext actionContext = ActionContext.getContext();

        // 获取值栈对象
        ValueStack valueStack = actionContext.getValueStack();
        // 设置值栈
        valueStack.set("姓名", "裴甜");
        valueStack.set("年龄", "18");

        // 设置 session 对象
        Map<String, Object> session = actionContext.getSession();
        session.put("name", "Selina");
        session.put("age", "19");

        // 设置 application 对象
        Map<String, Object> application = actionContext.getApplication();
        application.put("name", "Allen");
        application.put("age", "20");

        // 设置 javaBean 属性
        person = new Person("Pay", 22);

        // 设置 javaBean 集合属性
        peopleList = new ArrayList<People>();
        peopleList.add(new People("Paris", 23));
        peopleList.add(new People("Candy", 24));
        peopleList.add(new People("裴甜", 22));

        // 设置 JavaBean 的 Map 属性
        lovers = new HashMap<String, Lover>();
        lovers.put("2010", new Lover("裴甜", 18));
        lovers.put("2011", new Lover("裴甜", 19));
        lovers.put("2012", new Lover("裴甜", 20));
        lovers.put("2013", new Lover("裴甜", 21));
        lovers.put("2014", new Lover("裴甜", 22));
        lovers.put("2015", new Lover("裴甜", 22));
        lovers.put("2016", new Lover("裴甜", 23));

        return SUCCESS;
    }
}
