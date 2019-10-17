/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Mesanger;

import java.util.Date;
import javafx.scene.chart.PieChart.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ABDULHAMIED BABA ALK
 */
@RestController
public class hello {
    
    Date date = new Date();
    
    @RequestMapping("/tiime")
    public String SayTime(){
        return date.toGMTString();
    }
    
}
