package cn.rayest.tags;

import com.opensymphony.xwork2.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rayest on 2016/7/20 0020.
 */
public class Checkboxlist {
    private List<String> favorite = new ArrayList<String>();
    public String execute(){
        favorite.add("Apple");
        favorite.add("Banana");
        return Action.SUCCESS;
    }
}
