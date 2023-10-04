package ie.atu.week2_lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cAlc_mAnager {


        @GetMapping("/calculate/{num1}/{num2}/{operation}")
                public int Calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation) {

                switch (operation) {
                    case ("add"):
                        return num1 + num2;


                    case ("subtract"):
                        return num1 - num2;


                    case ("divide"):
                        return num1 / num2;


                    case ("multiply"):
                        return num1 * num2;


                    default:
                        throw new IllegalStateException("Unexpected value: " + operation);
                }

        }
    }
