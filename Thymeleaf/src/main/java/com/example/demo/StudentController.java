package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;

@Controller
public class StudentController {

    Logger log = Logger.getLogger(StudentController.class.getName());

    ArrayList<Student> students = new ArrayList<>();

    public StudentController(){

        students.add(new Student(1, "Alex", "Banke", "kek@lol.com"));
        students.add(new Student(1, "Alex2", "Backer", "kek2@lol.com"));
        students.add(new Student(1, "Alex3", "Chrillesen", "kek3@lol.com"));
        students.add(new Student(1, "Alex4", "Banke2", "kek4@lol.com"));


    }

    @GetMapping
    public String index(Model model){
        log.info("Index called...");
        log.fine("Index: 0 -> " + students.get(0));

        model.addAttribute("HvadSomHelst", students);

        return "Index";
    }

    HashMap tables = new HashMap();

    @PutMapping
    tables.put("StudentController")

}
