package com.github.rnewson.couchdb.lucene.couchdb;

import org.apache.lucene.index.DocValuesType;
//import org.apache.lucene.document.Field;
//import org.apache.lucene.document.FieldType;


public class NumericDocValuesField extends org.apache.lucene.document.Field{
    /**
     * Type for numeric DocValues.
     */
    public static final org.apache.lucene.document.FieldType TYPE = new org.apache.lucene.document.FieldType();
    static {
        TYPE.setDocValuesType(DocValuesType.NUMERIC);
        TYPE.setStored(true);
        TYPE.freeze();
    }

    /**
     * Creates a new DocValues field with the specified 64-bit long value
     * @param name field name
     * @param value 64-bit long value
     * @throws IllegalArgumentException if the field name is null
     */
    public NumericDocValuesField(String name, long value) {
        super(name, TYPE);
        fieldsData = Long.valueOf(value);
    }

}
