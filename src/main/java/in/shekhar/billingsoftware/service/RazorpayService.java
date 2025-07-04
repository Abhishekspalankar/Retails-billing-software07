package in.shekhar.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.shekhar.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
