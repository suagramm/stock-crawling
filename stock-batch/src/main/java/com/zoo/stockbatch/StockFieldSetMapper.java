package com.zoo.stockbatch;

import com.zoo.stockcommon.domain.Stock;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

public class StockFieldSetMapper implements FieldSetMapper<Stock> {
    public Stock mapFieldSet(FieldSet fieldSet){
        Stock stock = new Stock();

        stock.setCode(fieldSet.readString(0));
        stock.setDate(fieldSet.readString(1));
        stock.setPrice(fieldSet.readString(2));

        return stock;
    }

}

