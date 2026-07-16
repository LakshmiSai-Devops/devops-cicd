cat > ~/devops-cicd/src/main/java/com/devops/springbootapp/HomeController.java << 'EOF'
package com.devops.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to DevOps CI/CD Project!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running successfully!";
    }
}
EOF
