package com.yan.model.logging;

import java.io.Serializable;

public class LoggingEventProperty extends LoggingEventPropertyKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event_property.mapped_value
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    private String mappedValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event_property.mapped_value
     *
     * @return the value of logging_event_property.mapped_value
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    public String getMappedValue() {
        return mappedValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event_property.mapped_value
     *
     * @param mappedValue the value for logging_event_property.mapped_value
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    public void setMappedValue(String mappedValue) {
        this.mappedValue = mappedValue == null ? null : mappedValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mappedValue=").append(mappedValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}