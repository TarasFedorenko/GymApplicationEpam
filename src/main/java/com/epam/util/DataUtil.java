package com.epam.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class DataUtil {

    private DataUtil() {}

    public static <T> void loadDataFromFile(Map<Long, T> map, String filePath, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            T[] dataArray = (T[]) objectMapper.readValue(new File(filePath), clazz);
            for (T data : dataArray) {
                Long id = (Long) data.getClass().getMethod("getId").invoke(data);
                map.put(id, data);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // logging
        } catch (Exception e) {
            e.printStackTrace();
            // logging
        }
    }
}
