package controllerdemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String getName(@RequestParam String name) {
        return "Hello, " + name;
    }

    @PostMapping
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }
}