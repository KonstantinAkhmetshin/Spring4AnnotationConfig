/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbottle.controllers;

import com.outbottle.services.CashMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author john
 */
@Controller
public class DefaultController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/pin", method = RequestMethod.GET)
    public String pin(@RequestParam("cardNumber") String pan, ModelMap map) {
        map.put("cardNumber", pan);
        map.put("cardInfo",null);
        return "pin";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public void stub() {
    }
}
