package com.itheima.springmvc.controller;

import com.itheima.springmvc.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ItemController {
    //.action可以省略
    @RequestMapping("/itemList.action")
    public ModelAndView itemList() {
        //查询商品列表
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1,"imac", 20000, new Date(), "苹果本很贵"));
        itemList.add(new Item(2,"imac1", 20000, new Date(), "苹果本很贵"));
        itemList.add(new Item(3,"imac2", 20000, new Date(), "苹果本很贵"));
        itemList.add(new Item(4,"imac3", 20000, new Date(), "苹果本很贵"));
        itemList.add(new Item(5,"imac4", 20000, new Date(), "苹果本很贵"));
        //把商品列表传递给jsp是 多少多少
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList", itemList);
        //设置展示数据的jsp
        //modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
        //配置完视图解析器后只需要返回jsp的名称即可
        modelAndView.setViewName("itemList");
        //返回结果
        return modelAndView;

    }
}
