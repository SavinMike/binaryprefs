package com.ironz.binaryprefs.cache;

import java.util.Map;
import java.util.Set;

/**
 * Describes contract which store, fetch and remove cached elements
 */
public interface CacheProvider {

    /**
     * Returns true if value is exists false otherwise
     *
     * @param key target key
     * @return exists condition
     */
    boolean contains(String key);

    /**
     * Puts file to cache, value not might be null
     *
     * @param key   target key
     * @param value target value
     */
    void put(String key, Object value);

    /**
     * Returns all keys inside cache
     *
     * @return keys array
     */
    Set<String> keys();

    /**
     * Returns value by specific key or null if value not exist
     *
     * @param key target key for fetching
     * @return value or null if not exist
     */
    Object get(String key);

    /**
     * Removes specific value from cache by given key
     *
     * @param key target key for remove
     */
    void remove(String key);

    /**
     * Returns all cached key/values.
     * You should never change this map content.
     *
     * @return target cache key/values
     */
    Map<String, Object> getAll();

    /**
     * Returns all filesystem object which are exists into FS
     *
     * @return set of file names exists
     */
    Set<String> candidates();

    /**
     * Returns true if {@code value} is exists in cache candidates {@code false} otherwise
     *
     * @param key target key
     * @return exists condition
     */
    boolean containsCandidate(String key);

    /**
     * Puts candidate name to cache, value not might be null
     *
     * @param key target name
     */
    void putCandidate(String key);

    /**
     * Removes specific value from candidates set by given key
     *
     * @param key target key for remove
     */
    void removeCandidate(String key);
}