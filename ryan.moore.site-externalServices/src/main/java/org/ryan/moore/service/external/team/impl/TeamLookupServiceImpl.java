package org.ryan.moore.service.external.team.impl;

import org.ryan.moore.service.exception.ExternalServiceLayerException;
import org.ryan.moore.service.external.AbstractExternalRestService;
import org.ryan.moore.service.external.team.api.TeamLookupService;
import org.ryan.moore.service.external.team.model.NFLTeamContainer;
import org.ryan.moore.service.external.team.model.Teams;

import java.util.List;

/**
 * user: ryan.moore
 * date: 10/4/12
 */
public class TeamLookupServiceImpl extends AbstractExternalRestService implements TeamLookupService {

    private static final String NFL_TEAMS_URL = "http://api.espn.com/v1/sports/football/nfl/teams?apikey=2sd32ckkcj3es4dk9uzhpmzm";

    public List<Teams> loadNFLTeams() throws ExternalServiceLayerException {

        NFLTeamContainer nflTeamContainer = (NFLTeamContainer) super.doRestServiceCall(NFLTeamContainer.class, NFL_TEAMS_URL);
        return nflTeamContainer.getSports().get(0).getLeagues().get(0).getTeams();
    }
}
