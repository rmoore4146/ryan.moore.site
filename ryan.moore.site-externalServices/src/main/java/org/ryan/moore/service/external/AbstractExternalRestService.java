package org.ryan.moore.service.external;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.apache.commons.lang.StringUtils;
import org.ryan.moore.service.exception.ExternalServiceLayerException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * user: ryan.moore
 * date: 10/4/12
 */
public abstract class AbstractExternalRestService {

    protected String serviceUrl;
    protected String apiKey;

    protected Object doRestServiceCall(Class clazz) throws ExternalServiceLayerException {

        if (StringUtils.isNotEmpty(serviceUrl) && StringUtils.isNotEmpty(apiKey)) {

            //assemble service url
            String assembledServiceUrl = serviceUrl + apiKey;

            //init
            URLConnection urlConnection = null;
            JsonReader reader = null;

            //IO stuff
            try {
                urlConnection =  new URL(assembledServiceUrl).openConnection();
                urlConnection.connect();
                reader = new JsonReader(new InputStreamReader(urlConnection.getInputStream()));
            } catch (IOException e) {
                throw new ExternalServiceLayerException("Exception caught attempting to open URL connection", e);
            }

            //get JsonObject, then automagically parse it with gson
            JsonParser parser = new JsonParser();
            JsonElement rootElement = parser.parse(reader);
            JsonObject jsonObject = rootElement.getAsJsonObject();
            Gson myGson = new Gson();

            return myGson.fromJson(jsonObject, clazz);
        } else {
            throw new ExternalServiceLayerException("Service URL or Api Key was null/empty");
        }
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
