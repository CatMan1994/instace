package com.bc.service.Impl;

import com.bc.dao.FileDao;
import com.bc.entity.File;
import com.bc.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileDao fileDao;
    public File getFile(String id) {
        return fileDao.getFile(id);
    }

    public void addFile(File file) {
        fileDao.addFile(file);
    }
}
