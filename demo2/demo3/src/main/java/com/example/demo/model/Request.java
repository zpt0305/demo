package com.example.demo.model;

import lombok.Data;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;


public class Request implements User {
        private int id;
}
