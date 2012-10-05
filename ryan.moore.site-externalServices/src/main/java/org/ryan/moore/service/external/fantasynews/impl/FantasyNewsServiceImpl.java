package org.ryan.moore.service.external.fantasynews.impl;

import org.ryan.moore.service.exception.ExternalServiceLayerException;
import org.ryan.moore.service.external.AbstractExternalRestService;
import org.ryan.moore.service.external.fantasynews.api.FantasyNewsService;
import org.ryan.moore.service.external.fantasynews.model.FantasyNews;

/**
 * user: ryan.moore
 * date: 10/4/12
 */
public class FantasyNewsServiceImpl extends AbstractExternalRestService implements FantasyNewsService {

    private final static String FANTASY_NEWS_URL = "http://api.espn.com/v1/fantasy/football/news?apikey=2sd32ckkcj3es4dk9uzhpmzm";

    public FantasyNews loadFantasyNews() throws ExternalServiceLayerException {

        //Delegate real call to abstract class
        return (FantasyNews) super.doRestServiceCall(FantasyNews.class, FANTASY_NEWS_URL);
    }
}
