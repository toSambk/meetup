package org.example.soap.client;

import lombok.extern.slf4j.Slf4j;
import org.example.soap.client.gen.GetCountryRequest;
import org.example.soap.client.gen.GetCountryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Slf4j
public class CountryClient extends WebServiceGatewaySupport {


    public GetCountryResponse getCountry(String country) {

        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        log.info("Requesting information for " + country);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        return response;
    }

}