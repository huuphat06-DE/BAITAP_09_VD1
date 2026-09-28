package vn.iotstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    // Note: AuthService is not provided in Example 1 PDF, so we omit it to allow compilation
    // The Spring Security config handles the actual login processing.
    
    @GetMapping("/login")
    String login() { 
        return "auth/login"; 
    }
}
