package com.bc.dao;

import com.bc.entity.InstanceMain;

import java.util.List;

public interface InstanceRingDao {
    void add(InstanceMain instanceMain);
    List<InstanceMain> list();
}
