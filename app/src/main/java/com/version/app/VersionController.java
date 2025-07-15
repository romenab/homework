package com.version.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class VersionController {

    @GetMapping("/GetApplicationVersion")
    public String getVersion() throws Exception {
        return Files.readString(Paths.get("src/main/resources/version.txt")).trim();
    }
}
