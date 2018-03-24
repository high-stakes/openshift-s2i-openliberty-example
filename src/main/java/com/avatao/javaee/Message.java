package com.avatao.javaee;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class Message {

    public static final String XSS_PAYLOAD = "<script>alert('You are under attack!');</script>";
    public static final String XSS_PAYLOAD_ESCAPED = "&lt;script&gt;alert('You are under attack!');&lt;/script&gt;";

    public String readInsecureHtml() {
        return XSS_PAYLOAD;
    }
}