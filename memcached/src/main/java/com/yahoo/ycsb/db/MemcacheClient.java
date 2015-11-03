/**
 * Memcached client binding for YCSB.
 */

package com.yahoo.ycsb.db;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;
import com.yahoo.ycsb.ByteIterator;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.*;

import net.spy.memcached.MemcachedClient;

public class MemcacheClient extends DB {

    public static final String HOST_PROPERTY = "memcached.server";
    public static final String PORT_PROPERTY = "memcached.port";

    MemcachedClient client;

    public void init() throws DBException {
        Properties props = getProperties();

        String server = props.getProperty("HOST_PROPERTY");
        int port = 11211;

        if (server == null)
            throw new DBException("memcached.server param must be specified");

        try { port = Integer.parseInt(props.getProperty(PORT_PROPERTY)); }
        catch (Exception e) {}

        try {
            client = new MemcachedClient(new InetSocketAddress(server, port));
        } catch (IOException e) { throw new DBException(e); }
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