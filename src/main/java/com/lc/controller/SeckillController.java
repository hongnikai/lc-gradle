package com.lc.controller;

import com.lc.entity.Seckill;
import com.lc.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
@RequestMapping("/seckill")
public class SeckillController {



    @Autowired
    private SeckillService seckillService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        //list.jsp + model = ModelAndView
        //获取列表页

        List<Seckill> list = seckillService.getSeckillList();
        model.addAttribute("list", list);

        return "list";
    }


    @RequestMapping(value = "/listJson", method = RequestMethod.GET)
    @ResponseBody
    public List<Seckill>  listJson(Model model) {
        List<Seckill> list = seckillService.getSeckillList();
        return list;
    }

}
