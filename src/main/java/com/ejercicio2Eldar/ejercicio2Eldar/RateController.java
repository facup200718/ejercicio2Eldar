package com.ejercicio2Eldar.ejercicio2Eldar;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/transactions")
public class RateController {

    private RateService service ;

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/calculateRate",
            consumes = "application/json",
            produces = "application/json")

    public @ResponseBody Transaction calculateRate(@RequestBody Transaction transaction) throws Exception {

        try{

            service = new RateService();

            System.out.println("Monto: " + transaction.getAmount());
            System.out.println("Marca: " + transaction.getBrand());

            transaction.setRate(service.calculateRate(transaction.getBrand(), transaction.getAmount()));

            return transaction;

        }catch(BrandNotFoundException e){

            return transaction;

        }catch(Exception e2){

            return transaction;

        }

    }

}