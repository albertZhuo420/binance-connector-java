/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.AllOrderListResponse;

/** API examples for AccountApi */
public class AllOrderListExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query all Order lists
     *
     * <p>Retrieves all order lists based on provided optional parameters. Note that the time
     * between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
     * Weight: 20
     *
     * @throws ApiException if the Api call fails
     */
    public void allOrderListExample() throws ApiException {
        Long fromId = 1L;
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        Integer limit = 500;
        Long recvWindow = 5000L;
        ApiResponse<AllOrderListResponse> response =
                getApi().allOrderList(fromId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
