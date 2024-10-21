package com.pacvue.h10.customer.api.infrastructure.util;

import jakarta.annotation.Resource;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author wei.luo@pacvue.com
 * @date 2024/4/23 17:28
 */
@Component
public class RedisService {

  /**
   * key operations.
   */
  @Resource
  private RedisTemplate<String, Object> redisTemplate;

  public Boolean hasKey(String key) {
    return redisTemplate.hasKey(key);
  }

  public DataType getType(String key) {
    return redisTemplate.type(key);
  }

  public void delete(String key) {
    redisTemplate.delete(key);
  }

  /**
   * String operations.
   *
   * @param key   Redis key
   * @param value Redis value
   */

  public void setKey(String key, Object value) {
    redisTemplate.opsForValue().set(key, value);
  }

  public String getKey(String key) {
    return (String) redisTemplate.opsForValue().get(key);
  }

  public void getMultiKey(Collection<String> keys) {
    redisTemplate.opsForValue().multiGet(keys);
  }

  public void setWithExpire(String key, Object value, long expire, TimeUnit unit) {
    redisTemplate.opsForValue().set(key, value, expire, unit);
  }

  public Boolean setIfAbsentWithExpire(String key, String value, long ttl, TimeUnit unit) {
    Boolean result = redisTemplate.opsForValue().setIfAbsent(key, value, ttl, unit);
    return result != null ? result : false;
  }

  public Boolean setIfPresentWithExpire(String key, String value, long ttl, TimeUnit unit) {
    Boolean result = redisTemplate.opsForValue().setIfPresent(key, value, ttl, unit);
    return result != null ? result : false;
  }

  public Integer appendValue(String key, String value) {
    return redisTemplate.opsForValue().append(key, value);
  }

  public Boolean expireKey(String key, String value, long ttl, TimeUnit unit) {
    return redisTemplate.expire(key, ttl, unit);
  }

  public Long getValueSize(String key) {
    return redisTemplate.opsForValue().size(key);
  }

  public void increment(String key, long delta) {
    redisTemplate.opsForValue().increment(key, delta);
  }

  /**
   * hash operations
   */

  public Object getHash(String key, String field) {
    return redisTemplate.opsForHash().get(key, field);
  }

  public Map<Object, Object> getHashAll(String key) {
    return redisTemplate.opsForHash().entries(key);
  }

  public List<Object> getMultiHash(String key, Collection<Object> fields) {
    return redisTemplate.opsForHash().multiGet(key, fields);
  }

  public void putHash(String key, String hashKey, String hashValue) {
    redisTemplate.opsForHash().put(key, hashKey, hashValue);
  }

  public void putHashAll(String key, Map<String, String> maps) {
    redisTemplate.opsForHash().putAll(key, maps);
  }

  public long deleteHash(String key, Object... fields) {
    return redisTemplate.opsForHash().delete(key, fields);
  }

  /**
   * list operations
   */
  public Object getListItemByIndex(String key, Long index){
    return redisTemplate.opsForList().index(key, index);
  }

  public void rPushList(String key, String value, Long ttl, TimeUnit unit) {
    redisTemplate.opsForList().rightPush(key, value);
    redisTemplate.expire(key, ttl, unit);
  }

  public void rPushAll(String key, String value, Long ttl, TimeUnit unit) {
    redisTemplate.opsForList().rightPushAll(key, value);
    redisTemplate.expire(key, ttl, unit);
  }

  public void lPushList(String key, String value, Long ttl, TimeUnit unit) {
    redisTemplate.opsForList().leftPush(key, value);
    redisTemplate.expire(key, ttl, unit);
  }

  public void lPushAll(String key, String value, Long ttl, TimeUnit unit) {
    redisTemplate.opsForList().leftPushAll(key, value);
    redisTemplate.expire(key, ttl, unit);
  }

  public List<Object> getListByRange(String key, long start, long end){
    return redisTemplate.opsForList().range(key, start, end);
  }

  public Long getListSize(String key){
    return redisTemplate.opsForList().size(key);
  }

  /**
   * set operations
   */
  public Long addValuesToSet(String key, String... values) {
    return redisTemplate.opsForSet().add(key, values);
  }

  public Long removeValuesFromSet(String key, String... values) {
    return redisTemplate.opsForSet().remove(key, values);
  }

  public Long getSetSize(String key) {
    return redisTemplate.opsForSet().size(key);
  }

  public Boolean isSetMember(String key, String value) {
    return redisTemplate.opsForSet().isMember(key, value);
  }

  public Set<Object> getSetMembers(String key) {
    return redisTemplate.opsForSet().members(key);
  }

  public void putValuesToSet(String key, Set<String> values) {
    redisTemplate.opsForSet().add(key, values);
  }

  public void deleteSetValue(String key, String value) {
    redisTemplate.opsForSet().remove(key, value);
  }

}
