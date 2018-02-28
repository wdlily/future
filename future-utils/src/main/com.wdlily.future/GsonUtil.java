package com.wdlily.future;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class GsonUtil {

    private GsonUtil() {
    }

    private static Gson gson = null;

    static {
        if (gson == null) {
            gson = new Gson();
        }
    }

    /**
     * 对象转string
     *
     * @param object
     * @return
     */
    public static String toJson(Object object) {

        return gson.toJson(object);
    }

    /**
     * 字符串转bean
     *
     * @param str
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T gsonToBean(String str, Class<T> cls) {
        T t = null;
        try {
            if (gson != null) {
                t = gson.fromJson(str, cls);
            }
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 转成list
     * 泛型在编译期类型被擦除导致报错
     *
     * @param str
     * @param cls
     * @return
     */
    public static <T> List<T> gsonToList(String str, Class<T> cls) {
        List<T> list = null;
        if (gson != null) {
            list = gson.fromJson(str, new TypeToken<List<T>>() {
            }.getType());
        }
        return list;
    }


    /**
     * 转成list
     * 解决泛型问题
     *
     * @param json
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonToList(String json, Class<T> cls) {
        Gson gson = new Gson();
        List<T> list = new ArrayList<T>();
        JsonArray array = new JsonParser().parse(json).getAsJsonArray();
        for (final JsonElement elem : array) {
            list.add(gson.fromJson(elem, cls));
        }
        return list;
    }


    /**
     * 转成list中有map的
     *
     * @param str
     * @return
     */
    public static <T> List<Map<String, T>> GsonToListMaps(String str) {
        List<Map<String, T>> list = null;
        if (gson != null) {
            list = gson.fromJson(str,
                    new TypeToken<List<Map<String, T>>>() {
                    }.getType());
        }
        return list;
    }


    /**
     * 转成map的
     *
     * @param str
     * @return
     */
    public static <T> Map<String, T> GsonToMaps(String str) {
        Map<String, T> map = null;
        if (gson != null) {
            map = gson.fromJson(str, new TypeToken<Map<String, T>>() {
            }.getType());
        }
        return map;
    }

}
