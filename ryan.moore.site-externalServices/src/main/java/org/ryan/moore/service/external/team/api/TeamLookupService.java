package org.ryan.moore.service.external.team.api;

import org.ryan.moore.service.exception.ExternalServiceLayerException;
import org.ryan.moore.service.external.team.model.Teams;

import java.util.List;

/**
 * user: ryan.moore
 * date: 10/4/12
 */
public interface TeamLookupService {

    List<Teams> loadNFLTeams() throws ExternalServiceLayerException;
}
