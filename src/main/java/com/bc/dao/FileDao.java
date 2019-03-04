package com.bc.dao;

import com.bc.entity.File;

import java.util.List;

public interface FileDao {
    File getFile(String id);
    List<File> getFilesByInstanceId(String instanceId);
    void addFile(File file);
}
