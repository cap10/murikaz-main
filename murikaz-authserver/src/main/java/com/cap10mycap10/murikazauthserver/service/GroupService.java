package com.cap10mycap10.murikazauthserver.service;

import com.cap10mycap10.murikazauthserver.exception.ResourceNotFoundException;
import com.cap10mycap10.murikazauthserver.pojo.GroupPojo;
import com.cap10mycap10.murikazauthserver.projection.GroupView;

import java.util.Collection;


public interface GroupService {
    void createGroup(GroupPojo countryPojo);

    void updateGroup(Long id, GroupPojo countryPojo) throws ResourceNotFoundException;

    void deleteGroup(Long id) throws ResourceNotFoundException;

    Collection<GroupView> getGroups();
}
