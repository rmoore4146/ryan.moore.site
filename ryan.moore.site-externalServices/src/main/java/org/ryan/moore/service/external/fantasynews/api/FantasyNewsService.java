package org.ryan.moore.service.external.fantasynews.api;

import org.ryan.moore.service.exception.ExternalServiceLayerException;
import org.ryan.moore.service.external.fantasynews.model.FantasyNews;

/**
 * user: ryan.moore
 * date: 10/4/12
 */
public interface FantasyNewsService {

    FantasyNews loadFantasyNews() throws ExternalServiceLayerException;
}
