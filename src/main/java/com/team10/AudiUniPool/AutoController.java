package com.team10.AudiUniPool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    
    Auto v1 = new Auto(1, "a1", "123");
    Auto v2 = new Auto(2, "a8", "Cr");
    Auto v3 = new Auto(3, "a3", "321");
    Auto v4 = new Auto(4, "q7", "asd");
    Auto v5 = new Auto(5, "a6", "tyu");
    Auto v6 = new Auto(6, "a5", "zxc");
    
    List<Auto> cars = Arrays.asList(v1,v2,v3,v4,v5,v6);

    @RequestMapping("/list")
    public List<Auto> list() {
        return cars;
    }
	
}
