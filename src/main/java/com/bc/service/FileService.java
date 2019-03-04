package com.bc.service;

import com.bc.entity.File;

public interface FileService {
    File getFile(String id);
    void addFile(File file);
}
