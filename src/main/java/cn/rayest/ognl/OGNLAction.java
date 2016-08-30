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
 * ognl: ֵջ
 */
public class OGNLAction extends ActionSupport {

    // ���� JavaBean ����
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    // ���� JavaBean ����
    private List<People> peopleList;

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    // ���� JavaBean �� map ��������
    private Map<String, Lover> lovers;

    public Map<String, Lover> getLovers() {
        return lovers;
    }

    public void setLovers(Map<String, Lover> lovers) {
        this.lovers = lovers;
    }

    public String execute() throws Exception {

        // ��ȡ actionContext ���󣬲�ͨ���ö����ȡ��ֵջ��session��application ����
        ActionContext actionContext = ActionContext.getContext();

        // ��ȡֵջ����
        ValueStack valueStack = actionContext.getValueStack();
        // ����ֵջ
        valueStack.set("����", "����");
        valueStack.set("����", "18");

        // ���� session ����
        Map<String, Object> session = actionContext.getSession();
        session.put("name", "Selina");
        session.put("age", "19");

        // ���� application ����
        Map<String, Object> application = actionContext.getApplication();
        application.put("name", "Allen");
        application.put("age", "20");

        // ���� javaBean ����
        person = new Person("Pay", 22);

        // ���� javaBean ��������
        peopleList = new ArrayList<People>();
        peopleList.add(new People("Paris", 23));
        peopleList.add(new People("Candy", 24));
        peopleList.add(new People("����", 22));

        // ���� JavaBean �� Map ����
        lovers = new HashMap<String, Lover>();
        lovers.put("2010", new Lover("����", 18));
        lovers.put("2011", new Lover("����", 19));
        lovers.put("2012", new Lover("����", 20));
        lovers.put("2013", new Lover("����", 21));
        lovers.put("2014", new Lover("����", 22));
        lovers.put("2015", new Lover("����", 22));
        lovers.put("2016", new Lover("����", 23));

        return SUCCESS;
    }
}
