package se.campusmolndal.ecodemomo.controller;

import com.stripe.exception.StripeException;
import se.campusmolndal.ecodemomo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/charge")
    public String chargeCard(@RequestParam(value = "token") String token, @RequestParam(value = "amount") int amount) throws StripeException {
        return paymentService.charge(token, amount).getId();
    }

    @PostMapping("/create-checkout-session")
    public String createCheckoutSession() throws StripeException {
        return paymentService.createCheckoutSession();
    }
}