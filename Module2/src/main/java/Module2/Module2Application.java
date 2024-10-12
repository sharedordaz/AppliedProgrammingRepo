package Module2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*Local Imports*/
import Module2.Service;


@RestController
@SpringBootApplication
public class Module2Application {
    
    @RequestMapping
    Service init(){
        return new Service("Technical Support", 500, null);
    }
	public static void main(String[] args) {

		SpringApplication.run(Module2Application.class, args);
	}

}
