package com.bestboke.nettycommons.nettyserializer;

import com.alibaba.fastjson.JSON;

public class JSONSerializer implements Serializer {
    public byte getSerializerAlogrithm() {
        return SerializerAlgorithm.JSON;
    }

    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
