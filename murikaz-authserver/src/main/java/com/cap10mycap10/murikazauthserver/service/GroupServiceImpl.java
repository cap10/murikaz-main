package com.cap10mycap10.murikazauthserver.service;

import com.cap10mycap10.murikazauthserver.exception.ResourceNotFoundException;
import com.cap10mycap10.murikazauthserver.pojo.GroupPojo;
import com.cap10mycap10.murikazauthserver.projection.GroupView;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GroupServiceImpl implements GroupService {
    @Override
    public void createGroup(GroupPojo countryPojo) {

    }

    @Override
    public void updateGroup(Long id, GroupPojo countryPojo) throws ResourceNotFoundException {

    }

    @Override
    public void deleteGroup(Long id) throws ResourceNotFoundException {

    }

    @Override
    public Collection<GroupView> getGroups() {
        return null;
    }
}
