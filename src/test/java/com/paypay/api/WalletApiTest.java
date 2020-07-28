package com.paypay.api;

import com.paypay.ApiException;
import com.paypay.model.ProductType;
import com.paypay.model.WalletBalance;

import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for WalletApi
 */
@Ignore
public class WalletApiTest {

    private final WalletApi api = new WalletApi();

    
    /**
     * Check user wallet balance
     *
     * Check if user has enough balance to make a payment  **Timeout: 15s** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkWalletBalanceTest() throws ApiException {
        
        String userAuthorizationId = null;
        
        Integer amount = null;
        
        String currency = null;
        
        ProductType productType = null;
        
        WalletBalance response = api.checkWalletBalance(userAuthorizationId, amount, currency, productType);

        // TODO: test validations
    }
    
}
