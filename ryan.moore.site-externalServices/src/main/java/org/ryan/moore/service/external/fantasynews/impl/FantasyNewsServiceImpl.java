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

    public FantasyNews loadFantasyNews() throws ExternalServiceLayerException {

        return (FantasyNews) super.doRestServiceCall(FantasyNews.class);

    }
}
