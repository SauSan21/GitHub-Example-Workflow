package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.TeamMember;


public class TeamNumber extends Team
{
    public TeamNumber(String name)
    {
        super(name);
        createTeamMembers();
    
        // create a new member class for each team member
        // and add it to the team members list
    }
}
