package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Controller
public class HomeController {



    private static String HOME = "home";
    @GetMapping()
    public String home(){
        return HOME;
    }

    private static String HOME2 = "home2";
    @GetMapping("/Faisal")
    public String home2(){
        return HOME2;
    }

    private static String HOME3 = "home3";
    @GetMapping("/Prince")
    public String home3(){
        return HOME3;
    }

    HashMap Hmap = new HashMap();

    Hmap.put(1, "Alex");
    Hmap.put(2, "Alex2");
    Hmap.put(3, "Alex3");
    Hmap.put(4, "Alex4");
    Hmap.put(5, "Alex5");

    Set set = Hmap.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
    Map.Entry mentry = (Map.Entry)iterator.next();
    System.out.print

    }
