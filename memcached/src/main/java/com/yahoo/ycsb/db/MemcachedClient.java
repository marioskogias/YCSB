/**
 * Memcached client binding for YCSB.
 */

package com.yahoo.ycsb.db;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;
import com.yahoo.ycsb.ByteIterator;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Vector;


public class MemcachedClient extends DB {

    public void init() throws DBException {
        System.out.println("Initializing...");
    }

    @Override
    public int read(String table, String key, Set<String> fields,
                    HashMap<String, ByteIterator> result) {
        System.out.println("Reading...");
        return 0;
    }

    @Override
    public int insert(String table, String key, HashMap<String, ByteIterator> values) {

        System.out.println("Inserting...");
        return 0;
    }

    @Override
    public int scan(String table, String startkey, int recordcount, Set<String> fields, Vector<HashMap<String,ByteIterator>> result){
        return 0;
    }

    @Override
    public int update(String table, String key, HashMap<String,ByteIterator> values){
        return 0;
    }
    @Override
    public int delete(String table, String key){
        return 0;
    }
}