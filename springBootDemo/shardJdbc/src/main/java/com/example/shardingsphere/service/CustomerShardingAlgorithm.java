package com.example.shardingsphere.service;

import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Hemant
 * @date 2024/11/06
 **/
public class CustomerShardingAlgorithm implements ComplexKeysShardingAlgorithm<Integer> {

    @Override
    public Collection<String> doSharding(Collection<String> collection, ComplexKeysShardingValue<Integer> complexKeysShardingValue) {
        Collection<String> result = new HashSet<>();
        String logicTableName = complexKeysShardingValue.getLogicTableName();
        Map<String, Collection<Integer>> columnNameAndShardingValuesMap = complexKeysShardingValue.getColumnNameAndShardingValuesMap();
        columnNameAndShardingValuesMap.forEach((k,v)->{
           if("order_id".equals(k)){

           }else if("customer_id".equals(k)){

           }else {
               throw new RuntimeException("Unknown column name: " + k);
           }
        });

        return result;
    }

}
