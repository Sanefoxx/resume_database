package com.sanefox.webapp.storage;

import com.sanefox.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage extends AbstractArrayStorage {

    @Override
    protected void insertElement(Resume r, int index) {
        storage[index] = r;
    }

    @Override
    protected void fillDeletedElement(int index) {
        storage[index] = storage[size];
    }

    protected int checkIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                return i;
            }
        }
        return -1;
    }
}
