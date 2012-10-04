package org.ryan.moore.service.external.fantasynews.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.ryan.moore.service.exception.ExternalServiceLayerException;
import org.ryan.moore.service.external.fantasynews.api.FantasyNewsService;
import org.ryan.moore.service.external.fantasynews.model.FantasyNews;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * user: ryan.moore
 * date: 10/4/12
 */
public class FantasyNewsServiceImpl implements FantasyNewsService {

    private final static String FETCH_URL = "http://api.espn.com/v1/fantasy/football/news?apikey=2sd32ckkcj3es4dk9uzhpmzm";

    public FantasyNews loadFantasyNews() throws ExternalServiceLayerException {

        //init
        URLConnection urlConnection = null;
        JsonReader reader = null;

        //IO stuff
        try {
            urlConnection =  new URL(FETCH_URL).openConnection();
            urlConnection.connect();
            reader = new JsonReader(new InputStreamReader(urlConnection.getInputStream()));
        } catch (IOException e) {
            throw new ExternalServiceLayerException("Exception caught attempting to open URL connection", e);
        }

        //get JsonObject, then automagically parse it with gson
        JsonParser parser = new JsonParser();
        JsonElement rootElement = parser.parse(reader);
        JsonObject pooparray = rootElement.getAsJsonObject();
        Gson myGson = new Gson();

        return myGson.fromJson(pooparray, FantasyNews.class);
    }
}
