package cn.lilingke.commonlibrary.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.List;

/**
 * Gson 工具，解析生产jsonString
 */
public class GsonUtils {

    public static Gson mGson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd")
//            .serializeNulls()
//            .registerTypeAdapterFactory(new NullStringToEmptyAdapterFactory()) //处理对象为空的情况
            .create();


    public static Gson getInstance()
    {
        return mGson;
    }


    public static class NullStringToEmptyAdapterFactory<T> implements TypeAdapterFactory {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {

            Class<T> rawType = (Class<T>) type.getRawType();
            if (rawType != String.class) {
                if(rawType == Double.class)
                    return (TypeAdapter<T>) new DoubleAdapter();
                if(rawType == Long.class)
                    return (TypeAdapter<T>) new LongAdapter();
                if(rawType == Integer.class)
                    return (TypeAdapter<T>) new IntAdapter();
                return null;
            }


            return (TypeAdapter<T>) new StringAdapter();
        }
    }

    public static class StringAdapter extends TypeAdapter<String> {
        public String read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return "";
            }
            return reader.nextString();
        }
        public void write(JsonWriter writer, String value) throws IOException {
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.value(value);
        }
    }


    public static class DoubleAdapter extends TypeAdapter<Double> {
        public Double read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return new Double(0.0);
            }
            return new Double( reader.nextString());
        }
        public void write(JsonWriter writer, Double value) throws IOException {
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.value(value);
        }
    }


    public static class LongAdapter extends TypeAdapter<Long> {
        public Long read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return new Long(0);
            }
            return new Long( reader.nextString());
        }
        public void write(JsonWriter writer, Long value) throws IOException {
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.value(value);
        }
    }


    public static class IntAdapter extends TypeAdapter<Integer> {
        public Integer read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return new Integer(0);
            }
            return new Integer( reader.nextString());
        }
        public void write(JsonWriter writer, Integer value) throws IOException {
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.value(value);
        }
    }



    /**
     * 生产jsonString
     * */
    public static String toJson(Object object)
    {
        return mGson.toJson(object);
    }


    /**
     *
     * jsonString 转 任意类型
     * */
    public  static  <T> T fromJson(String jsonString, Class<T> clazz)
    {
        return  mGson.fromJson(jsonString, clazz);
    }

    /**
     *
     * jsonString 转 任意类型
     * */
    public static <T> List<T> fromJsonList(String jsonString) {
        return  mGson.fromJson(jsonString,new TypeToken<List<T>>(){}.getType());
    }

}
